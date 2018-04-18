public class Person implements Comparable<Person> {

    private String name;
    private byte age;
    public final static byte MAXAGE = 120;

    public Person(){
        this("Anonymous",(byte)-1);
    }

    public Person(String name, byte age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }
    public static byte getMaxAge(){
        return MAXAGE;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("%s (%d)", name, age);
    }

    @Override
    public int compareTo(Person other) {
        int result = name.compareTo(other.name);
        if(result == 0){
            result = age - other.age;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) age;
        return result;
    }
}
