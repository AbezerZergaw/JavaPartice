import java.util.Scanner;

public class CardGame {

    public static int getVal(String card){

        Scanner sc = new Scanner(System.in);
        if (!card.equals("J") && !card.equals("K") && !card.equals("Q")) {
            if (card.equals("A")) {
                System.out.println("Do you want to enter 1 or 11");
                int val = sc.nextInt();
                return val;
            } else return Integer.parseInt(card);
        } else return Integer.parseInt(card);



    }


}
