import java.lang.Object;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Zombie a = new Zombie("Bob", .05);
        Zombie b = new Zombie();
        System.out.println(a);
        System.out.println(b);

        Zombie[] hoard = new Zombie[3];
        hoard[0] = a;
        hoard[1] = b;
        hoard[2] = new Zombie("Sue");
        Arrays.sort(hoard, 0, hoard.length);
        print(hoard);
        String[] words = {"remember", "warmed", "margerine", "tastes", "best"};
        Object[] things = { new Object(), new Object(), new Object(), new Object()};
        Arrays.sort(words,0,words.length);
        //Arrays.sort(things,0,things.length);
        print(words);
        print(things);
    }

    //Generics
    //Templates

    public static <T>void print(T[] list){
        System.out.println("-------------------");
        for(int i=0;i<list.length;i++){
            System.out.printf("[%d] %s\n",i, list[i]);
        }
        System.out.println("-------------------");

    }


}
