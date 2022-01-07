import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();

        student.put(null, "Nam");
        student.put(1, "Binh");
        student.put(2, "loan");
        student.put(null, "Hoa");
        student.put(2, "Mai");

        for(Integer x : student.keySet()) {
            String value = student.get(x);
            System.out.println(x + " : " + value );
        }

        student.remove(2);
        student.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
