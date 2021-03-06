package DataAccess;

import java.util.*;
import Presentation.*;

public abstract class Person {

    String id;
    String name;
    String surname;
    String phone;

    Person(String id, String name, String surname, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public static void login() {

        String custLogin = "cust";
        String empLogin = "emp";
        Boolean loggedIn = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userInput = input.nextLine();

        if (userInput.equals(custLogin)) {
            loggedIn = true;

            CustomerMenu menu = new CustomerMenu();
            menu.Display(loggedIn);
        }

        else if (userInput.equals(empLogin)) {

            loggedIn = true;

            EmployeeMenu menu = new EmployeeMenu();
            menu.Display(loggedIn);//Write take list, and file name
        }

        else {

        }

    };

}
