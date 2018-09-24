public class FizzBuzzLoop {

    public static void main(String[] args) {

        int cout = 1;

        while (cout <= 50) {


            if ((cout % 5 == 0) && (cout % 3 == 0)) {
                System.out.println("FizzBuzz");
            } else if (cout % 5 == 0) {
                System.out.println("Buzz");
            } else if (cout % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(cout);
            }
            cout++;
        }


    }


}
