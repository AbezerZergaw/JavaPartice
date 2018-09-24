import java.util.Scanner;

public class Number {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number form 1 to 20");
        int userInput= input.nextInt();


        System.out.println(isPrime(userInput));

    }

    public static boolean isPrime(int n) {


        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            System.out.println(n +" is prime");

            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n +" is not prime");
                return false;
            }
        }
        System.out.println(n +" is prime");
        return true;
    }

}
