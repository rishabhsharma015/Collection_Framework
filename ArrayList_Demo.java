import java.util.*;

public class ArrayList_Demo extends Object{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Adding elements to the list.
        list.add("Rishabh");
        list.add("Kabir");
        list.add("Hritik");
        list.add("Sagar");

        // Printing list
        System.out.println(list);

        // Removing element from the list. - Returns a boolean.
        list.remove("Rishabh");

        // Checking if list contains a particular object or not? - Returns a boolean
        System.out.println(list.contains("Kabir"));

        // Check if list is Empty or not?
        System.out.println(list.isEmpty());

        // Setting value on particular index. - Returns the Replaced value.
        System.out.println(list.set(2, "Shahrukh"));

        // Clearing the arraylist.
        list.clear();
    }
}
