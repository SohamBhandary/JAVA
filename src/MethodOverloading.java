class Calculator{
    public int add (int n1, int n2,int n3)
    {
        return n1+n2+n3;
    }
    public int add (int n1, int n2)
    {
        return n1+n2;
    }
    public String add (String n1, String n2)
    {
        return (n1+" "+n2);
    }
}
public class MethodOverloading {


    public static void main(String[] args) {
        Calculator c = new Calculator();
        int r1=c.add(1,2,3);
        System.out.println(r1);
        int r2=c.add(1,2);
        System.out.println(r2);

      String n1="Hello";
      String n2="World";
      String result=c.add(n1,n2);
        System.out.println(result);


    }
}
