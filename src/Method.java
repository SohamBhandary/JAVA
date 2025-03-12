 class  Human{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void walk()
    {
        System.out.println("Walking");
    }
    public void run()
    {
        System.out.println("Running");
    }
    public void fighting()
    {
        System.out.println("fighting");
    }
}
class Pen{
    public void getMeAPen(int rs)
    {
        if(rs>10)
        {
            System.out.println("You can buy a pen");
        }
        else {
            System.out.println("You cant");
        }
    }
}

public class Method {

    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.run();
        h.fighting();
        h.walk();
        Pen p =new Pen();
        p.getMeAPen(1);


    }
}
