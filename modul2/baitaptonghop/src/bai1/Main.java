package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add new customer's information");
            System.out.println("2. Display all customer's infomation");
            System.out.println("3. Delete customer's infomation by customer's number");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    manager.addInformation();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    System.out.println("Enter customer's number to delete information");
                    int deleteNumber = scanner.nextInt();
                    manager.deleteCustomerInformation(deleteNumber);
                case 4:
                    System.exit(4);
            }
        }while (choice!=0);
    }
}
