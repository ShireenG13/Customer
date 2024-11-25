import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Customer {

    Scanner input = new Scanner(System.in);

    String[] customerNames = new String[5];

    public void inputCustomerData() {
        String fullName;
        for (int i = 0; i < customerNames.length; i++) {
            String firstName = "";
            String lastName = "";
            System.out.println("Enter the first name: " + (i+1) + "");
            firstName = input.next();
            if(firstName.equals("")) {
                System.out.println("First name cannot be empty");
            }



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






