import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class FizzBuzz {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        int userInput = input.nextInt();

        System.out.println(fizzBuzz(userInput));

    }


    public static String fizzBuzz(int number) {
        String printWord = "";
        int count = 1;

        if (number % 3 == 0) {
            printWord = "Fizz";
        }
        if (number % 5 == 0) {
            printWord = "Buzz";
        }
        if ((number % 5 == 0) && (number % 3 == 0)) {
            printWord = "FizzBuzz";

        }else if (!(number % 5 == 0) && !(number % 3 == 0)) {
            printWord = "Number is not divisible by 3 or 5 ";
        }
        return printWord;


    }
}




