enum Laptop1 {
    macbook(200), xps(220), surface(110), thinkpad(160);

    private int price;

    private Laptop1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        for (Laptop1 l : Laptop1.values()) {
            System.out.println(l + ": $" + l.getPrice());
        }
    }
}
