import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Zombie> list = new ArrayList<>();
	    Zombie a = new Zombie("Zed",.25);
	    Zombie b = new Zombie("Mary");
	    Zombie c = new Zombie();
	    Zombie d = new Zombie("Bob");

	    list.add(a);
	    list.add(b);
	    list.add(c);
	    list.add(d);
	    list.add(new Zombie());

	    for(int i = 0; i< list.size(); i++){
	        System.out.printf("[%d] %s\n", i, list.get(i));
        }

		System.out.println("============================");
		for(Zombie z : list){
			System.out.println(z);
		}
		System.out.println("-------  Starting mysql query ---------------");
        ArrayList<Zombie> hoard = getZombies(10);
        for(Zombie z : hoard){
            System.out.println(z);
        }
    }

    public static ArrayList<Zombie> getZombies(int howMany){
        ArrayList<Zombie> hoard = new ArrayList<>(howMany);

        String host = "jdbc:mysql://turing.cs.missouriwestern.edu:3306/misc";
        String user = "csc254";
        String password="age126";

        Connection conn;
        Statement stmt;
        ResultSet rs;

        String queryString = "select givenName, cw2 from people LIMIT ";
        queryString += String.format("%d", howMany);
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
            System.out.printf("The query string is \"%s\"",queryString);
            while(rs.next()){
                String name = rs.getString("givenname");
                double health = rs.getInt("cw2") / 1000.0;
                Zombie z = new Zombie(name, health);
                hoard.add(z);
            }
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    return hoard;
    }

}
