import java.util.Scanner;

public class BlackJ {

    public static void main(String[] args) {

        int input1;
        int input2;
        int sum = 1;
        // int maxNum = 11;
        int winningNum = 21;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter number from 1 to 11");

        while (sum != 0) {

            System.out.println("Enter first number");
            input1 = input.nextInt();
            System.out.println("Enter second number");
            input2 = input.nextInt();

            sum = input1 + input2;
            if (sum == winningNum) {
                System.out.println("You won: " + sum + " *");
                sum = 0;
            } else if (sum != winningNum && sum == 0) {

                System.out.println("No winner Goodbye.");
            }
        }
    }
}
