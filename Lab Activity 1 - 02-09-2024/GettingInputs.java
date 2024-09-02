import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the Genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the Album Name: ");
        String album = scanner.nextLine();

        System.out.print("Enter the Title of the Song: ");
        String title = scanner.nextLine();

        System.out.print("Enter the Artist's Name: ");
        String artist = scanner.nextLine();
        
        System.out.println("\nS O N G  D E T A I L S:");
        System.out.println("__________________________\n");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + "\"" + title + "\"");
        System.out.println("Artist: " + artist);

        scanner.close();
    }
}