public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 21;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("Result is zero, which is not acceptable.");
            }
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
