import java.util.Scanner;
import java.util.HashMap;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
                continue;
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();

                if (dictionary.contains(word)) {
                    System.out.println("Translation: " + this.dictionary.translate(word));
                    continue;
                } else {
                    System.out.println("Word " + word + " was not found");
                    continue;
                }
            }

            System.out.println("Uknown command");
        }
    }

}
