
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Items> inputs = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if (id.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            Items item = new Items(id, name);

            inputs.add(item);
        }

        Items holder = new Items("none", "none");

        System.out.println("==Items==");

        for (Items input: inputs) {            

            if (holder.equals(input)) {                
                continue;
            } else {
                holder = input;
            }

            System.out.println(input);
        }


    }
}
