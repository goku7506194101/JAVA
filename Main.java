class Base {
    int x = 20;
    
    void show() {
        System.out.println("Value of base class: " + x);
    }
}

class Sub extends Base {
    int x = 70;
    
    void show() {
        System.out.println("Value of Sub class: " + this.x);
        System.out.println("Value of base class: " + super.x);
    }
}

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        b.show();
        
        Sub s = new Sub();
        s.show();
    }
}