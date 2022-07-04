package cn.mirror6;

/**
 * @author ai lun
 * @description
 * @create 2022-03-24 8:00 下午
 */
public class MyfinallyReadLineThrow {

    public void close() throws Exception {
        throw new Exception("close");
    }

    public void readLine() throws Exception {
        throw new Exception("readLine");
    }
}
