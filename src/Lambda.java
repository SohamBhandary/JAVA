import java.lang.FunctionalInterface;

@FunctionalInterface
interface Ans11 {
    void run(int i);
}

public class Lambda {
    public static void main(String[] args) {
        Ans11 obj = i -> {
            System.out.println("completed with value: " + i);
        };
        obj.run(5); // Pass the value directly
    }
}
