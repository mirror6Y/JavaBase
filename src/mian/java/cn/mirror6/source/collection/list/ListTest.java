package cn.mirror6.source.collection.list;


import cn.mirror6.source.collection.list.linkedlist.LinkedList;
import cn.mirror6.source.map.hashmap.HashMap;

import java.util.*;

/**
 * @author mirror6
 * @date 2019/9/9 18:44
 */
public class ListTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("e");
        list.add("b");
        list.add("g");
        list.add("f");
        list.add("k");
        list.add("i");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------TreeSet-----------------------");
        Set<String> set = new TreeSet<>(list);
        List sortList = new ArrayList(set);
        for (Object o : sortList) {
            System.out.println(o);
        }
        System.out.println("-----------------HashSet-----------------------");
        Set<String> hash = new HashSet<>(list);
        List hashList = new ArrayList(hash);
        for (Object object : hashList) {
            System.out.println(object);
        }
    }


}
