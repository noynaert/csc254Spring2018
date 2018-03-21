public class Rectangle {
    private double length;
    private double width;
    private String name;

    public Rectangle(double length, double width, String name){
        setLength(length);
        setWidth(width);
        setName(name);
    }
    public Rectangle(double length, double width){
        this(length, width, "generic box");
    }
    public Rectangle(){
        this(1,1);
    }
    //setter
    public void setLength(double len){
        if(len <= 0.0)
            length = 1;
        else
            length = len;
    }
    public void setWidth(double width){
        this.width = (width <= 0.0)?1:width;
    }
    public void setName(String name){
        this.name = (name.length() == 0)?"box":name;
    }

    //getters
    public double getLength(){
        return this.length;
    }

    public double getWidth() {
        return width;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        String result;
        result = String.format("%s has a length of %1.1f and a width of %1.1f.",name,
                length, width);
        return result;
    }
}
