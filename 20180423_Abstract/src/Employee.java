public class Employee extends Person {
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


}
