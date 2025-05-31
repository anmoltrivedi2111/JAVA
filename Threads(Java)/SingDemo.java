class SingDemo {
    int x = 0;
    static SingDemo d1 = null;
    private SingDemo()
    {

    }
    public static SingDemo getobj(){
        if (d1==null)
        {
            d1= new SingDemo();
            d1.x = 9000;

        }
        return d1;
    }
    
}
