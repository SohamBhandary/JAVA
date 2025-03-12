 class Add{
    int a=2;
    public int sum(int a,int b)
    {
        return (a+b);
    }
}
public class OOP {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.a);
        int result =a.sum(3,4);
        System.out.println(result);



    }
}
