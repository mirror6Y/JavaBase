package cn.mirror6.io.directory.lister;

import java.io.File;
import java.util.Arrays;

/**
 * @author mirror6
 * @description file类的作用：代表一个文件或者一个目录下一组文件的名称
 * @createTime 2020/4/30 10:39
 */
public class UseFile {

    public static void main(String[] args) {
        File file = new File("D:\\AGit\\JavaBase\\src\\main\\java\\cn\\mirror6\\string");
        String[] list = file.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
