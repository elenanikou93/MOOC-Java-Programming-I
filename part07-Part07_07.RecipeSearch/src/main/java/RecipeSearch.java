import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ingredients = new ArrayList<>();
        ArrayList<String> recipeNames = new ArrayList<>();
        ArrayList<Integer> cookingTimes = new ArrayList<>();

        System.out.print("File to read: ");
        String input = scanner.nextLine();
        System.out.println(); 
        
        

        try (Scanner file = new Scanner(Paths.get(input))) {

            while (file.hasNextLine()) {

                ingredients.add(file.nextLine());

            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }



        //extracting recipe names and cooking times from recipes list
        recipeNames.add(ingredients.get(0));
        cookingTimes.add(Integer.valueOf(ingredients.get(1)));

        for (int i = 2; i < ingredients.size(); i++) {
            if (ingredients.get(i).isEmpty()) {
                recipeNames.add(ingredients.get(i + 1));
                cookingTimes.add(Integer.valueOf(ingredients.get(i + 2)));
            }                        
        }


        //extracting list of ingredients, maintaining the changes of lines to divide them for each recipe
        ingredients.remove(1);
        for (int j = 0; j < ingredients.size(); j++) {
            if (recipeNames.contains(ingredients.get(j))) {
                ingredients.remove(j);                
            }
        }

        for (int k = 0; k < ingredients.size(); k++) {
            if (ingredients.get(k).isEmpty()) {
                ingredients.remove(k + 1);
            }
        } 




        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name");
        System.out.println("find cooking time - search recipes by cooking time\nfind ingredient - searches recipes by ingredient");


        while (true) {

            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }

                if (command.equals("list")) {
                    System.out.println("Recipes:");                
                    

                    for (int j = 0; j < recipeNames.size(); j++) {
                        System.out.println(recipeNames.get(j) + ", cooking time: " + cookingTimes.get(j));
                    }
                    
                    continue;
                    
                } else if (command.equals("find name")) {
                    System.out.print("Searched word: ");
                    String word = scanner.nextLine();
                    System.out.println("\nRecipes: ");

                    for (int n = 0; n < recipeNames.size(); n++) {
                        if (recipeNames.get(n).contains(word)) {
                            System.out.println(recipeNames.get(n) + ", cooking time: " + cookingTimes.get(n));
                        }
                    }

                    continue;

                } else if (command.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    int maxTime = Integer.valueOf(scanner.nextLine());
                    System.out.println("\nRecipes: ");

                    for (int k = 0; k < cookingTimes.size(); k++) {
                        if (cookingTimes.get(k) <= maxTime) {
                            System.out.println(recipeNames.get(k) + ", cooking time: " + cookingTimes.get(k));
                        }
                    }

                    continue;

                } else if (command.equals("find ingredient")) {
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    System.out.println("\nRecipes: ");
                    
                    

                    if (ingredients.contains(ingredient)) {

                        int recipe = 0;
                        int index = 0;

                        while (index < ingredients.size()) {
                            if (ingredients.get(index).isEmpty()) {
                                recipe++;
                                index++;
                                continue;
                            }

                            if (ingredients.get(index).equals(ingredient)) {
                                System.out.println(recipeNames.get(recipe) + ", cooking time: " + cookingTimes.get(recipe));                                
                            }

                            index++;
                        }

                    } else {
                        System.out.println("Recipes:\n");
                        continue;
                    }



                }

            
        }

    }

}
