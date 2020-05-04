package cn.mirror6.io.directory.utilities;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author mirror6
 * @description 收集符合正则表达式的文件
 * @createTime 2020/4/30 14:28
 */
public final class Directory {

    /**
     * 符合正则的文件数组
     */
    public static File[] local(File dir, final String regex) {

        return dir.listFiles(new FilenameFilter() {

            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }

        });
    }

    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {

        List<File> files = new ArrayList<>();
        List<File> dirs = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override
        public String toString() {
            return "dirs:" + Print.format(dirs) + "\n\n files:" + Print.format(files);
        }

    }

    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    /**
     * 遍历目录，收集数据
     *
     * @param startDir 目录
     * @param regex    正则表达式
     * @return TreeInfo
     */
    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else {
                if (item.getName().matches(regex)) {
                    result.files.add(item);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(args.length);
        if (args.length == 0) {
            System.out.println(walk("F:\\Agithub\\CityMis"));
        } else {
            for (String arg : args) {
                System.out.println(walk(arg));
            }
        }
    }
}
