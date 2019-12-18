package cn.mirror6.source.collection.list.clone;

import lombok.Data;

/**
 * @author mirror6
 * @description 编写一个浅拷贝的对象
 * @createTime 2019/12/18 14:08
 */
@Data
public class ShallowClone implements Cloneable {

    int a = 1;
    String s = "shallow";

    @Override
    public ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }
}
