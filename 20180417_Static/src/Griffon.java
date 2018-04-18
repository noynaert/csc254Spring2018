public class Griffon extends Person {
    private String gNumber;
    private static int lastGnumber = 1000;

    public Griffon(String name, byte age){
        super(name, age);
        makeGnumber();
    }
    public Griffon(){
        this("Sam", (byte)18);
    }

    private void makeGnumber(){
        String result = "G00";
        lastGnumber++;
        result += String.format("%06d",lastGnumber);
        gNumber = result;
    }

    public String getgNumber() {
        return gNumber;
    }
    @Override
    public String toString(){
        String result = super.toString();
        result += "  " + gNumber;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Griffon)) return false;
        if (!super.equals(o)) return false;

        Griffon griffon = (Griffon) o;

        return gNumber != null ? gNumber.equals(griffon.gNumber) : griffon.gNumber == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (gNumber != null ? gNumber.hashCode() : 0);
        return result;
    }
}
