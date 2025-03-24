@Deprecated
class AA1 {

    public void show() {
        System.out.println("in class a");
    }
}

class BB1 extends AA1 {
    @Override
    public void show() { // Corrected to match parent method
        System.out.println("in class b");
    }
}

public class Annotations {
    public static void main(String[] args) {
        BB1 b = new BB1();
        b.show(); // Calling the overridden method
    }
}
