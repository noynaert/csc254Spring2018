import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String word;
	    do{
	        System.out.print("Type a word: ");
            word = input.next();
            System.out.printf("You typed %s\n", word);
        }while(!word.equalsIgnoreCase("Stop"));
	    input.close();
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


}
