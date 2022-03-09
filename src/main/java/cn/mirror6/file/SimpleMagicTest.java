package cn.mirror6.file;

import com.j256.simplemagic.ContentInfo;
import com.j256.simplemagic.ContentInfoUtil;

/**
 * @author ai lun
 * @description
 * @create 2022-03-09 4:03 下午
 */
public class SimpleMagicTest {

    public static void main(String[] args) {
        //注意：如果是不支持的格式，返回的ContentInfo为null，调用getMimeType()时会导致空指针异常
        ContentInfo info1 = ContentInfoUtil.findExtensionMatch("biz/aicrm/file/cd0b8c90-9f7c-11ec-8f88-dd631d7c2096/1638252375097-头像1d4a47d9b9a2a2a534d345059d05c330ccbc9c6f6a1d955f37cf0e008fddd571.png");
        ContentInfo info2 = ContentInfoUtil.findExtensionMatch("123.mp4");
        String contentType1 = info1.getMimeType();
        String contentType2 = info2.getMimeType();
        System.out.println(contentType1);
        System.out.println(contentType2);

    }
}
