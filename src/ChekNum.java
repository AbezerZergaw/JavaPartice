import java.util.Scanner;

public class ChekNum {


    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter number :");

        //User input data
        int input = data.nextInt();
        //Loop runs till input equals to 1

        checkNumber(input);

       // int choice = data.nextInt();
        boolean cont = true;
        while (cont) {
            System.out.println("If you would like to continue press 1 if not press any key!");
            int choice = data.nextInt();
            if (choice == 1) {
                System.out.println("Enter another number :");
                input = data.nextInt();
                checkNumber(input);
            } else {
                System.out.println("Thank you for playing");
                cont = false;

            }
        }
    }

    private static void checkNumber(int input) {
        while (input != 1) {
            if (input % 2 == 0) {

                input = input / 2;
                System.out.println(input);

            } else {

                input = (3 * input + 1);
                System.out.println(input);

            }

        }

    }

}