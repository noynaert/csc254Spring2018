public class AnonymousCustomer extends Customer{
    @Override
    public String getId() {
        return "Unknown "+ getName();
    }

    @Override
    public String toString() {
        String result = super.toString();
        result.replaceAll("name","Contact Date");

        return result;
    }
}
