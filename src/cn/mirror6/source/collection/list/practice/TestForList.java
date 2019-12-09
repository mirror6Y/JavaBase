package cn.mirror6.source.collection.list.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author mirror6
 * @description
 * @createTime 2019/12/9 13:57
 */
public class TestForList {


    private static void add() {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("d");
        System.out.println("第一次执行:" + list);
        list.add(2, "c");
        System.out.println("第二次次执行:" + list);
        list.set(2, "3");
        System.out.println("第三次次执行:" + list);
        List<String> strings = new ArrayList<String>();
        strings.addAll(list);
        System.out.println("第一次执行addAll:" + strings);
        strings.addAll(1, Collections.singleton("1"));
        System.out.println("第二次执行addAll:" + strings);
    }

    private static void remove(List list) {
        for (int i = 0; i < list.size(); i++)
        {
            list.remove(i);
            System.out.println("i:" + i + ",list:" + list);
        }
    }

    private static void remove2(List list) {
        //list转成迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Integer integer = iterator.next();
            iterator.remove();
            System.out.println("list:" + list);
        }
    }

    private static void iterator() {

    }

    public static void main(String[] args) {
        TestForList.add();
        System.out.println("---------分割------------");
        List list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        TestForList.remove(list);
        System.out.println("---------分割------------");
        List list1 = new ArrayList();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        TestForList.remove2(list1);
    }

}
