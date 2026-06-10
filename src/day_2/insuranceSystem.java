package day_2;

import java.util.Scanner;

public class insuranceSystem {

    public static void main(String[] args) {

        Vehicle obj = new Vehicle(5, "mshcl", "car", "shivam", "500000", "3045" );
        obj.showVehicleDetails();



        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice != 5){
            System.out.println("--- Insurance System ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Show Vehicle Details");
            System.out.println("3. Details about Bike, Car and Trucks");
            System.out.println("4. Close");
            System.out.println("Enter Here: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 5:
                    System.out.println("close");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");

            }
        }
    }
}
