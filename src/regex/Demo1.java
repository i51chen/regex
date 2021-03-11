package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    /*限定符
    ?   匹配0个或1个
    *   匹配0或更多
    +   匹配1或更多
    {}  限定出现次数
    {x,y} 限定出现范围，无则未无穷 {2，}
    | 或  t(ab|ap)
    ()  group

    字符类
    [ab]    只能取自于方括号 [a-z] 所有小写字母  [A-Z] 所有大写 [a-zA-Z]
    [0-9]   所有数字
    ^   取反  [^0-9]

    \d 数字
    \w 字母数字下划线
    \s space & tab
    \D 非数字
    \W 非字母
    \S 非空白
    . 任意
    ^ 单词行首 start
    $ 单纯行尾 end

    \b 边界，单词边界
     */
    public static void main(String[] args) {
        // 按指定模式在字符串查找
//        String line = "This order was placed for QT3000! OK?";
//        String pattern = "(\\D*)(\\d+)(.*)";

//        // 创建 Pattern 对象
//        Pattern r = Pattern.compile(pattern);
//
//        // 现在创建 matcher 对象
//        Matcher m = r.matcher(line);
//        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0) );
//            System.out.println("Found value: " + m.group(1) );
//            System.out.println("Found value: " + m.group(2) );
//            System.out.println("Found value: " + m.group(3) );
//        } else {
//            System.out.println("NO MATCH");
//        }
        String str = "\t";
        String regex = "\\s"; //\r  \n
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
//        boolean flag = pattern.matches(regex,str);
//        boolean flag = matcher.matches();
//        System.out.println(flag);
//        System.out.println(str);
//        System.out.println(pattern.pattern());

        boolean findFlag = matcher.find();
        System.out.println("result: " + findFlag);
        System.out.println("str:    " + str);
        System.out.println("regex:  " + pattern.pattern());
        if (findFlag) {
            System.out.println(matcher.group());
        }
    }
}
