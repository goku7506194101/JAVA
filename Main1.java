class Base {
    int x = 10;

    void show() {
        System.out.println("Value of x: " + x);
    }
}

class Sub extends Base {
    int x = 20;

    void show() {
        System.out.println("Value of x in Subclass:  " + x);
        System.out.println("Value of x in Superclass: " + super.x);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Base b = new Base();
        b.show();

        Sub s = new Sub();
        s.show();
    }
}
