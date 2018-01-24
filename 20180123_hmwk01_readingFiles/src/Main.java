import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "input.txt";
        String allowed = "#$%.,[]";
	   File inputFile = new File(fileName);
	   System.out.printf("The %s file exists: %b\n", fileName, inputFile.exists() );
       System.out.println("The " + fileName + " file exists: " + inputFile.exists());
       System.out.printf("The file takes %d bytes of space\n",inputFile.length());

        try {
            Scanner input = new Scanner(inputFile);
            while(input.hasNextLine()){
                String s = input.nextLine();
                System.out.printf("String is [%s]\n", s);
            }
            input.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.printf("Error: Could not find file %s.\n",fileName);
            System.err.println(e.getMessage());
            System.exit(1232);
        }
        try {
            URL url = new URL("http://turing.cs.missouriwestern.edu/classes/textFiles/bright.txt");
            url = new URL("https://www.missouriwestern.edu/");
            InputStream in = url.openStream();
            Scanner input = new Scanner(in);

            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();

        } catch (MalformedURLException e) {
            //e.printStackTrace();
            System.err.println("Bad Url");
            System.exit(1);
        } catch (IOException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
            System.exit(2);
        }
            int howMany = count("Pol, a bene ignigena, nobilis saga!,,,,!!!!\n", allowed);
        System.out.println(howMany);

        System.out.println("Done");
    }
    public static boolean hasDigits(String s){
        String allDigits = "0123456789";
        boolean found = false;
        int i = 0;
        while(i<allDigits.length()  && !found) {
            char ch = allDigits.charAt(i);
            if (s.indexOf(ch) > -1) {
                found = true;
            }
            i++;
        }
        return found;
    }
    public static int count(String s, String allowed){
        int count = 0;
        int i = 0;
        while(i<allowed.length()) {
            char ch = allowed.charAt(i);
            if (s.indexOf(ch) > -1) {
                count++;
            }
            i++;
        }
        return count;
    }


}
