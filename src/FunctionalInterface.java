@java.lang.FunctionalInterface
interface Ans {
    void show();
}

class Ans1 implements Ans {
    @Override
    public void show() {
        System.out.println("hey");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Ans1 a = new Ans1(); // Instantiate Ans1 instead of Ans
        a.show();
    }
}
