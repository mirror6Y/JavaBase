package cn.mirror6.io.directory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 6:45 下午
 */
public class ObjectInputStreamTest {

    public static void main(String[] args) {
        try {
            //创建对象流
            FileInputStream fis = new FileInputStream("/Users/mirror6/IdeaProjects/JavaBase/file/Student.bin");
            ObjectInputStream ois=new ObjectInputStream(fis);
            //读取文件(反序列化)
            Object o = ois.readObject();
            ois.close();
            System.out.println(o.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
