package cn.mirror6.io.directory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 6:03 下午
 */
public class BufferInputStreamTest {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/mirror6/IdeaProjects/JavaBase/file/bufferIn.txt");
            BufferedInputStream bfs = new BufferedInputStream(fis);
            byte[] bytes = new byte[1024];
            int count;
            while (-1 != (count = bfs.read(bytes))) {
                System.out.println(new String(bytes, 0, count));
            }
            bfs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
