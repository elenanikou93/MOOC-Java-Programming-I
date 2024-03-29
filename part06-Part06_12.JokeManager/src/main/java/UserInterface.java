import java.util.Scanner;

public class UserInterface {
    private JokeManager joke;
    private Scanner scanner;

    public UserInterface(JokeManager joke, Scanner scanner) {
        this.joke = joke;
        this.scanner = scanner;
    }

    public void start() {
        

        while (true) {

            System.out.println("Commands:\n" + "1 - add a joke\n" + "2 - draw a joke\n" + "3 - list jokes\n" + "X - stop");
            String input = scanner.nextLine();

            if (input.equals("X")) {
                break;
                
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                joke.addJoke(newJoke);
                
            } else if (input.equals("2")) {
                String randomJoke = joke.drawJoke();
                System.out.println(randomJoke);

            } else if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                joke.printJokes();
            }

        }
    }

}
