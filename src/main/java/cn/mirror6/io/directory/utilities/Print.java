package cn.mirror6.io.directory.utilities;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author mirror6
 * @description 打印机
 * @createTime 2020/4/30 16:01
 */
public class Print {

    /**
     * 对集合进行格式化
     *
     * @param c 集合
     * @return String
     */
    public static String format(Collection c) {
        if (c.size() == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        for (Object elem : c) {
            if (c.size() != 1) {
                result.append(elem);
            }
        }
        if (c.size() != 1) {
            result.append("\n");
        }
        result.append("]");
        return result.toString();
    }

    public static void print(Collection c) {
        System.out.println(format(c));
    }

    public static void print(Object[] objects) {
        System.out.println(format(Arrays.asList(objects)));
    }
}
