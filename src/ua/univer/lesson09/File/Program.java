package ua.univer.lesson09.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class UserKMDA{
    private String name;
    private String posada;
    private double oklad;

    public UserKMDA(String name, String posada, double oklad) {
        this.name = name;
        this.posada = posada;
        this.oklad = oklad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosada() {
        return posada;
    }

    public void setPosada(String posada) {
        this.posada = posada;
    }

    public double getOklad() {
        return oklad;
    }

    public void setOklad(double oklad) {
        this.oklad = oklad;
    }

    @Override
    public String toString() {
        return "UserKMDA{" +
                "name='" + name + '\'' +
                ", posada='" + posada + '\'' +
                ", oklad=" + oklad +
                '}';
    }
}
public class Program {
    public static void main(String[] args) throws IOException {
        String url = "https://data.gov.ua/dataset/770cc750-4333-424f-b6e9-6e6c5c76aec9/resource/59cb6066-1fac-41ed-a571-811db551c75b/download/zp-lupen-2019.csv";
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"cp1251"));
        String title =  br.readLine();
        List<UserKMDA> userKMDAList = new ArrayList<>();
        while (br.ready()){
           String str =  br.readLine();
           String[] words = str.split(";");
            userKMDAList.add(new UserKMDA(words[0],words[1],Double.parseDouble(words[2].replace(',','.'))));
          //  System.out.println(Arrays.toString(words));
        }
        System.out.println(userKMDAList);
        UserKMDA maxOkladUser = userKMDAList.get(0);
        for (var user: userKMDAList) {
            if (user.getOklad()> maxOkladUser.getOklad())
                maxOkladUser = user;
        }
        System.out.println(maxOkladUser);
    }
}
