import java.util.Scanner;

public class CS1 {
    public static void main (String[] args){
        System.out.println("Welcome to NumDet");
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Continue");
        System.out.println("2. About");
        System.out.println("3. Exit");
        
        System.out.print("Enter your choice: ");
        int choice1 = input.nextInt();

        do {
            if (choice1 == 1){
                break;
            } else if (choice1 == 2){
                System.out.println("The program will determine the user input number if it is positive, negative, and zero value");;
                break;
            } else if (choice1 == 3){
                System.out.println("Thank you for using NumDet");
            } else {
                System.out.println("Invalid Input.");
            }
        } while (true);

        do {
            System.out.print("Enter the number: ");
            double numIn = input.nextDouble();

            if (numIn > 0){
                System.out.println("Your number is positive.");
            } else if (numIn < 0){
                System.out.println("Your number is negative.");
            } else {
                System.out.println("Your number has no value.");
            }

            System.out.println("Do you want to continue?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice here: ");

            int choice2 = input.nextInt();

            if(choice2 == 1){
                continue;
            } else if(choice2 ==2){
                System.out.println("Thank you for using DetNum");
                break;
            }       
        } while (true);

    }
}