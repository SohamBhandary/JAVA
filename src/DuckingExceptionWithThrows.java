import java.io.IOException;

public class DuckingExceptionWithThrows {

    public static void methodA() throws IOException {
        throw new IOException("Error occurred in methodA");
    }


    public static void methodB() throws IOException {
        methodA();
    }

    public static void main(String[] args) {
        try {
            methodB(); // Final place to catch the exception
        } catch (IOException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}
