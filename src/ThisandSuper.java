class A1 extends Object{

    public A1()
    {
        System.out.println("Within A");
    }
    public A1(int n)
    {

        System.out.println("Within A int");
    }

}
class B extends A1{
    public B()
    {

        System.out.println("within B");
    }
    public B(int b)
    {
        this();


        System.out.println("within B int");
    }
}
public class ThisandSuper {
    public static void main(String[] args) {

        B b = new B(6);
    }
}
