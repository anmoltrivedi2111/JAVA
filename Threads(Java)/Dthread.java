class ABC {
    XYZ x1;

    synchronized void m1() {
        System.out.println("I'M M1");
        x1.m4();
    }

    synchronized void m2() {
        System.out.println("I'M m2");

    }
}

class XYZ {
    ABC a1;

    synchronized void m3() {
        System.out.println("I'M m3");
        a1.m2();
    }

    synchronized void m4() {
        System.out.println("I'M m4");
    }
}

class Thread1 extends Thread {
    ABC a2;

    public void run() {
        while (true) {
            a2.m1();
        }
    }
}

class Thread2 extends Thread {
    XYZ x2;

    public void run() {
        x2.m3();

    }

}

class Dthread {
    public static void main(String args[]) {
        ABC ab = new ABC();
        XYZ xy = new XYZ();
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        ab.x1 = xy;
        xy.a1 = ab;
        t1.a2 = ab;
        t2.x2 = xy;
        t1.start();
        t2.start();

    }
}

// deadlock can be avoided if a synchronized method of a class will not invoke
// another synchronized method of another class.