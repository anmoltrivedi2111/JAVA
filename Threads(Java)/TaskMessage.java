class TaskList 
{
    public void painttask() {
        try{
            ProcessBuilder r1 = new ProcessBuilder( "mspaint.exe");
            Process r = r1.start();
            Thread.sleep(5000);
            r.destroy();
        }catch(Exception e1){
            System.out.println("Error! couldn't open file "+ e1);

        }

    }
    public void calctask() {
        ProcessBuilder p2 = new ProcessBuilder("calc.exe");
        try {
            Process p = p2.start();
            Thread.sleep(5000);
            p.destroyForcibly();


    }catch(Exception e2) {
        System.out.println(e2);

    }
    }
    public void message() {
        try {
            System.out.println("Task Done, Showing Message......");
            Thread.sleep(5000);
        
        }
        catch(Exception e3) {
            System.out.println("Error..."+ e3);

        }
    }

}    

class Paint extends Thread
{
    TaskList t1;
    Paint(TaskList  taskobj) {
        t1 = taskobj; 

    }
    synchronized public void run(){
        t1.painttask();
    }
}

class Calculator extends Thread 
{
    TaskList t2;

    Calculator(TaskList taskobj2){
        t2 = taskobj2;
    }

    synchronized public void run(){
        t2.calctask();
    }
}
class MessageTask extends Thread
{
    TaskList t3;
    MessageTask(TaskList taskobj3){
        t3 = taskobj3;
    }
    synchronized public void run() {
        t3.message();
    }

}
class TaskMessage
{
    public static void main(String args[]){
    TaskList task = new TaskList();
    
    Paint p1 = new Paint(task);
    Calculator c1 = new Calculator(task);
    MessageTask m1 = new MessageTask(task);
    
    try{
        p1.start();
        p1.join();

        c1.start();
        c1.join();

        m1.start();
        m1.join();

    }catch(Exception e4){
        System.out.println(e4);

    }



}
}

