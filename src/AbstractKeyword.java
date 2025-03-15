 abstract class Car{
    public abstract void drive();
     public abstract void fly();
    public void music()
    {
        System.out.println("play music");
    }
}
 abstract class WagonR extends Car{
    public void drive(){
        System.out.println("From WagonR car");

    }
    public void fly()
    {
        System.out.println("Flying");
    }


}
class updatedWagonar extends WagonR{ //concrete class
    @Override
    public void fly() {
        super.fly();
        System.out.println("From updatedWagonar fly");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
//        Car c = new Car();//cannot create object of abstartc car
//        Car c = new WagonR();
//        c.drive();
//        c.music();
////        WagonR w = new WagonR();
////        w.drive();
//        c.fly();
        updatedWagonar uw= new updatedWagonar();
        uw.fly();
        uw.drive();
        uw.music();
    }
}
