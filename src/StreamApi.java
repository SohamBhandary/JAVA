import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 6, 7, 2);

        // 1. Filtering even numbers
        System.out.println("Filtered Even Numbers:");
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // 2. Squaring each number using map
        System.out.println("\nSquared Numbers:");
        nums.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // 3. Summing all numbers using reduce
        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b); // Accumulate sum
        System.out.println("\nSum of all numbers: " + sum);

        // 4. Finding the maximum number using reduce
        int max = nums.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Maximum number: " + max);

        // 5. Sum of squares of even numbers using filter, map, and reduce
        int sumOfSquaresOfEvens = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum); // Sum of squared even numbers
        System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEvens);
    }
}
