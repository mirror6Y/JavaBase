package cn.mirror6.abstatic;

/**
 * @author mirror6
 * @date 2019/7/8 21:49
 */

public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            System.out.println(i+SingletonOfLazy.getSingleton().toString());
        }
    }
}
