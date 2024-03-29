
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();


            if (!(input.equals(""))) {
                String[] outcome = input.split(" ");
                

                for (int j = 0; j < outcome.length; j++){
                    if (outcome[j].contains("av")){
                        System.out.println(outcome[j]);
                    }
                }
                continue;
            } else {
                break;
            }
        }


    }
}
