import java.util.Scanner;

public class UserInterface {
    private Grades userGrades;
    private Scanner scanner;

    public UserInterface(Grades userGrades, Scanner scanner) {
        this.userGrades = new Grades();
        this.scanner = scanner;
    }

    public void start() {
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            } else if (input < 0 || input > 100) {
                continue;
            } else if (input >= 0 && input <= 100) {
                userGrades.add(input);
            }


        }

        System.out.println(userGrades.toString());
        userGrades.printGrades();
    }

}
