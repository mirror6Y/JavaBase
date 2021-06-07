package cn.mirror6.io.directory;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author mirror6
 * @description
 * @create 2021-06-06 6:20 下午
 */
public class BufferOutputStreamTest {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/mirror6/IdeaProjects/JavaBase/file/bufferOut.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String s = "abc";
            //内容没超过8k会写在缓冲区
            bos.write(s.getBytes(StandardCharsets.UTF_8));
            //close包含flush方法,会把数据刷到磁盘
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
