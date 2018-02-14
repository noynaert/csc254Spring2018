import java.util.Arrays;

public class Main {
    static final double DELTA = 0.001;

    public static void main(String[] args) {
	double[] list = {3.2, -4.7, 8.6, -12, 88.8, -8.9};
	Arrays.sort(list);

	print(list, list.length);
	double number = 8.6;
	System.out.printf("Looking for %f.  Found at %d\n", number, find(number, list, list.length));
    }


    public static int find(double needle, double[] haystack, int n){
        int foundAt = -1;

        int i = 0;
        while(i<n && foundAt == -1 && haystack [i] <= needle){
            if( Math.abs(needle - haystack[i]) < DELTA){
                foundAt = i;
            }
            System.out.print(".");  //normally not part of the loop
            i++;
        }

        return foundAt;
    }

    public static void print(double[] list, int n){
        System.out.printf("------- Printing %d items ---------\n",n);
        for(int i=0;i<n;i++){
            System.out.printf("[%2d] %f\n", i, list[i]);
        }
    }
}
