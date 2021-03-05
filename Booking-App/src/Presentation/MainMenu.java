package Presentation;

import java.util.*;
import DataAccess.*;

public class MainMenu {

    public void Display(Boolean loggedIn) {

        Scanner sc = new Scanner(System.in);

        String option;

        while (loggedIn) {
            for (int i = 0; i < MainMenuItems.values().length; i++) {
                System.out.printf("\n %d %s", i + 1, MainMenuItems.values()[i]);
            }

            option = sc.nextLine();
            System.out.print(option);

            switch (Integer.parseInt(option)) {
            case 1:
                break;

            case 2:
                Person.login();
                break;
            }
        }
    }
}
