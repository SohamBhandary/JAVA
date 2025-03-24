import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class TryWithResources {
    public static void main(String[] args) {
        // Using try-with-resources to read input from the console
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter your name: ");
            String name = br.readLine(); // Reading user input

            System.out.println("Hello, " + name + "!"); // Displaying the input

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
