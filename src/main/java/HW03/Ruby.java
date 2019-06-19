package HW03;

public class Ruby extends Corundum {

    private String name = "ruby";
    private double category = 1.0;
    private double carat;
    private int colorValue;
    private int clarityValue;

    public Ruby(double carat, int colorValue, int clarityValue){
        this.carat = carat;
        this.colorValue = colorValue;
        this.clarityValue = clarityValue;
    }

    public double getCarat() {
        return carat;
    }

    public Double getValue() {

        double value = category*carat*colorValue+clarityValue;
        return value;
    }

    public int getClarity() {
        return clarityValue;
    }

    public String getName() {
        return name;
    }

    public void getDescription() {
        String categoryName;
        if(category == 1) categoryName = "precious stone";
        else categoryName = "semiprecious stone";
        System.out.println("CATEGORY: " + categoryName + " GEMSTONE: " + name + " CARAT: " + carat + " COLOR: "
                + Mineral.getColor(colorValue) + " CLARITY: " + clarityValue + " Value: " + getValue()*100 + " $");
    }

    public int compareTo(Mineral o) {
        return getValue().compareTo(o.getValue());
    }
}
