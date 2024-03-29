
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        int i = (100 - number);
        while (i >= 0) {
            System.out.println(number);
            number++;
            i--;
        }

    }
}
