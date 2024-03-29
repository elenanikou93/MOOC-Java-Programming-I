import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] words = {"cat", "dog", "ant", "goat"};

        sort(array);
        sort(words);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(words));

        ArrayList<Integer> intNum = new ArrayList<>();
        intNum.add(30);
        intNum.add(54);
        intNum.add(0);
        intNum.add(8);
        intNum.add(122);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("ant");
        animals.add("goat");

        sortIntegers(intNum);
        sortStrings(animals);

        System.out.println(intNum);
        System.out.println(animals);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }



}
