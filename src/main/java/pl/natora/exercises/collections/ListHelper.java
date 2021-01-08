package pl.natora.exercises.collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListHelper {

    public static void removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        if (list != null && !list.isEmpty()) {
            for (int number : list) {
                set.add(number);
            }
            System.out.println(set);
        }
        else {
            System.out.println("List is null or empty");
        }
    }
}