public class Main {

    public static void main(String[] args) {
	    String s = "MISSOURI Western";
	    String t = "MISSOURI ";
	    String u = "MWSU";
	    t += "Western";

	    System.out.println("s is " + s);
	    System.out.println("t is " + t);

	    if(s == t){
	        System.out.println("same");
        }else{
	        System.out.println("Not the same");
        }
        if(s.equals(t))
            System.out.println("Are equal()");
	    else
	        System.out.println("Not equal()");

	    System.out.printf("s and t are %d\n", s.compareTo(t));
        System.out.printf("s and u are %d\n", s.compareTo(u));
        System.out.printf("u and s are %d\n", u.compareTo(s));

    }
}
