package cn.mirror6.string;

/**
 * @author mirror6
 * @description 字符串是否可变，可以通过输出内存地址和javap反编译来验证
 * @createTime 2020/4/28 11:52
 */
public class Variety {


    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        System.out.println("地址：" + System.identityHashCode(s));
        s += "world";
        System.out.println(s);
        System.out.println("地址：" + System.identityHashCode(s));
        final String var="1";
        System.out.println(var);
    }
}
