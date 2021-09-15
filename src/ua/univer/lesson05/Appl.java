package ua.univer.lesson05;

import java.util.regex.*;
public class Appl {
    public static void main(String[] args) {
//        String pattern = "[a-z]+";
//        String text = "now is the time";
        String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
        String text = "my.mail@ua.ua";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println(m.matches());
//        while (m.find()) {
//            System.out.print(text.substring(m.start(), m.end()) + "*");
//        }


    }
}
