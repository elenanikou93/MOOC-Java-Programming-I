
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCounter = 0;
        int positiveSum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                positiveCounter = positiveCounter + 1;
                positiveSum = positiveSum + number;
            }
        }

        if (positiveCounter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (positiveSum / (positiveCounter * 1.0));
            System.out.println(average);
        }

    }
}
