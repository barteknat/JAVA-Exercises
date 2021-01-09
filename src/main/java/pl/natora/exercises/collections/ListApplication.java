package pl.natora.exercises.collections;
import java.util.List;
import java.util.Arrays;

public class ListApplication {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,5,4,6,7,5,1,2,-7,-7,2,100,4,20,-1);
        ListHelper.removeDuplicates(list);
        System.out.println(ListHelper.unrepeatableList);
        assert ListHelper.unrepeatableList.equals(Arrays.asList(5,4,6,7,1,2));
    }
}