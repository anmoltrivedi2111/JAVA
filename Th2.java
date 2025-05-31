class Thread11 extends Thread 
{
    synchronized public void run() {
        int i =0;
        while(i<10){
            System.out.println("Hello");
            ++i;
        }
    }
}

public class Th2 
{
    public static void main(String args[]) {
        Thread11 t1 = new Thread11();
        t1.start();
    }
}