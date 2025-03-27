class  ARVT implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++)
        {System.out.println("Hi"+" "+i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class  BRVT implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++)
        {System.out.println("Hi"+" "+i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class RunnableVsThread {
    public static void main(String[] args) {
       Runnable a = new ARVT();
      Runnable b = new BRVT();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();


    }
}
