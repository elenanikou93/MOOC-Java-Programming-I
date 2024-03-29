
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;


        while (true) {
            System.out.print("First: " + first + "/100\n" + "Second: " + second + "/100\n");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (amount >= 0) {
                
                    if (command.equals("add")) {
                        if (first + amount <= 100) {
                            first += amount;
                        } else {
                            first = 100;
                        }                                    
                    } else if (command.equals("move")) {
                        if (first - amount >= 0) {
                            if (second + amount <= 100) {
                                second += amount;
                                first -= amount;
                            } else if (second + amount > 100) {
                                second = 100;
                                first -= amount;
                            }
                        } else if (first - amount < 0) {
                            if (first == 0) {
                                continue;
                            } else {
                                second += first;
                                first = 0;
                            }
                        }
                    } else if (command.equals("remove")) {
                        if (second - amount >= 0) {
                            second -= amount;
                        } else if (second == 0) {
                            continue;
                        } else if (second - amount < 0) {
                            second = 0;
                        }
                    }


                } else if (amount < 0) {
                    continue;                    
                }
            }

            

            

        }
    }

}
