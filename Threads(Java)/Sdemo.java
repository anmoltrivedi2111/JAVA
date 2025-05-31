class Sdemo {

    public static void main(String args[]){
        SingDemo t1 = SingDemo.getobj();
        System.out.println(t1.x);
        SingDemo t2 = SingDemo.getobj();
        t2.x = t2.x +9000;
        System.out.println(t2.x);
        SingDemo t3 = SingDemo.getobj();
        t3.x = t3.x+18000;
        System.out.println(t3.x);
    }
    
}


