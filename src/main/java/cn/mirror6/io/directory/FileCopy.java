package cn.mirror6.io.directory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 3:47 下午
 */
public class FileCopy {

    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("/Users/mirror6/IdeaProjects/JavaBase/file/a.mp4");
            FileOutputStream os = new FileOutputStream("/Users/mirror6/IdeaProjects/JavaBase/file/b.mp4");
            byte[] bytes = new byte[1024];
            int count;
            while (-1 != (count = is.read(bytes))) {
                os.write(bytes, 0, count);
            }
            is.close();
            os.close();
            System.out.println("复制完成.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
