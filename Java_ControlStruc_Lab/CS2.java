import java.util.Scanner;

public class CS2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.println("Welcome to AppDet");
        
        System.out.println("1. Continue");
        System.out.println("2. About");
        System.out.println("3. Exit");
        
        System.out.print("Enter your choice: ");
        int choice1 = input.nextInt();

        do {
            if (choice1 == 1){
                break;
            } else if (choice1 == 2){
                System.out.println("The program will determine the user inputs a number character or symbol");
                break;
            } else if (choice1 == 3){
                System.out.println("Thank you for using NumDet");
                return;
            } else {
                System.out.println("Invalid Input.");
            }
        } while (true);

        do {
            System.out.print("Enter an input: ");
            char input1 = input.next().charAt(0);
    
            if (Character.isLetter(input1)) {
                System.out.println( input1 + " is in the alphabet");
            } else if (Character.isDigit(input1)) {
                System.out.println(input1 + " is a number");
            } else {
                System.out.println(input1 + " is a symbol");
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