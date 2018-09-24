import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class BlackJack21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numerical value");
        System.out.println("Enter First number: ");

        int FirstInput = input.nextInt();
        System.out.println("Enter First number: ");
        int SecondInput = input.nextInt();
        int sum = FirstInput+SecondInput;

        if(sum==21){
            System.out.println("You won "+sum);

        }else
            System.out.println("Game over "+sum);


    }


}
