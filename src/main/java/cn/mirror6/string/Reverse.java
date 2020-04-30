package cn.mirror6.string;

/**
 * @author mirror6
 * @description 将字符串进行反转
 * @createTime 2020/4/28 15:32
 */
public class Reverse {


    /**
     * 通过char数组来转换
     */
    private String reverse(String param) {
        char[] a = param.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = param.length() - 1; i >= 0; i--) {
            stringBuilder.append(a[i]);
        }
        return stringBuilder.toString();
    }

    /**
     * 通过字符串缓冲区的reverse方法
     */
    private String reverse1(String param) {
        StringBuilder stringBuilder = new StringBuilder(param);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse("hello"));
        System.out.println(reverse.reverse1("world"));
    }
}
