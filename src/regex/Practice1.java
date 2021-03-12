package regex;

import java.util.regex.*;

public class Practice1 {
    public static void main(String[] args) {
        String str = "00.23";
        //年月日
//        String regex = "^((((1[6-9]|[2-9]\\d)\\d{2})(\\/|\\-)(0?[13578]|1[02])(\\/|\\-)(0?[1-9]|[12]\\d|3[01]))" +
//                "|(((1[6-9]|[2-9]\\d)\\d{2})(\\/|\\-)(0?[13456789]|1[012])(\\/|\\-)(0?[1-9]|[12]\\d|30))" +
//                "|(((1[6-9]|[2-9]\\d)\\d{2})(\\/|\\-)0?2(\\/|\\-)(0?[1-9]|1\\d|2[0-8]))" +
//                "|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$";
//闰年
//        String regex =  "^((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])" +
//                "|((16|[2468][048]|[3579][26])00))-0?2-29-$";

        String regex = "0|[1-9]+\\.\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        System.out.println("matches result：" + flag);
        if (matcher.find()) {
            System.out.println("find result:" + true);
            System.out.println(matcher.group());
            System.out.println("location : start: {" + matcher.start() + "},end: {" + matcher.end() + "}");
        }

    }
}
