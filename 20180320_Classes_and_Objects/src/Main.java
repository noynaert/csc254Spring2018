public class Main {

    public static void main(String[] args) {
        Rectangle desk = new Rectangle(1.5, 1, "desk");
        //Rectangle door = new Rectangle();
        Rectangle door = new Rectangle (2.2,1, "Door");
        door.setLength(2.2);
        door.setWidth(1.001);
        System.out.println(door);
        System.out.println(desk);
        printRectangle(door);
        printRectangle(desk);

        Object o = new Object();
        System.out.println("Generic Object is " + o);
        System.out.println("The hash code is " + o.hashCode());

        System.out.println("The hash code for door is " + door.hashCode());

        System.out.println("---------------------------");
        Person son = new Person("Joe", 33);
        Person daughter0 = new Person("Michelle", son.getAge()+4);
        Person daughter1 = new Person("Kathryn", son.getAge()+4);
        System.out.println(son);
        System.out.println(daughter0);
        System.out.println(daughter1);
        Person wife = new Person("Elaine");
        System.out.println(wife);


    }
    public static void printRectangle(Rectangle it){
        System.out.printf("%s has a length of %1.1f and a width of %1.1f.\n",
                it.getName(), it.getLength(), it.getWidth());
    }
}
