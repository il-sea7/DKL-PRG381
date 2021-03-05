package Presentation;

import java.util.*;

public class CustomerMenu{
    Scanner sc = new Scanner(System.in);
    String option;

    public void Display(Boolean loggedIn){
        while(loggedIn)
        {
            for(int i = 0; i < CustomerMenuItems.values().length; i++)
			{
				System.out.printf("\n %d %s", i+1, CustomerMenuItems.values()[i]);
			}
			
			option = sc.nextLine();						
			System.out.print(option);

            switch (Integer.parseInt(option)) {
                case 1:      
                    break;
            
                case 2:
                    break;
                
                case 3:      
                    break;
            
                case 4:
                    break;
            
                case 5:
                    loggedIn  = false;
                    break;
            }
        }
        
    }
    
}