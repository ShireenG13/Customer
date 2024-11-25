import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Customer {

    Scanner input = new Scanner(System.in);

    String[] customerNames = new String[5];

    public void inputCustomerData() {
        String fullName;
        String firstName = "";
        String lastName = "";
        for (int i = 0; i < customerNames.length; i++) {

            System.out.println("Enter the first name: " + (i+1) + "");
            firstName = input.nextLine();
            while(firstName.isEmpty()) {
                System.out.println("First name cannot be empty"+ "\n");
                System.out.println("Enter the last name: " + (i+1) + "");
                firstName = input.nextLine();
            }
            System.out.println("Enter the last name: " + (i+1) + "");
            lastName = input.nextLine();
            while(lastName.isEmpty()) {
                System.out.println("Last name cannot be empty"+ "\n");
                System.out.println("Enter the last name: " + (i+1) + "");
                lastName = input.nextLine();
            }

            customerNames[i] = firstName + " " + lastName;
        }

        }
        /*for (int i = 0; i < customerNames.length; i++) {
            while(true) {
                System.out.println("Enter first name of the customer" + i + 1);
                firstName = input.next();
                System.out.println("Enter last name of the customer" + i + 1);
                lastName = input.next();
            }
            if(firstName.isEmpty() || lastName.isEmpty()) {
                System.out.println("Enter first name of the customer" + i + 1);
                firstName = input.next();
                System.out.println("Enter last name of the customer" + i + 1);
                lastName = input.next();

            }

            fullName = firstName + " " + lastName;
            customerNames[i] = fullName;


        }

    }

         */

    public void displayCustomerData() {
        for (String name : customerNames) {
            System.out.println(name);
        }
    }

}






