class A{
    public A()
    {
        System.out.println("In default Constructor");
    }
    public void show(){
        System.out.println("In show method");
    }
}
public class AnonymousObj {
    public static void main(String[] args) {

        new A().show();//dont have a name so its anonymous
        new A().show();
    }
}
