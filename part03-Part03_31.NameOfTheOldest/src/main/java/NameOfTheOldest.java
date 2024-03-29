
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String oldest = " ";




        while (true) {
            String input = scanner.nextLine();

            if (!(input.equals(""))) {
                String[] words = input.split(",");
                if (Integer.valueOf(words[1]) > age) {
                    age = Integer.valueOf(words[1]);
                    oldest = words[0];
                }
                continue;              

                
            } else {
                System.out.println("Name of the oldest: " + oldest);
                break;
            }
        
                

         

           
            

        }


    }
}
