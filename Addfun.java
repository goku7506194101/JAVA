class Addfun {
    void addfun(int a, int b) {
        System.out.println(a + b);
    }

    void addfun(double c, double d) {
        System.out.println(c + d);
    }
    
    public static void main(String[] args) {
        Addfun obj = new Addfun();
        obj.addfun(10, 20);
        obj.addfun(5.5, 6.3);
    }
}
