package cn.mirror6;

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/9/17 1:37
 */
public class Test {

    int res() {
        try {
            return 1;
        } catch (Exception e) {
            int[] a = new int[0];
            a[1] = 1;
            return 2;
        } finally {
            return 3;
        }
    }

    void print() {
        try {
            System.out.println(1);
        } catch (Exception e) {
            Test test = null;
            test.res();
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.print();
//        System.out.println(test.res());
    }
}
