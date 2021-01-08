package pl.natora.exercises.collections;
import java.util.List;
import java.util.Arrays;

public class ListApplication {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,4,2,5,1,3);
        ListHelper.removeDuplicates(list);
    }
}