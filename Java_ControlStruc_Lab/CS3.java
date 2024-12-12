import java.util.Scanner;

public class CS3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to AgeCheck");
        
        System.out.println("1. Continue");
        System.out.println("2. About");
        System.out.println("3. Exit");
        
        System.out.print("Enter your choice: ");
        int choice1 = input.nextInt();

        do {
            if (choice1 == 1){
                break;
            } else if (choice1 == 2){
                System.out.println("The program will determine the age and print it in an ascending manner.");
                break;
            } else if (choice1 == 3){
                System.out.println("Thank you for using NumDet");
                return;
            } else {
                System.out.println("Invalid Input.");
            }
        } while (true);

        do {
        System.out.print("Enter Sam's Age: ");
        int sam = input.nextInt();

        System.out.print("Enter San's Age: ");
        int san = input.nextInt();

        System.out.print("Enter Nei's Age: ");
        int nei = input.nextInt();

        int age = Math.min(Math.min(sam, san), nei);

        if (age == sam) {
            System.out.println("Sam is the youngest among the three!");
        } else if (age == san) {
            System.out.println("San is the youngest among the three!");
        } else if (age == nei) {
            System.out.println("Nei is the youngest among the three!");
        } else {
            System.out.println("Error");           
        }

            System.out.println("Do you want to continue?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice here: ");

            int choice2 = input.nextInt();

            if(choice2 == 1){
                continue;
            } else if(choice2 ==2){
                System.out.println("Thank you for using AgeCheck");
                break;
            }

    } while (true);

    }
}
