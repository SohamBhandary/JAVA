class Humanbeing{

    private int age;
    private String name;
    public Humanbeing(){
        System.out.println("Within Deafult Construtor");
    }
    public Humanbeing(int age,String name)
    {
        this.age=age;
        this.name=name;
        System.out.println(this.age);
        System.out.println(this.name);


        System.out.println("Its within Parametreized Constructor ");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Humanbeing h= new Humanbeing();
        Humanbeing h1=new Humanbeing(27,"JAVA");

    }
}
