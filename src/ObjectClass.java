class O{
     int price;
     String name;
     public String toString(){//overriding the toString method
         return (price +" "+ name);
     }
}
public class ObjectClass {
    public static void main(String[] args) {
        O o = new O();
        o.price=1000;
        o.name="Dell";
        System.out.println(o);
        O o1= new O();
        boolean result = o.equals(o1);
        System.out.println(result);
        boolean result1 = o==o1;
        System.out.println(result1);


    }
}
