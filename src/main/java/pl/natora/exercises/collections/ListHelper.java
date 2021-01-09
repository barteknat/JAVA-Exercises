package pl.natora.exercises.collections;
import java.util.ArrayList;
import java.util.List;

public class ListHelper {

    static List<Integer> unrepeatableList;

    public static void removeDuplicates(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (int number : list) {
                if (!newList.contains(number)) {
                    newList.add(number);
                }
            }
            unrepeatableList = newList;
        }
    }
}
