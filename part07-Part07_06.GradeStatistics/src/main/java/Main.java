import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        Grades userGrades = new Grades();
                
        UserInterface user = new UserInterface(userGrades, scanner);
        System.out.println("Enter point totals, -1 stops:");

        user.start();
        

        
    }
}
