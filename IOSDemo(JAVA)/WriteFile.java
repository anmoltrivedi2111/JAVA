import java.io.*;


class WriteFile {
    public static void main(String args[]){
        int x = 9000, y = 1212;
        float f = 666.777f;

        try{
            FileOutputStream f1 = new FileOutputStream("data.txt");
            DataOutputStream f2 = new DataOutputStream(f1);
            f2.writeInt(x);
            f2.writeInt(y);
            f2.writeFloat(f);

            FileInputStream f3 = new FileInputStream("data.txt");
            DataInputStream f4 = new DataInputStream(f3);
            int a = f4.readInt();
            int b = f4.readInt();
            float c = f4.readFloat();

            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("C = " + c);
                }catch(Exception e1){
            System.out.println(e1);

        }
    }
}
