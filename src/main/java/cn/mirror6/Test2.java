package cn.mirror6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Objects;

/**
 * @author ai lun
 * @description
 * @create 2022-03-24 5:46 下午
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            //上传文件到企微
            System.out.println(2 / 0);
        } finally {
            try {
                //IO流关闭处理
                System.out.println(2 / 0);
            } catch (Exception e) {
                throw new RuntimeException("关闭IO流异常");
            }
        }
    }

}
