import java.util.Scanner;

public class ChekNum {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter number :");
        int count = 0;
    //User input data
        int input = data.nextInt();
    //Loop runs till input equals to 1
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