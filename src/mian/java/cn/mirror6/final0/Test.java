package cn.mirror6.final0;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author mirror6
 * @description
 * @createTime 2020/1/6 9:54
 */
@Setter
@Getter
@NoArgsConstructor
public class Test {

    final static String string = "hello";
    String string1 = "hello";
    String string2 = "hello";
    String s1=new String("world");
    String s2=new String("world");
    int a = 1;
    String s=null;

    public Test(String string1) {
        this.string1 = string1;
    }

    public static void main(String[] args) {

        List list=new ArrayList(5);
        List list1=new LinkedList();
        List list2=new Vector();
        System.out.println(System.identityHashCode(new Test().getString1()));
        System.out.println(System.identityHashCode(new Test().getString2()));
        System.out.println(System.identityHashCode(new Test().getS1()));
        System.out.println(System.identityHashCode(new Test().getS2()));
    }
}
