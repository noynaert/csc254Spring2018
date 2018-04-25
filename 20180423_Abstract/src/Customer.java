import java.util.Date;

public abstract class Customer extends Person {
    public Customer(){
        super(new Date().toString(),0);
    }
    public Customer(String name){
        super(name, 0);
    }
    public Customer(String name, int age){
        super (name, age);
    }
    public String toString() {
        return  this.getClass()+"{" +
                "name='" + getName() + '\'' +
                ((getAge()>0) ? ", age=" + getAge() :"") +
                '}';
    }
}
