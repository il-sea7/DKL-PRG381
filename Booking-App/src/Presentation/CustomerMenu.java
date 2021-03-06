package Presentation;

import java.util.*;

import BusinessLogic.Booking;
import DataAccess.*;

public class CustomerMenu {
    Scanner sc = new Scanner(System.in);
    String option;

    public static List<Booking> bookings = new ArrayList<Booking>();

    public void Display(Boolean loggedIn) {
        while (loggedIn) {
            for (int i = 0; i < CustomerMenuItems.values().length; i++) {
                System.out.printf("\n %d %s", i + 1, CustomerMenuItems.values()[i]);
            }

            Booking event = new Booking();

            option = sc.nextLine();
            System.out.print(option);

            switch (Integer.parseInt(option)) {
            case 1:

                bookings.add(Booking.book(event));
                break;

            case 2:
                break;

            case 3:
                Booking.confirmBooking(event);
                bookings.set(0, event);
                break;

            case 4:
                break;

            case 5:
                loggedIn = false;
                break;
            default:
                break;
            }
        }

    }

}