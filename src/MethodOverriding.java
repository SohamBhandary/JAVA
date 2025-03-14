 class One{
    public void show(){
        System.out.println("show method of One");
    }

}
class Two extends One{
    public void show(){
     super.show();
        System.out.println("show method of Two");
        System.out.println("This method is overidding the method of parent class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Two t = new Two();
        t.show();

    }
}
