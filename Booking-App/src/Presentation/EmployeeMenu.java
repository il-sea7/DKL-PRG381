package Presentation;

import java.util.*;

import BusinessLogic.Booking;
import DataAccess.*;

public class EmployeeMenu {
    public void Display(Boolean loggedIn) {
        Scanner sc = new Scanner(System.in);
        Booking bk = new Booking();

        String option;
        while (loggedIn) {
            for (int i = 0; i < EmployeeMenuItems.values().length; i++) {
                System.out.printf("\n %d %s", i + 1, EmployeeMenuItems.values()[i]);
            }

            option = sc.nextLine();
            System.out.print(option);

            switch (Integer.parseInt(option)) {
            case 1:

                Booking.viewBookings(CustomerMenu.bookings);

                break;

            case 2:
                loggedIn = false;
                break;

            default:
                break;
            }
        }
    }
}
