import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to CS 211: Object-Oriented Programming!");
        
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("This course will be fun, " + name + "!");

        scanner.close();
    }
}
