package cn.mirror6.io.directory;

import java.io.*;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 6:51 下午
 */
public class ObjectOutputStreamTest {

    public static void main(String[] args) {
        try {
            //创建对象流
            FileOutputStream fos = new FileOutputStream("/Users/mirror6/IdeaProjects/JavaBase/file/Student.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //序列化
            Student student = new Student("刘德华", 55);
            oos.writeObject(student);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
