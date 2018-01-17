public class Main {

    public static void main(String[] args) {
	   System.out.println( add (3, 6));
	   System.out.println( add (0, 0));
        System.out.println( add (-3, 8));
        System.out.println( add (-8, 3));
        System.out.println( log5(25.0));
        System.out.println( log5(-8));
        System.out.println(  log5(0));
        System.out.println( log5(5));

        System.out.println(Integer.MAX_VALUE);
    }

    public static int add(int a, int b){
        int result = a+b;
        a = 66;
        return result;
    }

    public static boolean hasEvenLength(String s){
        boolean result = false;
        result = s.length() %2 == 0;
        return result;
    }
    public static double log5(double x){
        double result = 0.0;
        result = Math.log(x)/Math.log(5.0);
        return result;
    }
}
