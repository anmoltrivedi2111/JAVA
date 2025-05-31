class Demo
{
    void m1() {
        System.out.println("Hi Indore");
    }

    class Demo2 {
        void m2() {
            System.out.println("Hi India");
        }
    }
}
class InDemo {
    public static void main(String args[])
    {
        Demo d1 = new Demo();
        d1.m1();
        Demo.Demo2 d2 = d1.new Demo2();
        d2.m2();
    }
}