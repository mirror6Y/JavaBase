package cn.mirror6.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: Iterator遍历
 * @Author: mirror6
 * @Date: 2020/7/12 19:20
 */
public class IteratorDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
