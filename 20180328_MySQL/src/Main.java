import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // https://mwsu.zoom.us/my/noynaert
    public static void main(String[] args) {
	    Stock stk = new Stock("PIH","1347 Property Insurance Holdings, Inc.", 7);
	    System.out.println(stk);
	    //printAll("GO");
        int max = 20;
        Stock[] list = new Stock[max];
        int n = buildTable("GO", list);
        Arrays.sort(list,0, n);
        printList(list,n);
        ArrayList<Stock> ar = new ArrayList<>();
        buildTable("E", ar);
        printList(ar);
    }
    public  static<T> void printList(T[] list, int n) {
          for(int i=0;i<n;i++) {
              System.out.printf("[%d] %s\n", i, list[i]);
          }
    }
    public static<T> void printList(ArrayList<T>list){
        for(T stk: list){
            System.out.println(stk);
        }
    }
    public static void buildTable(String symbol, ArrayList<Stock> list){
        int n = 0;
        String host = "jdbc:mysql://turing.cs.missouriwestern.edu:3306/misc";
        String user = "csc254";
        String password="age126";

        Connection conn;
        Statement stmt;
        ResultSet rs;

        String queryString = "SELECT symbol, name, lastSale FROM stocks WHERE symbol like ";
        queryString += String.format("'%%%s%%'", symbol);
        System.out.println(queryString);

        try {
            conn = DriverManager.getConnection(host, user, password);
            if(conn!=null){
                System.out.println("Successful connection");
            }else{
                System.out.println("Connection failed");
                System.exit(2);
            }
            stmt = conn.createStatement();
            rs = stmt.executeQuery(queryString);

            while(rs.next()){
                String abbreviation = rs.getString("symbol");
                String name = rs.getString("name");
                int lastSale = rs.getInt("lastSale");
                Stock stk = new Stock(abbreviation, name, lastSale);
                list.add(stk);
            }


            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

    }

    public static int buildTable(String symbol, Stock[] list){
        int n = 0;
        String host = "jdbc:mysql://turing.cs.missouriwestern.edu:3306/misc";
        String user = "csc254";
        String password="age126";

        Connection conn;
        Statement stmt;
        ResultSet rs;

        String queryString = "SELECT symbol, name, lastSale FROM stocks WHERE symbol like ";
        queryString += String.format("'%%%s%%'", symbol);
        System.out.println(queryString);

        try {
            conn = DriverManager.getConnection(host, user, password);
            if(conn!=null){
                System.out.println("Successful connection");
            }else{
                System.out.println("Connection failed");
                System.exit(2);
            }
            stmt = conn.createStatement();
            rs = stmt.executeQuery(queryString);

            while(rs.next()){
                String abbreviation = rs.getString("symbol");
                String name = rs.getString("name");
                int lastSale = rs.getInt("lastSale");
                Stock stk = new Stock(abbreviation, name, lastSale);
                list[n++] = stk;
                //n++;
            }


            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        return n;
    }

    public static void printAll(String symbol){
        String host = "jdbc:mysql://turing.cs.missouriwestern.edu:3306/misc";
        String user = "csc254";
        String password="age126";

        Connection conn;
        Statement stmt;
        ResultSet rs;

        String queryString = "SELECT symbol, name, lastSale FROM stocks WHERE symbol like ";
        queryString += String.format("'%%%s%%'", symbol);
        System.out.println(queryString);

        try {
            conn = DriverManager.getConnection(host, user, password);
            if(conn!=null){
                System.out.println("Successful connection");
            }else{
                System.out.println("Connection failed");
                System.exit(2);
            }
            stmt = conn.createStatement();
            rs = stmt.executeQuery(queryString);

            while(rs.next()){
                String abbreviation = rs.getString("symbol");
                String name = rs.getString("name");
                int lastSale = rs.getInt("lastSale");
                Stock stk = new Stock(abbreviation, name, lastSale);
                System.out.println(stk);
            }


            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

    }

}
