import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int maximum = 10;
	    String fileName = "input.txt";
	    if(args.length > 0)
	        fileName = args[0];
	    if(args.length > 1)
            maximum = Integer.parseInt(args[1]);
        System.out.printf("I will read up to %d records from file \"%s\"\n", maximum, fileName);

        String[] common = new String[maximum];

//        common[0] = "123456";
//        common[1] = "12345678";
//        common[2] = "qwerty";
//        common[3] = "password";
//        common[4] = "abc123";
//        common[5] = "letmein";
//        common[6] = "password1";
//        int n = 7;

        int n = readFile(fileName,common);
        print(common, n);
    }
    public static int readFile(String fileName, String[] list){
        int n = 0;
        try {
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNextLine() && n < list.length){
                list[n] = input.nextLine();
                n++;
            }

            input.close();
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.err.println(e.getMessage());
            System.exit(1);
        }


        return n;
    }


    static void print(String[] list, int n){
        System.out.println("---------------------");
        for(int i=0; i< n;i++){
            System.out.printf("list[%d] is %s\n", i, list[i]);
        }
    }


    /////////////////////////////////////////////////////////////////////////
    public static double log2(double x){
        double result;
        result = Math.log(x)/Math.log(2.0);
        return result;
    }

    public static int getRange(String s, String allowed){
        return 36;
    }
    public static int getEntropy(String s, String allowed){
        int result = 0;
        int range = getRange(s, allowed);
        int length = s.length();
        result = calculateEntropy(range,length);
        return result;
    }

    public static int calculateEntropy(int range, int length){
        double result;
        result = log2(Math.pow(range, length-1));
        result = Math.round(result);

        return (int)result;

    }
}
