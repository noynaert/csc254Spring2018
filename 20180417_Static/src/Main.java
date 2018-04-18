import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Person a = new Person("Bob", (byte)35);
        Person b = new Person("Bob", (byte)35);
        Person c = new Person("Bob", (byte)34);
        Person d = new Person("Bobby", (byte)35);
        Person e = new Person();
        Griffon g = new Griffon("Sam", (byte)18);
        Griffon h = new Griffon();
        Griffon i = new Griffon("Mary",(byte)20);

        print(a,b);
        print(a,c);
        print(a,d);
        print(a,a);

        System.out.printf("Max age for %s is %d\n", a, a.getMaxAge());
        System.out.printf("Max age for %s is %d\n", b, b.getMaxAge());
        //System.out.println("Name is " + Person.getName());
        System.out.println("Max age is " + Person.getMaxAge());

        System.out.println(Math.PI);
        System.out.println(Math.sqrt(16));
        System.out.println(Person.MAXAGE);
        System.out.println(e);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        ArrayList<Person> people = new ArrayList<>();
        people.add(a);
        people.add(b);
        people.add(c);
        people.add(new Person("Alice", (byte)40));
        people.add(g);
        people.add(new Griffon("Helen", (byte) 18));
        people.add(new Griffon("Alice", (byte)40));
        System.out.println("-----------------");
        Collections.sort(people);
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println("-----------------");

        ArrayList<Griffon>fans = new ArrayList<>();
        fans.add(g);
        //fans.add(a);
        System.out.println(g.getgNumber());


    }
    public static void print(Person a, Person b){
        System.out.printf("%s vs %s %b 0x%x 0x%x\n", a, b, a.equals(b), a.hashCode(), b.hashCode());
    }
}
