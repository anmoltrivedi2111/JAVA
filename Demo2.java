class Bank
{
    int bal = 0;
    void depo(){
    bal = bal+1;
    }
    void with(){
        bal = bal-1;
    }
}
class TH1 extends Thread
{
    Bank b1;
    public void run()
    {
        for (long i =0;i<10000000;i++){
            b1.depo();
        }
    }
}
class TH2 extends Thread
{
    Bank b2;
    public void run() {
        for(long i=0;i<10000000;i++){
            b2.with();

        }
    }
}
class Demo2
{
    public static void main(String args[])
    {
        Bank bk = new Bank();
        TH1 t1 = new TH1();
        TH2 t2 = new TH2();
        t1.b1 = bk;
        t2.b2 = bk;
            t1.start();
            t2.start();
            try{
                t1.join();
                t2.join();
            }catch (Exception tt)
            {
                System.out.println(tt);
            }
    }
}