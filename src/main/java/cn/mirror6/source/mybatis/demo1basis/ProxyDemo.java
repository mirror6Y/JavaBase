package cn.mirror6.source.mybatis.demo1basis;

import java.lang.reflect.Method;

/**
 * 测试接口
 */
interface Test {
    /**
     * 说
     */
    public void say();
}

interface InvokeHandler {
    /**
     * @param o
     * @param method
     * @param arg
     * @return
     */
    Object invoke(Object o, Method method, Object... arg);
}

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/8/2 16:47
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void say() {

            }
        };
    }

    public Test createProxyInstance(final InvokeHandler handler, final Class<?> c) {
        return new Test() {
            @Override
            public void say() {
                try {
                    Method say = c.getMethod("say");
                    handler.invoke(this, say);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

}
