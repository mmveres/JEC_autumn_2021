package ua.univer.lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.*;
class MarkException extends Exception{

}

public class Program {
    public static Logger logger = Logger.getLogger(Program.class.getName());
    static {
        logger.setLevel(Level.SEVERE);
        try {
            Handler fh = new FileHandler("prog.log",true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {

        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter int value");
        try {
          String str = br.readLine();
          logger.info("enter from console: "+str);
          int value = Integer.parseInt(str);
          logger.fine("after parse str: "+value);
          if (value<2 || value>12) throw new MarkException();
          System.out.println("Int = "+ value);
        } catch (MarkException e) {
            logger.severe("Nor mark value \n "+ e.getMessage() + Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
          //  System.err.println(" error int value");
          logger.severe("error int \n "+ e.getMessage() + Arrays.toString(e.getStackTrace()));
          //  logger.log(Level.SEVERE,"error");
            throw e;
        }
        System.out.println("well done");
    }
}
