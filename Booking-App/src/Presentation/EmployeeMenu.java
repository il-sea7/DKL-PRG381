package Presentation;

import java.util.*;



public class EmployeeMenu{
    public void DisplayEmp(Boolean loggedIn)
    {
        Scanner sc = new Scanner(System.in);
        String option;
        while(loggedIn)
        {
            for(int i = 0; i < EmployeeMenuItems.values().length; i++)
			{
				System.out.printf("\n %d %s", i+1, EmployeeMenuItems.values()[i]);
			}
			
			option = sc.nextLine();						
			System.out.print(option);

            switch (Integer.parseInt(option)) {
                case 1:      
                    break;

                case 5:
                    loggedIn  = false;
                    break;
            }
        }
    }
}


