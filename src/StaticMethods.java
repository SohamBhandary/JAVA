class Mobile2 {
    String brand;
    int price;
    static String name; // Static variable shared among all objects

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile2 obj) {  // Fixed class reference
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Mobile2 obj1 = new Mobile2();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile2.name = "SmartPhone"; // Static variable is set via class name

        Mobile2 obj2 = new Mobile2();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile2.name = "FeaturePhone"; // This will override the previous "SmartPhone"

        obj1.show(); // Apple :
