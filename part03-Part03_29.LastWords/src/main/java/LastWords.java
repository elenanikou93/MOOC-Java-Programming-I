
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true) {
            String input = scanner.nextLine();

            if (!(input.equals(""))) {
                String[] words = input.split(" ");
                System.out.println(words[words.length - 1]);
                continue;

            } else {
                break;
            }
            
        }


    }
}
