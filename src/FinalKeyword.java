final class abc{
    public void show()
    {
        System.out.println("Since i written final that means this class cannot be inherited");
    }
    // final method cannot be overidden
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int age=1;// value cannot be changed
        System.out.println(age);
         int num=2;//value can be changed since it not declared
        System.out.println(num);
        num=3;
        System.out.println(num);
        abc a = new abc();
        a.show();

    }
}
