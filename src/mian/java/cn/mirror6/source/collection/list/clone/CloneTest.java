/**
 *
 */
package cn.mirror6.source.collection.list.clone;

/**
 *@author mirror6
 *@description
 *@createTime 2019/12/18 14:51
 */
public class CloneTest {

    public static void main(String[] args) {
        ShallowClone clone = new ShallowClone();
        System.out.println(clone.a);
        try {
            ShallowClone shallowClone = new ShallowClone().clone();
            shallowClone.setS("hello");
            System.out.println("clone:" + clone.getA());
            System.out.println("shallowClone:" + shallowClone.getA());
            System.out.println("clone地址："+System.identityHashCode(clone));
            System.out.println("cloneS地址："+System.identityHashCode(clone.getS()));
            System.out.println("cloneA地址："+System.identityHashCode(clone.getA()));
            System.out.println("shallowClone地址："+System.identityHashCode(shallowClone));
            System.out.println("shallowCloneS地址："+System.identityHashCode(shallowClone.getS()));
            System.out.println("shallowCloneA地址："+System.identityHashCode(shallowClone.getA()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
