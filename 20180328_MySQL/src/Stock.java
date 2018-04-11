public class Stock implements Comparable<Stock>{
    private String symbol;
    private String name;
    private int lastSale;

    public Stock(String symbol, String name, int lastSale) {
       setSymbol(symbol);
       setName(name);
       setLastSale(lastSale);
    }
    /*  Will not work because the method signature is the same as above
    public Stock(String name, String symbol, int lastSale){
    }
    */
    public Stock(int lastSale, String symbol, String name){
        this(symbol, name, lastSale);
    }
    public Stock(String symbol, String name){
        this(symbol, name, 0);
    }
    public Stock(String symbol){
        this(symbol, "UNKNOWN", 0);
    }
    public Stock(){
        this("???");
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastSale(int lastSale) {
        this.lastSale = (lastSale < 0) ? 0 : lastSale;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public int getLastSale() {
        return lastSale;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) Closed at %d", name, getSymbol(), lastSale);
    }

    public int compareTo(Stock other){
        int result = 0;
        result = name.compareTo(other.name);
        if(result == 0){
            result = this.lastSale - other.lastSale;
        }
        return result;
    }
}
