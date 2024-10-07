import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        scanner.close();
    }
}