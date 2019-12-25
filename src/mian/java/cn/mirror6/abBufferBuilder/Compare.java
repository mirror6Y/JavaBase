package cn.mirror6.abBufferBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mirror6
 * @date 2019/6/30 16:24
 */
public class Compare {


    private static String BASEINFO = "Mr.Y";
    private static final int COUNT = 2000000;

    /**
     * 执行一项String赋值测试
     */
    private static void doStringTest() {

        String str = new String(BASEINFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT / 100; i++)
        {
            str = str + "miss";
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)
                + " millis has cost when used String.");
    }

    /**
     * 执行一项StringBuffer赋值测试
     */
    private static void doStringBufferTest() {

        StringBuffer sb = new StringBuffer(BASEINFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++)
        {
            sb = sb.append("miss");
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)
                + " millis has cost when used StringBuffer.");
    }

    /**
     * 执行一项StringBuilder赋值测试
     */
    private static void doStringBuilderTest() {

        StringBuilder sb = new StringBuilder(BASEINFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++)
        {
            sb = sb.append("miss");
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)
                + " millis has cost when used StringBuilder.");
    }

    /**
     * 测试StringBuffer遍历赋值结果
     */
    private static void doStringBufferListTest(List<String> mList) {
        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (String string : mList)
        {
            sb.append(string);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(sb.toString() + "buffer cost:"
                + (endTime - startTime) + " millis");
    }

    /**
     * 测试StringBuilder迭代赋值结果
     */
    private static void doStringBuilderListTest(List<String> mList) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (Iterator<String> iterator = mList.iterator(); iterator.hasNext(); )
        {
            sb.append(iterator.next());
        }

        long endTime = System.currentTimeMillis();
        System.out.println(sb.toString() + "builder cost:"
                + (endTime - startTime) + " millis");
    }

    public static void main(String[] args) {
        doStringTest();
        doStringBufferTest();
        doStringBuilderTest();

        List<String> list = new ArrayList<>();
        list.add(" I ");
        list.add(" like ");
        list.add(" BeiJing ");
        list.add(" tian ");
        list.add(" an ");
        list.add(" men ");
        list.add(" . ");

        doStringBufferListTest(list);
        doStringBuilderListTest(list);
    }


}
