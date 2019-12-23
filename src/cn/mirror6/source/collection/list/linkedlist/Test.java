/**
 *
 */
package cn.mirror6.source.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 *@author mirror6
 *@description
 *@createTime 2019/12/20 15:33
 */
public class Test {

    public static void main(String[] args) {

        List list=new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.toString());
//        list.remove();
//        Object s=((LinkedList) list).remove();
        boolean aBoolean=list.remove("4");
        System.out.println(list.toString());
//        System.out.println(s);
//        list.remove

//        List list1=new ArrayList();
//        list1.add("a");
//        list1.add("b");
//        list1.add("c");
//        list1.add("d");
//        System.out.println(list1.toString());
//        ((ArrayList)list1).remove();
    }
}
