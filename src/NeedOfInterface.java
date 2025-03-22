interface Computer {
     public void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Laptop");
    }
}

class Dev implements Computer {
    public void code() { // Correct method name
        System.out.println("Computer");
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Dev d = new Dev();
        lap.code();
        d.code();
    }
}
