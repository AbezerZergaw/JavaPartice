import java.util.Scanner;

public class PrimeNumber {




    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter number :");
    int num = input.nextInt();



        for (int n = 1; n <= num; n++) {
            boolean isPrime = true;
            if (n == 1) {
                isPrime = false;
            } else if (n == 2 ) {
                isPrime = true;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }

        }
    }

}



