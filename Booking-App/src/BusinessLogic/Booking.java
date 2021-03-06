package BusinessLogic;

import java.util.*;
import DataAccess.*;

public class Booking {
    // Hello am just creating a test text

    String bookingID, date, theme, custName, eventType, venue;
    int noOfPeople;
    double totalCost;
    boolean confirmed;

    public Booking() {

    }

    public Booking(String bookingID, String date, int noOfPeople, String type, String venue, boolean confirmed,
            double totalCost) {
        this.bookingID = bookingID;
        this.date = date;
        this.noOfPeople = noOfPeople;
        this.eventType = type;
        this.venue = venue;
        this.confirmed = confirmed;
        this.totalCost = totalCost;
    }

    public static Booking book(Booking bk) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        bk.custName = input.nextLine();

        System.out.println("Enter Event type");
        bk.eventType = input.nextLine();

        System.out.println("Enter Event date (DDMMYYYY)");
        bk.date = input.nextLine();

        System.out.println("Enter venue");
        bk.venue = input.nextLine();

        System.out.println("How many people will be attending?");
        bk.noOfPeople = input.nextInt();

        bk.confirmed = false;

        bk.bookingID = "12345"; // autogenerate

        double totalCost = Booking.calculateCosts(); // still to be implemented

        bk.totalCost = Booking.discout(bk.noOfPeople, totalCost);

        // Do food selection

        return bk;

    }

    public static double calculateCosts() {
        // overall booking costs
        double total = 0;

        return total;

    }

    public static double discout(int noOfPeople, double totalCosts) {

        double newTotal = totalCosts;

        if (noOfPeople > 40) {
            newTotal = newTotal - (newTotal * 0.15);
        }

        return newTotal;
    }

    public static Booking confirmBooking(Booking bk) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount");
        Double deposit = input.nextDouble();

        if (deposit >= bk.totalCost) {
            bk.confirmed = true;
            System.out.println("Booking onfirmed");
        }

        return bk;
    }

    public static void viewBookings(List<Booking> lst) {

        // read from file

        for (Booking b : lst) {
            System.out.println(b);
        }
    }
}
