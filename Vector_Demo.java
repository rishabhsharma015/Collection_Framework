import java.util.*;

public class Vector_Demo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();

        // Adding objects to vector.
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);

        // Printing vector.
        System.out.println(vec);

        // Removing object from vector.
        System.out.println(vec.remove(3));

        // Checking if an object exist or not.
        System.out.println(vec.contains(5));

        // Setting value at particular index.
        vec.set(1, 10);

        // Check if vector is empty or not
        System.out.println(vec.isEmpty());

        // Clearing the vector
        vec.clear();


    }
}
