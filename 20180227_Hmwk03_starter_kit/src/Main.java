import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lineCount = 0;
        int sumLength = 0;
        int longestSoFar = 0;

        try {
            Scanner input = new Scanner(new File("oneFish.txt"));
            while(input.hasNextLine()){
                String line = input.nextLine().trim();
                if(line.length() > 0) {
                    lineCount++;
                    sumLength += line.length();
                    if (line.length() > longestSoFar)
                        longestSoFar = line.length();
                }
            }
            input .close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("%d lines were read.  The average length was %1.1f\n",
                lineCount, (double)sumLength/lineCount);
        System.out.printf("The longest password was %d characters\n", longestSoFar);
    }
}
