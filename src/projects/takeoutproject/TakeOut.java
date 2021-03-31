package projects.takeoutproject;

import java.util.Scanner;

public class TakeOut {

    private static Scanner input = new Scanner(System.in);
    private static int noOfPeople = 0;
    private static final double TAX_RATE = 0.07;
    private static final double TIP_RATE = 0.15;

    //Main Method
    public static void main(String[] args) {
        TakeOut.startOrder();
    }

    public static void startOrder() {
        System.out.println("Enter the number of people the food is being ordered: ");
        noOfPeople = input.nextInt();
        System.out.println("No Of People = " + noOfPeople);

        if (noOfPeople < 10 || noOfPeople > 100) {
            System.out.println("TakeOut Order requires atleast 10 people and atmost 100.");
            System.exit(0);
        } else {
            TakeOut.displayMainMenu();
        }
    }

    //Main Menu
    public static void displayMainMenu() {

        System.out.println("\nCHOOSE TYPE OF MEAL");
        System.out.println("-------------------");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");
        System.out.println("Choose what type of food you'd like to order (1-3): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                TakeOut.displayItalianFoodMenu();
                break;
            case 2:
                TakeOut.displayChineseFoodMenu();
                break;
            case 3:
                TakeOut.displayAmericanFoodMenu();
                break;
            default:
                System.out.println("Invalid Input. Please enter between 1-3.");
                System.out.println();
                TakeOut.displayMainMenu();
        }
    }

    //Italian Menu
    public static void displayItalianFoodMenu() {
        System.out.println("\nCHOOSE ONE");
        System.out.println("-----------");
        System.out.println("1. Lasagna Tray - Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
        System.out.println("Enter Choice (1-3): ");
        int choice = input.nextInt();

        int trays = 0;
        double subTotal = 0.0;
        int feeds = 0;
        double price = 0.0;

        switch (choice) {
            case 1:
                feeds = 5;
                price = 17.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            case 2:
                feeds = 7;
                price = 15.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            case 3:
                feeds = 4;
                price = 12.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            default:
                System.out.println("Invalid Input. Please enter between 1-3.");
                System.out.println();
                TakeOut.displayItalianFoodMenu();
        }
    }

    //Chinese Menu
    public static void displayChineseFoodMenu() {
        System.out.println("\nCHOOSE ONE");
        System.out.println("-----------");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
        System.out.println("Enter Choice (1-3): ");
        int choice = input.nextInt();

        int trays = 0;
        double subTotal = 0.0;
        int feeds = 0;
        double price = 0.0;

        switch (choice) {
            case 1:
                feeds = 7;
                price = 18.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            case 2:
                feeds = 7;
                price = 18.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            case 3:
                feeds = 5;
                price = 10.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            default:
                System.out.println("Invalid Input. Please enter between 1-3.");
                System.out.println();
                TakeOut.displayChineseFoodMenu();
        }
    }

    //American Menu
    public static void displayAmericanFoodMenu() {
        System.out.println("\nCHOOSE ONE");
        System.out.println("-----------");
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\n" +
                "22.99");
        System.out.println("3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
        System.out.println("Enter Choice (1-3): ");
        int choice = input.nextInt();

        int trays = 0;
        int feeds = 0;
        double subTotal = 0.0;
        double price = 0.0;

        switch (choice) {
            case 1:
                feeds = 8;
                price = 21.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            case 2:
                feeds = 5;
                price = 22.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            case 3:
                feeds = 10;
                price = 26.99;
                trays = TakeOut.determineTrays(noOfPeople, feeds);
                subTotal = TakeOut.getSubtotal(price, trays);
                TakeOut.displayOrder(trays, feeds, subTotal);
                break;
            default:
                System.out.println("Invalid Input. Please enter between 1-3.");
                System.out.println();
                TakeOut.displayAmericanFoodMenu();
        }
    }

    //Display Result of Order
    public static void displayOrder(int trays, int feeds, double subtotal) {
        System.out.println("###############################################################");
        System.out.println("You need " + trays + " trays");
        System.out.println("Feeds: " + feeds);
        System.out.println("Price for " + noOfPeople + " people (" + trays + " trays): " + subtotal);
        double tax = TakeOut.getTax(subtotal, TAX_RATE);
        System.out.println("Tax: " + String.format("%.2f", tax));
        double tip = TakeOut.getTip(subtotal, TIP_RATE);
        System.out.println("Tip: " + String.format("%.2f", tip));
        double grandTotal = TakeOut.getGrandTotal(subtotal, tax, tip);
        System.out.println("Total (Food, Tax, Tip): " + String.format("%.2f", grandTotal));
        double pricePerPerson = TakeOut.pricePerPerson(grandTotal, noOfPeople);
        System.out.println("Price per person: " + String.format("%.2f", pricePerPerson));
        System.out.println("Leftover servings for the delivery person: " + TakeOut.determineLeftOvers(feeds, trays, noOfPeople));
        System.out.println("###############################################################");
    }

    public static int determineTrays(int people, int feeds) {
        int tray = 0;
        int rem = people % feeds;
        if (rem != 0) {
            tray = (people / feeds) + 1;
        } else {
            tray = (people / feeds);
        }
        return tray;
    }

    public static double getSubtotal(double price, int trays) {
        return price * trays;
    }

    public static double getTax(double subtotal, double taxrate) {
        return subtotal * taxrate;
    }

    public static double getTip(double subtotal, double tipRate) {
        return subtotal * tipRate;
    }

    public static double getGrandTotal(double subtotal, double tax, double tip) {
        return (subtotal + tax + tip);
    }

    public static double pricePerPerson(double grandTotal, int people) {
        return (grandTotal / people);
    }

    public static int determineLeftOvers(int feeds, int trays, int people) {
        return (feeds * trays - people);
    }
}
