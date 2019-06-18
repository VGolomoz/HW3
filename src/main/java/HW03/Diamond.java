package HW03;

public class Diamond extends Mineral{

    private String name = "diamond";
    private double category = 1.0;
    private double carat;
    private int colorValue;
    private int clarityValue;

    public Diamond(double carat, int colorValue, int clarityValue){
        this.carat = carat;
        this.colorValue = colorValue;
        this.clarityValue = clarityValue;
    }

    public double getCarat() {
        return carat;
    }

    public double getValue() {

        double value = category*(carat*(colorValue + clarityValue));
        return value;
    }

    public double getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void getDescription() {
        String categoryName;
        if(category == 1) categoryName = "precious stone";
        else categoryName = "semiprecious stone";
        System.out.println("CATEGORY: " + categoryName + " GEMSTONE: " + name + " CARAT: " + carat + " COLOR: " + Mineral.getColor(colorValue) + " CLARITY: " + clarityValue);
    }
}
