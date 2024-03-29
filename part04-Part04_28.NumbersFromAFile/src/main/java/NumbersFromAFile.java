
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 0;

        try (Scanner line = new Scanner(Paths.get(file))) {
            while (line.hasNextLine()) {
                numbers.add(Integer.valueOf(line.nextLine()));
                }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= upperBound && numbers.get(i) >= lowerBound) {
                counter++;
            }
        }

        System.out.println("Numbers: " + counter);            
    
    
    }       
        

}


