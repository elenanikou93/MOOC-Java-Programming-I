
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(6);
        values.add(-1);
        values.add(5);
        values.add(1);

        printNumbersInRange(values, 0, 5);
        printNumbersInRange(values, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
        for (Integer number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);                
            }
        }

    }
    
}
