import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("Enter number of elements: ");
            n = scanner.nextInt();
            if (n > 0) break;
            System.out.println("Please enter a positive number.");
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        double mean = getArrayMean(numbers);

        System.out.printf("Mean of array is: %.2f\n", mean);

        scanner.close();
    }

    public static double getArrayMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}