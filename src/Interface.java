interface IF{
    // by default public abstract
    void show();
    void config();
    // all variable within interface are final and static
    int age=72;
}
interface x{
    void run();

}
class B1 implements IF,x{// mandatory to define both methods
    public void show(){
        System.out.println("In show");

    }

    @Override
    public void config() {
        System.out.println("in config");

    }

    @Override
    public void run() {
        System.out.println("running");
    }
}

public class Interface  {
    public static void main(String[] args) {
B1 i = new B1();
i.config();
i.show();
        System.out.println(IF.age);
        i.run();

        // since static we can call it by the name of interface itsel
    }
}
