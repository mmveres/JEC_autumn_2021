package ua.univer.lesson08;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class ProgramMap {
    public static void main(String[] args) throws IOException {
        String str = "mama mila ramu ramu mama mama mila rita";
        Map<String, Integer> wordMap = getWordMap(str);
        System.out.println(wordMap);

        String url = "https://stackoverflow.com/questions/4328711/read-url-to-string-in-few-lines-of-java-code";
        //String text = stringFromUrl(url);

        Map<String, List<String>> wordMapListUrl = new HashMap<>();
        String urlShekspir = "https://www.stihi-rus.ru/World/Shekspir/";
        for (int i = 1; i < 10; i++) {
            String text = stringFromUrl(urlShekspir+i+".htm");
            Map<String, Integer> wordMapUrl = getWordMap(text);
            for (var word: wordMapUrl.keySet()) {
                if (!wordMapListUrl.containsKey(word))
                    wordMapListUrl.put(word,new ArrayList<>());
                wordMapListUrl.get(word).add(urlShekspir+i+".htm");
            }

            }System.out.println(wordMapListUrl);
        }


    private static Map<String, Integer> getWordMap(String str) {
        String [] words = str.split(" ");
        Map<String, Integer> wordMap= new HashMap<>();
        for (var word: words) {
            if (!wordMap.containsKey(word))
                wordMap.put(word,1);
            else
                wordMap.put(word, wordMap.get(word)+1);
        }
        return wordMap;
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
}
