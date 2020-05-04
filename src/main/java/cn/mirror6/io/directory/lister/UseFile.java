package cn.mirror6.io.directory.lister;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author mirror6
 * @description file类的作用：代表一个文件或者一个目录下一组文件的名称
 * @createTime 2020/4/30 10:39
 */
public class UseFile {

    public static void main(String[] args) {
        String url = "F:\\Agithub\\JavaBase";
        String regx = ".*md.*";
        Pattern pattern = Pattern.compile(regx);
        File file = new File(url);
        String[] list;
        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(new DirFilter(pattern));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
