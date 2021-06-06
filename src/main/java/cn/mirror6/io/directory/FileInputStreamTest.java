package cn.mirror6.io.directory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 2:34 下午
 */
public class FileInputStreamTest {

    public static void main(String[] args) {
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream("/Users/mirror6/IdeaProjects/JavaBase/file/input.txt");
            FileInputStreamTest test = new FileInputStreamTest();
            System.out.println(fileInputStream.available());
//            test.print(fileInputStream);
            test.print1(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void print(InputStream is) throws IOException {
        //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
        int data;
        while ((data = is.read()) != -1) {
            System.out.println((char) data);
        }
    }

    void print1(InputStream is) throws IOException {
        byte[] bytes = new byte[1024];
        int data;
        while ((data = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, data));
        }
    }

}
