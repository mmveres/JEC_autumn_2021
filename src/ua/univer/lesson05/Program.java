package ua.univer.lesson05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {


        // String str= "mama mila ramu ramu mila mama mila";
        //  testString(str);
        //  Scanner sc = new Scanner(str);


        String url = "https://stackoverflow.com/questions/4328711/read-url-to-string-in-few-lines-of-java-code";
        //String text = stringFromUrl(url);
        String urlShekspir = "https://www.stihi-rus.ru/World/Shekspir/";
        for (int i = 1; i < 10; i++) {
            String text = stringFromUrl(urlShekspir+i+".htm");
            String[] words = text.split(" ");
            for (var w : words) {
                System.out.println(w);
            }
        }



//        String sbuild = getSbuild();
//        System.out.println(sbuild +" : "+sbuild.length());
//        StringBuffer sbuf;
    }

    private static String stringFromUrl(String url) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        Scanner sc = new Scanner(
                connection.getInputStream());
        while (sc.hasNextLine()){
            sb.append( sc.nextLine() + " ");
        }
        return sb.toString();
    }

    private static String stringFromFile(String filename) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNextLine()){
            sb.append( sc.nextLine() + " ");
        }
        return sb.toString();
    }

    private static String stringFromConsole() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.equals("exit")) break;
            sb.append(s + " ");
        }
        return sb.toString();
    }

    private static String getSbuild() {
        StringBuilder sbuild = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sbuild.append(1);
            System.out.println(sbuild.length()+"/"+ sbuild.capacity());
        }
        return sbuild.toString();
    }

    private static void testString(String str) {
        String word = "mila";
        int firstIndex = str.indexOf(word);
        int lastIndex = str.lastIndexOf(word);
        int index = firstIndex;
        System.out.println(firstIndex);
        while (index < lastIndex) {
            index = str.indexOf(word, index + 1);
            System.out.println(str.indexOf(word, index));

        }
        System.out.println(str.replace(word, "papa"));
        String[] words = str.split(" ");
        for (var w : words) {
            System.out.println(w);
        }
    }
}
