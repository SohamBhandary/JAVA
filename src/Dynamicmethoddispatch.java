class X{
    public void show()
    {
        System.out.println("In class X");
    }


}
class Y extends X{
    public void show()
    {

        System.out.println("In class Y");
    }


}
public  class Dynamicmethoddispatch {
    public static void main(String[] args) {
        X x = new X();
        x.show();
        x=new Y();
        x.show();

    }
}