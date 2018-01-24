public class Main {

    public static void main(String[] args) {
	    hasDigits("abc123");
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
