class  ATE extends Thread{
    public void run(){
        for(int i=1;i<=100;i++)
        {System.out.println("Hi"+" "+i);}

    }
}
class  BTE extends Thread{
    public void run(){
        for(int i=1;i<=100;i++)
        {System.out.println("Hello"+" "+i);}

    }
}
public class ThreadsExample {
    public static void main(String[] args) {
        ATE a = new ATE();
        BTE b = new BTE();
        a.start();
        b.start();
    }
}
