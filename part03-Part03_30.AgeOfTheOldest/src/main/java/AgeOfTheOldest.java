
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;


        while (true) {
            String input = scanner.nextLine();

            if (!(input.equals(""))) {
                String[] words = input.split(",");
                if (Integer.valueOf(words[1]) > age) {
                    age = Integer.valueOf(words[1]);
                }
                continue;              

                
            } else {
                System.out.println("Age of the oldest: " + age);
                break;
            }
        
                

         

           
            

        }

        


    }
}
