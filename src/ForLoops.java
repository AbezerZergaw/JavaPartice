import java.util.Scanner;

public class ForLoops {


    public void convertNum() {
        Scanner sc = new Scanner(System.in);
        int loopCount;
        double millmeter = 25.4;

        for (loopCount = 1; loopCount <= 15; loopCount++) {
            System.out.println("Enter nubmer: ");
            int value = sc.nextInt();
            double result = value * millmeter;
            System.out.println(value + " inch is: " + result + " in MM");
            loopCount++;


        }


    }

}
