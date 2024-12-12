import java.util.Scanner;

public class CS5 {
    public static void main(String[] args) throws Exception {
        Scanner scanz = new Scanner(System.in);

        System.out.println("Fines per days late");

        System.out.print("Enter number of days late: ");
        int days = scanz.nextInt();

        if (days<=5) {
            System.out.println(days + " days = 50 Rupees fine");
        } else if (days<=10) {
            System.out.println(days + " days = 1 Rupees Fine");
        } else if (30>days && days>10) {
            System.out.println(days + " days = 5 Rupees Fine");
        } else if (days>=30) {
            System.out.println(days + " days = Your membership is cancelled.");
        } else {
            System.out.println("Error");
        }
    }
}