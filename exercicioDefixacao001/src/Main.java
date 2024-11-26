import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String productOne = "Computer";
        String productTwo = "Office desk";

        int age = 33;
        int code = 5290;
        char gender = 'F';

        double priceOne = 1324.0;
        double priceTwo =  654.5;
        double measure = 53.12343;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", productOne, priceOne);
        System.out.printf("%s, which price is $ %.2f%n", productTwo, priceTwo);
        System.out.println();
        System.out.printf("Record %d years old, code %d and gender %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}