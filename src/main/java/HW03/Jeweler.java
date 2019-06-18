package HW03;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Jeweler {

    private ArrayList<Mineral> stonesList;
    private ArrayList<Mineral> necklace;

    public Jeweler() {
        stonesList = new ArrayList<Mineral>();

        stonesList.add(new Diamond(0.5, 7, 8));
        stonesList.add(new Diamond(0.5, 5, 5));
        stonesList.add(new Amethyst(1.0, 0, 1));
        stonesList.add(new Amethyst(2.0, 1, 0));
        stonesList.add(new Aquamarine(1.5, 4, 4));
        stonesList.add(new Aquamarine(2.0, 1, 6));
        stonesList.add(new Aquamarine(0.02, 7, 9));
        stonesList.add(new Citrine(0.05, 6, 5));
        stonesList.add(new Citrine(3.05, 3, 7));
        stonesList.add(new Emerald(4.0, 4, 10));
        stonesList.add(new Emerald(2.15, 4, 2));
        stonesList.add(new Ruby(2.5, 5, 9));
        stonesList.add(new Ruby(0.04, 7, 5));
        stonesList.add(new Sapphire(3.00, 7, 1));
        stonesList.add(new Sapphire(0.25, 2, 4));
        stonesList.add(new Topaz(0.75, 5, 9));
        stonesList.add(new Topaz(1.25, 3, 3));
    }

    public void openShop() {

        System.out.println("How can I help You? ");
        System.out.println("1. Make new necklace.");
        System.out.println("2. Count gem's total cost.");
        System.out.println("3. Count gem's total weight.");
        System.out.println("4. Sort gems by value.");
        System.out.println("5. Search gems by clarity.");


        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        switch (input) {
            case (1):
                selectGems(stonesList);
                break;
            case (2):
                countTotalCost(necklace);
                break;
            case (3):
                countTotalWeight(necklace);
                break;
            default:
                System.out.println("Sorry, but i cant help you with this");
        }

        in.close();
    }

    private void selectGems(ArrayList<Mineral> list) {

        for (int i = 1; i < list.size(); i++) {
            System.out.print(i + ". ");
            list.get(i).getDescription();
        }
        System.out.println("Select gems for your necklace: ");
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(",");
        makeNecklace(input);
        in.close();
    }

    private void makeNecklace(String[] input) {

        necklace = new ArrayList<Mineral>();

        for (String i : input) {
            int index = Integer.parseInt(i);
            necklace.add(stonesList.get(index));
        }
        System.out.println("Now your necklace has: ");
        for (Mineral mineral : necklace) {
            mineral.getDescription();
        }
        openShop();
    }

    private void countTotalCost(ArrayList<Mineral> list) {
        double totalCost = 0.0;
        try {
            for (Mineral a : list) {
                totalCost += a.getValue();
            }
            System.out.println(totalCost*1000 + "$");
        } catch (Exception e) {
            System.err.println("You should make necklace before");
        } finally {
            openShop();
        }
    }

    private void countTotalWeight(ArrayList<Mineral> list) {
        double totalWeight = 0.0;
         try {
            for (Mineral a : list) {
                totalWeight += a.getCarat();
            }
            System.out.println(totalWeight + " carat");
        } catch (Exception e) {
            System.err.println("You should make necklace before");
        }
        openShop();
    }

    private ArrayList sortByValue(ArrayList list) {
        return list;
    }

    private ArrayList searchByClarity(ArrayList list) {
        return list;
    }

}
