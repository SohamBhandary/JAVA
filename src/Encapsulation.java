class Human0
{
    //int age;
    //private int age=11;
    private int age;
    //String name;
    //private String name="Navin";
    private String name;

    public int getAge()
    {
        return age;
    }
    public void SetAge(int a)
    {
        age=a;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}

public class Encapsulation {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Human0 obj=new Human0();
        obj.SetAge(30);
        obj.setName("Soham");
//		obj.age=11;
//		obj.name="Bhandary";

        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}