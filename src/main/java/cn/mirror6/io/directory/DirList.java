package cn.mirror6.io.directory;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @description: 查看目录下的内容
 * @author: ai lun
 * @create: 2021-06-03 17:19
 **/
public class DirList {

    static class DirFile implements FilenameFilter {

        private Pattern pattern;

        public DirFile(String regex) {
            this.pattern = Pattern.compile(regex);
        }

        @Override
        public boolean accept(java.io.File dir, String name) {
            return pattern.matcher(name).matches();
        }
    }

    public static void main(String[] args) {
        File path = new File("/Users/byai/IdeaProjects");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFile(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);

        }
    }
}
