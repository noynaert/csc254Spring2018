public class KnownCustomer extends Customer implements Discount{

    public KnownCustomer(String name){
        super(name, 0);
    }
    public KnownCustomer(String name,int age){
        super(name,age);
    }

    @Override
    public String getId() {
        return getName();
    }

    @Override
    public double calculateDiscount() {
        return 0.5;
    }
}
