import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> stu = new HashMap<>();
        stu.put("soham", 56);
        stu.put("soham1", 57);
        stu.put("soham2", 58);
        stu.put("soham3", 59);
        stu.put("soham", 36);

        System.out.println(stu.keySet());
        for (String name : stu.keySet()) {
            System.out.println(name + " " + stu.get(name));
        }
    }
}
