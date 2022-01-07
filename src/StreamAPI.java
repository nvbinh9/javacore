import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,6,3,2,8,77,44,5443,234,546,243));
        Set<Integer> list1 = list.stream()
                 .filter(number -> number % 2 == 0)
                 .map(number -> number +1)
                 .skip(3)
                 .limit(4)
                 .sorted()
                 .collect(Collectors.toCollection(LinkedHashSet::new));
        list1.forEach(System.out::println);
    }
}
