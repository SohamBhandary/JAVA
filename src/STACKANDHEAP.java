class Calculator1
{
    int num=5;
    public int add(int n1, int n2)
    {
        System.out.println(num);
        return n1+n2;
    }
}


public class STACKANDHEAP {
    public static void main(String[] args) {
        int data=10;
        Calculator1 obj=new Calculator1();
        Calculator1 obj1=new Calculator1();
        int r1=obj.add(3,4);
        //System.out.println(r1);
        obj.num=8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}