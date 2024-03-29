
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int years = 0;
        double average = 0;
        String name = "";




        while (true) {
            String input = scanner.nextLine();

            if (!(input.equals(""))) {
                String[] words = input.split(",");
                if (words[0].length() > name.length()) {
                    name = words[0];
                    
                }
                counter++;
                years += Integer.valueOf(words[1]);


                continue;              

                
            } else {
                average = (1.0 * years) / counter;
                System.out.println("Longest name: " + name);
                System.out.println("Average of the birth years: " + average);
                break;
            }
        
                

         

           
            

        }


    }
}
