import java.util.Scanner;
 
public class CS4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
 
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
 
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
 
        int check;

        if (num1 > num2) {
            check = num1;
            num1 = num2;
            num2 = check;
        }

        if (num2 > num3) {
            check = num2;
            num2 = num3;
            num3 = check;
        }
 
        System.out.println("Numbers in ascending order: " + num1 + ", " + num2 + ", " + num3);

    }

}