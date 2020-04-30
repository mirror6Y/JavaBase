package cn.mirror6.io.directory.lister;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * @author mirror6
 * @description 把accept方法提供给list方法使用
 * @createTime 2020/4/30 11:27
 */
public class DirFilter implements FilenameFilter {

    /**
     * 正则表达式
     */
    private Pattern pattern;

    DirFilter(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
