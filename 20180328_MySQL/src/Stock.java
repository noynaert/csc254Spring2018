public class Stock {
    private String symbol;
    private String name;
    private int lastSale;

    public Stock(String symbol, String name, int lastSale){
        this.symbol = symbol;
        this.name = name;
        this.lastSale = lastSale;
    }

    @Override
    public String toString() {
        return  "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", lastSale=" + lastSale;
    }
}
