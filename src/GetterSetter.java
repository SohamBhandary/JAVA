class Human01
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
    public void SetAge(int age)
    {
        this.age=age;
    }

//	public void SetAge(int a)
//	{
//		age=a;
//	}

//	public int abc()
//	{
//		return age;
//	}
//	public void xyz(int a)
//	{
//		age=a;
//	}


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

//	public void setName(String n)
//	{
//		name=n;
//	}
}

public class GetterSetter {
    public static void main(String[] args)
    {
        Human01 obj=new Human01();
//		obj.xyz(30);
        obj.SetAge(30);
        obj.setName("Soham");
//		obj.age=11;
//		obj.name="Bhandary";

//		System.out.println(obj.abc()+" : "+obj.getAge());
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}