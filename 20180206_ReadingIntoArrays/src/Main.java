import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// http://griff.vn/csmplockers
public class Main {

    public static void main(String[] args) {
	    String fileName = "input.txt";
	    int maxArraySize = 5;


	    if(args.length >= 1){
	        fileName = args[0];
        }
        if(args.length >= 2){
	        maxArraySize = Integer.parseInt(args[1]);
        }
        //echo print
        System.out.printf("Reading up to %d entries from file \"%s\"\n",
                maxArraySize, fileName);

        double[] numbers = new double[maxArraySize];
        int n = readNumbersFromFile(fileName, maxArraySize, numbers);

        print(numbers,n);
        //selectionSort(numbers,n);
        print(numbers,n);

        System.out.println("The average of the values in the array is " +
                 findAverage(numbers, n));
        System.out.println("The largest value is " + findMaximum(numbers,n));
        System.out.println("Done!");


        // print(words, n, "These are the shortest password");
    }

    public static double findAverage(double[] list, int n){
        double sum = 0;

        for(int i=0;i<n;i++)
            sum += list[i];

        return sum / n;
    }

    public static double findMaximum(double[] list, int n){
        double largestSoFar;
        /*
        if(n > 0){
            largestSoFar = list[0];
        }else{
            largestSoFar = Double.NaN;
        }
        */
        largestSoFar = (n > 0) ? list[0] : Double.NaN;


        for(int i = 1; i<n; i++)
            if(list[i] > largestSoFar)
                largestSoFar = list[i];

        return largestSoFar;
    }



    public static void selectionSort(double[] list, int n){
        for(int i=0; i<n-1 ;i++){ //pocketknifeLoop
            double currentMin = list[i];
            int currentMinIndex = i;

            for(int j = i+1; j < n; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static int readNumbersFromFile(String fileName, int maximum,double[] list){
        int n = 0;
        try {
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNextDouble() && n < maximum){
                list[n] = input.nextDouble();
                n++;
            }

            input.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.printf("ERROR, could not open file \"%s\"\n",fileName);
            System.exit(1);
        }

        return n;
    }



    public static void print(String[] words, int n, String message){
        System.out.printf("\n----- %s -----\n", message);
        System.out.printf("----- Printing %d words -----\n",n);
        for(int i=0;i<n;i++){
            System.out.printf("[%2d] %s\n", i, words[i]);
        }
    }
    public static void print(double[] list, int n){
        System.out.printf("----- Printing %d numbers-----\n",n);
        for(int i=0;i<n;i++){
            System.out.printf("[%2d] %f\n", i, list[i]);
        }
    }
}
