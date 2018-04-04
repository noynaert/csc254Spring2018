public class Zombie implements Comparable<Zombie>{
    private String name;
    private double health;

    public Zombie(String name, double health){
        setName(name);
        setHealth(health);
    }
    public Zombie(String name){
        this(name,.50);
    }
    public Zombie(){
        //System.out.println("Before this");
        this("Zeek", .50);
        System.out.println("noarg");  //don't print from constructors!
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHealth(double health){
        this.health = health;
    }
    public String getName(){ return name;}
    public double getHealth(){return health;}

    public boolean isMobile(){
        return health >= .10;
    }
    public boolean isImmobile(){
        return health < .10;
    }

    @Override
    public String toString(){
        String result = "";
        result = String.format("Name: %s, Health: %1.1f%%", name, health*100.0);
        result += isImmobile() ? " (Immobile)" : " You should probably run.";
        return result;
    }


    @Override
    public int compareTo(Zombie other) {
        int result =0;
        result = this.name.compareToIgnoreCase(other.name);
        if(result == 0){
            double difference = this.health - other.health;
            /* One way
            if(difference < 0)
                result = -1;
            else
                result = 1;
                */
            result = (int)Math.round(difference*100000);
        }
        return result;
    }
}
