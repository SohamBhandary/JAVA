class  ATPS extends Thread{
    public void run(){
        for(int i=1;i<=100;i++)
        {System.out.println("Hi"+" "+i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class  BTPS extends Thread{
    public void run(){
        for(int i=1;i<=100;i++)
        {System.out.println("Hello"+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}

    }
}
public class ThreadPrioritySleepExample {
    public static void main(String[] args) {
        ATPS a = new ATPS();
        BTPS b = new BTPS();
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
//        b.setPriority(Thread.MAX_PRIORITY);

        a.start();
        b.start();


    }
}
