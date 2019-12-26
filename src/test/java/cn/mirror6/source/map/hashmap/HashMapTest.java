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
        hashMap.put("a","a");
        hashMap.put("b","b");
        hashMap.put("c","c");
        hashMap.put("d","d");
        System.out.println(hashMap.toString());
    }
}