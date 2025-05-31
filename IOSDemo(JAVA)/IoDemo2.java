import java.io.*;
class IoDemo2 {
    



    public static void main(String args[]){
        try{
            FileInputStream f1 = new FileInputStream("Demo2.java");
            File ff = new File("Demo2.java");
            int x =(int)ff.length();

            byte b[] = new byte[x];
            f1.read(b);

            FileOutputStream f2 = new FileOutputStream("TestDemo.java");

                f2.write(b);
            String s1 = new String(b);
            System.out.println(s1);
                
            f1.close();
            f2.close();

        }catch(Exception e1){
            System.out.println(e1);
        }
    }
}


