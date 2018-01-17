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

    //Trim the string
    public static String makeProperNoun(String s){
      String result = s.trim();
      result = result.toLowerCase();
      String firstPart = result.substring(0,1).toUpperCase();
      String secondPart= result.substring(1);
      result = firstPart + secondPart;
      return result;

    }
    public static boolean hasDigit(String s){
        boolean result = false;
        for(int i=0;i<s.length();i++){
            for(char j='0'; j<='9';j++)
            if(s.charAt(i) == j){
                result = true;
                break;
            }
        }
        return result;
    }
}
