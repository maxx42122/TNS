package Statickeyword;

class Counter {
    static int count = 0; // static variable

    Counter() {
        count++;
        System.out.println("Object " + count + " created.");
    }
}

public class TestStatic {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

