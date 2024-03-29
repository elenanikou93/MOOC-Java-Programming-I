
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());

        int daysInHours = days * 24;
        int daysInMinutes = daysInHours * 60;
        int daysInSeconds = daysInMinutes * 60;

        System.out.println(daysInSeconds);

    }
}
