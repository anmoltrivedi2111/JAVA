import java.io.*;

class CharDemo {
    public static void main(String args[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            System.out.println(x+y);
        }catch(Exception e1){
            System.out.println(e1);
        }
    }
}