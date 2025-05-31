// class Bank
// {
//     int bal=0; 
//     synchronized void depo() {
//         if(bal<100)
//         {
//             bal=bal+10;
//         }
//         else{
//             try{
//                 notifyAll();
//                 wait();
//                 Thread.sleep(50);

//             }catch(Exception e1){
//                 System.out.println(e1);
//             }
//         }
//     }
//     synchronized void with() {
        
//     if(bal>10){
//         bal=bal-10;

//     }else{
//         try{
//             notifyAll();
//             wait();
//             Thread.sleep(50);

//         }catch(Exception e2){
//             System.out.println(e2);
//         }
//     }
// }
// }
// class Thread1 extends Thread
// {
//     Bank b;
//     Thread1(Bank b){
//         this.b = b;
//     }
//     public void run(){
//         while (true) {
//             b.depo();
//             System.out.println(b.bal);
//         }
//     }
// }
// class Thread2 extends Thread
// {
//     Bank b;
//     Thread2(Bank b){
//         this.b = b;
//     }
//     public void run(){
//         while (true) {
//             b.with();
//             System.out.println(b.bal);
//         }
//     }
// }

// class WpoolTH
// {
//     public static void main(String args[]){
//         Bank bk=new Bank();
//         Thread1 t1 = new Thread1();
//         Thread2 t2 = new Thread2();
//         t1.b = bk;
//         t2.b = bk;
//             t1.start();
//             t2.start();
//     }
// }