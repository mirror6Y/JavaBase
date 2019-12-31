package cn.mirror6.source.map.hashmap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * @author mirror6
 * @description
 * @createTime 2019/12/26 15:27
 */
public class HashMapTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void hash() {
    }

    @Test
    public void test(){
        Map<String, String> hashMap= new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("2","b");
        hashMap.put("3","c");
        hashMap.put("4","d");
        System.out.println(hashMap.toString());

        System.out.println(hashMap.get("1").hashCode());
        System.out.println(hashMap.get("2").hashCode());
        System.out.println(hashMap.get("3").hashCode());
        System.out.println(hashMap.get("4").hashCode());
    }
}