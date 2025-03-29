import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        System.out.println("Initial List: " + nums);

        nums.add(1, 10);
        System.out.println("After adding 10 at index 1: " + nums);

        nums.set(2, 20);
        System.out.println("After updating index 2 to 20: " + nums);

        nums.remove(3);
        System.out.println("After removing element at index 3: " + nums);

        System.out.println("Contains 6? " + nums.contains(6));

        System.out.println("Element at index 1: " + nums.get(1));

        System.out.println("Size of the list: " + nums.size());

        System.out.print("Elements: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
