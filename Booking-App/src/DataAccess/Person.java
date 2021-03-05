package DataAccess;

import java.util.Scanner;
import Presentation.*;

public abstract class Person {

    String name, surname, phone;

    Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void login() {

        String custLogin = "cust";
        String empLogin = "emp";
        Boolean loggedIn = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userInput = input.nextLine();

        if (userInput == custLogin) {
            loggedIn = true;

            CustomerMenu menu = new CustomerMenu();
            menu.Display(loggedIn);
        }

        else if (userInput == empLogin) {

            loggedIn = true;

            EmployeeMenu menu = new EmployeeMenu();
            menu.Display(loggedIn);
        }

        else {

        }

    };

}
