import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        while (true) {
            System.out.print("Enter size of multiplication table: ");
            size = scanner.nextInt();
            if (size > 0) break;
            System.out.println("Please enter a positive number.");
        }

        System.out.println("Multiplication Table:");
        printMultiplicationTable(size);

        scanner.close();
    }

    public static void printMultiplicationTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}