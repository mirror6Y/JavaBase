package cn.mirror6.source.mybatis.demo1basis;

import cn.mirror6.source.mybatis.entity.User;
import com.google.common.collect.Maps;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 用户接口
 */
interface UserMapper {

    /**
     * 用户列表
     *
     * @return 结果
     */
    @Select("select account,name from system_user where id=#{id}")
    List<User> selectUserList(Long id);
}

/**
 * @Description: 动态代理
 * @Author: mirror6
 * @Date: 2020/8/1 0:00
 */
public class Proxy {

    public static void main(String[] args) {
        UserMapper userMapper = (UserMapper) java.lang.reflect.Proxy.newProxyInstance(Proxy.class.getClassLoader(), new Class<?>[]{UserMapper.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Select select = method.getAnnotation(Select.class);
                Map<String, Object> methodAndArgs = buildMethodAndArgs(method, args);
                if (select != null) {
                    String[] val = select.value();
                    String sql = parseSql(val[0], methodAndArgs);
                    System.out.println(sql);
                }
                return null;
            }
        });
        userMapper.selectUserList(1285907160082227202L);
    }

    public static String parseSql(String sql, Map<String, Object> methodAndArgs) {
        String parseSql = "";
        StringBuilder builder = new StringBuilder();
        int length = sql.length();
        for (int i = 0; i < length; i++) {
            char c = sql.charAt(i);
            if (c == '#') {
                int nextIndex = i + 1;
                char nextChar = sql.charAt(nextIndex);
                if (nextChar != '{') {
                    throw new RuntimeException(String.format("这里应该为#{\nsql:%s\nindex:%d}", builder.toString(), nextIndex));
                }
                StringBuilder param = new StringBuilder();
                i = parseSqlArgs(param, sql, nextIndex);
                String argName = param.toString();
                Object argValue = methodAndArgs.get(argName);
                if (argValue == null) {
                    throw new RuntimeException(String.format("找不到参数值:%s", argName));
                }
                builder.append(argValue.toString());

                continue;
            }
            builder.append(c);
        }
        return builder.toString();
    }

    private static int parseSqlArgs(StringBuilder param, String sql, int nextIndex) {
        nextIndex++;
        for (; nextIndex < sql.length(); nextIndex++) {
            char c = sql.charAt(nextIndex);
            if (c != '}') {
                param.append(c);
                continue;
            }
            if (c == '}') {
                return nextIndex;
            }
        }
        throw new RuntimeException(String.format("缺少右括号 \nindex:%d", nextIndex));
    }

    public static Map<String, Object> buildMethodAndArgs(Method method, Object[] args) {
        Map<String, Object> map = Maps.newHashMap();
        Parameter[] parameters = method.getParameters();
        int index[] = {0};
        Arrays.asList(parameters).forEach(parameter -> {
            String name = parameter.getName();
            System.out.println(name);
            map.put(name, args[index[0]]);
            index[0]++;
        });
        return map;
    }
}
