public class Employee extends Person implements Discount {
    private String id;
    private double hourlyPay;
    public Employee(String name, int age, String id, double hourlyPay){
        super(name, age);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += String.format("ID: %s Hourly Pay: %1.2f", id, hourlyPay);
        return result;
    }

    @Override
    public String getId() {
        return id;
    }


    @Override
    public double calculateDiscount() {
        double discount;
        if(getAge()>65)
            discount = 0.05;
        else if(getAge() < 35)
            discount = MAXIMUM_DISCOUNT;
        else
            discount = 0.10;

        return discount;
    }
}
