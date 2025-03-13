class AdderSubtarctor{
    int n1;int n2;
    public int add(int n1,int n2)
    {
        return (n1+n2);
    }
    public int sub(int n1,int n2)
    {
        return (n1-n2);
    }
}
class MulDiv extends AdderSubtarctor{
    public int mul(int n1,int n2)
    {
        return (n1*n2);
    }
    public int div(int n1,int n2)
    {
        return (n1/n2);
    }

}

public class Inheritance {
    public static void main(String[] args) {
//        AdderSubtarctor a = new AdderSubtarctor();
//        System.out.println(a.add(2,2));
//        System.out.println(a.sub(2,2));
        MulDiv m = new MulDiv();



        System.out.println(m.add(2,2));
        System.out.println(m.sub(2,2));
        System.out.println(m.mul(2,2));
        System.out.println( m.div(2,2));


    }
}
