package cn.mirror6.jvm;

import cn.mirror6.source.collection.list.ArrayList;

import java.util.List;

/**
 * @author mirror6
 * @date 2019/12/5 18:45
 */
public class Heap {
    static class OomObject {

    }

    public static void main(String[] args) {
        List<OomObject> list = new ArrayList<OomObject>();
        while (true)
        {
            list.add(new OomObject());
        }
    }
}
