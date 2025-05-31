import java.io.*;
class CharDemo1 {
    

    
        public static void main(String args[]){
            try{
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String s1=br.readLine();
                FileWriter fw = new FileWriter("Data2.txt");
                while(!s1.equals("quit")){
                    fw.write(s1);
                    fw.flush();
                    s1= br.readLine();
                }
                
            }catch(Exception e1){
                System.out.println(e1);
            }
        }
        
}
