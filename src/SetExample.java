
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
      Set<Integer> nums= new TreeSet<>();
      nums.add(3);
        nums.add(83);
        nums.add(2);
        nums.add(42);
        nums.add(1);
        System.out.println(nums);
        Iterator<Integer> val= nums.iterator();
        while(val.hasNext())
        System.out.println(val.next()   );

    }
}
