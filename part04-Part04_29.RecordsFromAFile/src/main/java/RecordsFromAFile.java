
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner data = new Scanner(Paths.get(file))) {
            while (data.hasNextLine()) {
                String line = data.nextLine();
                String[] list = line.split(",");
                String name = list[0];
                int age = Integer.valueOf(list[1]);
                System.out.println(name + ", age: " + age + " years"); 
            }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
