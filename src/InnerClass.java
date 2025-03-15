class IC{
    int age;
    public void show(){
        System.out.println("in show");

    }
    class IC1{
        public  void config(){
            System.out.println("In config");
        }

    }
}
public class InnerClass {
    public static void main(String[] args) {
        IC i = new IC();
        i.show();
        IC.IC1 ic1=i.new IC1();
        ic1.config();
    }
}
