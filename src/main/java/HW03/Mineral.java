package HW03;

public abstract class Mineral {

    String name;
    double carat;
    double category; //1 - precious stone, 0.5 - semiprecious stone
    int colorValue; // 0-7
    int clarityValue; // 0-10

    public abstract double getCarat();

    public abstract double getValue();

    public abstract double getCategory();

    public abstract String getName();

    public abstract void getDescription();

    public static String getColor(int colorValue){

        String color = "";

        switch(colorValue){
            case(0): color = "white";
                break;
            case(1): color = "red";
                break;
            case(2): color = "orange";
                break;
            case(3): color = "yellow";
                break;
            case(4): color = "green";
                break;
            case(5): color = "blue";
                break;
            case(6): color = "dark blue";
                break;
            case(7): color = "violet";
                break;
        }
        return color;
    }

}
