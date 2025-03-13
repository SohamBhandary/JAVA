

class Grandfather{
    public void showGrand(){
        System.out.println("Within Grandfather class");

    }
}
class Father extends Grandfather{
    public void showFather(){
        System.out.println("Within father class");
    }
}
class Children extends Father{
    public void showChildren(){
        System.out.println("Within Children");
    }
}
public class MultilevelInheritence {
    public static void main(String[] args) {
        Children c = new Children();
        c.showGrand();
        c.showFather();
        c.showChildren();

    }

}
