package cn.mirror6.string;

/**
 * @author mirror6
 * @description 比较String、StringBuffer和StringBuilder的效率
 * @createTime 2020/4/28 15:45
 */
public class Effectiveness {

    private static String BASE_INFO = "test";
    private static int count = 200000;

    private void useString() {
        String str = BASE_INFO;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            str += "add";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String用时：" + (endTime - startTime) + "ms");
    }

    private void useStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer(BASE_INFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuffer.append("add");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer用时：" + (endTime - startTime) + "ms");
    }

    private void useStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder(BASE_INFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuilder.append("add");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder：" + (endTime - startTime) + "ms");
    }


    public static void main(String[] args) {
        Effectiveness effectiveness = new Effectiveness();
        effectiveness.useString();
        effectiveness.useStringBuffer();
        effectiveness.useStringBuilder();
    }
}
