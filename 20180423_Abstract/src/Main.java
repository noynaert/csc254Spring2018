import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
	   Person pn = new Person("Mary", 32);//pn is now an object of class Person
        Person who = null;
        who = new Person("Tom", 29);    //instantiate
                                                  // Tom is an instance of a Person
        Person mystery = null;
        System.out.println(pn);
        System.out.println(who);
        System.out.println(mystery);
        System.out.println(pn.getName());
        System.out.println(who.getName());
        //System.out.println(mystery.getName());

        Person[] list = new Person[10];
        for(int i=0;i<10;i++)
            System.out.println(list[i]);

        System.out.println("Max is " + Integer.MAX_VALUE);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(7));
        numbers.add(new Integer( -47));
        for(Integer number: numbers){
            System.out.println(number);
        }
        Employee boss = new Employee("Mr. Slate", 57, "000000",50.00);
        System.out.println("Is boss an Employee? " + (boss instanceof Employee) );
        System.out.println("Is pn an Employee? " + (pn instanceof Employee) );
        System.out.println("Is boss a Person? " + (boss instanceof Person) );


        ArrayList<Person> mob = new ArrayList<>();
        mob.add(pn);
        mob.add(who);
        mob.add(mystery);
        mob.add(boss);
        //mob.add("Steve");


        for(Person person : mob){
            System.out.println("The mob includes " + person);
        }
        System.out.println(pn.getId());
        */
        //Starting to explore abstract ideas

        //Can't do this:
        Person pn;
        //pn = new Person("Bob", 18);
        pn = new Employee("Tom", 22, "000001", 10.00);
        System.out.printf("%s's id is %s\n", pn.getName(), pn.getId());


        AnonymousCustomer anon = new AnonymousCustomer();
        Customer cust = (Customer)anon;
        cust = (pn instanceof Customer) ? (Customer)pn : null;

        ArrayList<Person> mob = new ArrayList<>();
        mob.add(pn);
        mob.add(new KnownCustomer("Jerry"));
        mob.add(new KnownCustomer("Suzie", 23));
        mob.add(new Employee("Sam",33,"000002" ,20.00));
        mob.add(new AnonymousCustomer());
        for(Person person : mob){
            System.out.println("The mob includes " + person);
        }

        ArrayList<Discount> cheapskates = new ArrayList<>();
        cheapskates.add(new Employee("Ted", 25, "000003", 15));
        cheapskates.add(new KnownCustomer("Becky"));
        //cheapskates.add(new AnonymousCustomer());
        cheapskates.add(new Thing());

        for(Discount d : cheapskates){
            System.out.println(d + " Discount is " + d.calculateDiscount() );
        }
    }
}
