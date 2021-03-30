package regex;

import java.util.regex.*;

/*
量词
 */
public class Demo2 {
    public static void main(String[] args) {
        String regex1 = ".*foo";//贪婪型
        String regex2 = ".*?foo";//勉强型
        String regex3 = ".*+foo";//占有型
        String regex4 = "<.+>";
        String regex5 = "<.+?>";
        String regex6 = "<.++>";
        String str = "<aaa<bbb>ccc<dddd>eee>";
        Pattern pattern = Pattern.compile(regex6);
        Matcher matcher = pattern.matcher(str);
        boolean matchesFlag = false;
        while (matcher.find()) {
            System.out.println("找到一个" + matcher.group() + " 定位：(" + matcher.start() +","+matcher.end()+")");
            matchesFlag = true;
        }
        if (!matchesFlag) {
            System.out.println("find失败");
        }
    }
}
