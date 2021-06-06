package cn.mirror6.io.directory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 3:38 下午
 */
public class FileOutputStreamTest {

    public static void main(String[] args) {
        try {
            FileOutputStream os=new FileOutputStream("/Users/mirror6/IdeaProjects/JavaBase/file/out.txt");
            String s="hello";
            os.write(s.getBytes(StandardCharsets.UTF_8));
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
