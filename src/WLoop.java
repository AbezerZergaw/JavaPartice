import java.util.Scanner;

public class WLoop {

    Scanner scan = new Scanner(System.in);

    int count = 1;
    double millmeter = 25.4;


    public void whileLoopcount() {


        while (count < 15) {
            System.out.println("Enter value:");
            int valueInput = scan.nextInt();
            double outPutResult = valueInput * millmeter;
            System.out.println(valueInput + " inch is: " + outPutResult + " MM");
            count++;
        }


    }


}





