
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();


            if (!(input.equals(""))) {
                String[] outcome = input.split(" ");
                for (int i = 0; i < outcome.length; i++){
                    System.out.println(outcome[i]);
                
            
                }
                continue;
            } else {
                break;
            }
            
            
        }

    }


}

