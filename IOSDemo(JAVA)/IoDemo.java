import java.io.*;

class IoDemo
{
    public static void main(String args[]){
        try{
            FileInputStream f1 = new FileInputStream("222222.jpeg");
            int x =f1.read();
            FileOutputStream f2 = new FileOutputStream("pppp.jpeg");
            while(x!=-1){
                f2.write(x);
                x = f1.read();

            }
            f1.close();
            f2.close();

        }catch(Exception e1){
            System.out.println(e1);
        }
    }
}
