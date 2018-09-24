import java.text.DecimalFormat;

public class FormatDemo {

    public static void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);

        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);

    }

    public static void main(String[] args) {
        customFormat("###,###,###.##", 123456);
    }

}
