public class Main {

    public static void main(String[] args) {
	     print(args, args.length);
	     System.out.println( "Concatinated strings: "+ args[1] + args[1]);
	     int number = Integer.parseInt(args[1]);
	     System.out.printf("%d squared is %d\n", number, number*number);
    }
    public static void print(String[] words, int n){
        System.out.printf("----- Printing %d words -----\n",n);
        for(int i=0;i<n;i++){
            System.out.printf("[%2d] %s\n", i, words[i]);
        }
    }
}
