
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int sum = first;

        for (int i = (first + 1); i <= last; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);

    }
}
