import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<BirdWatching> birds = new ArrayList<>();        

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String nameInLatin = scan.nextLine();

                birds.add(new BirdWatching(name, nameInLatin, 0));
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String observedBird = scan.nextLine();

                boolean found = false;
                
                for (BirdWatching bird: birds) {
                    if (bird.getName().equals(observedBird)) {
                        bird.addObservation();
                        found = true;
                        break;                        
                    }
                }

                if (found == false) {
                    System.out.println("Not a bird!");
                }

                
            } else if (command.equals("All")) {
                for (BirdWatching bird: birds) {
                    System.out.println(bird);
                }
                    
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String printBird = scan.nextLine();

                for (BirdWatching bird: birds) {
                    if (printBird.equals(bird.getName())) {
                        System.out.println(bird.toString());
                        break;
                    }
                }
            }
        }

    }

}
