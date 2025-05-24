class Test {
    int x;
    float f;
    char ch;
    boolean b;

    public static void main(String[] args) {
        Test t1 = new Test();

        t1.x = 10;
        t1.f = 3.14f;
        t1.ch = 'A';
        t1.b = true;

        
        System.out.println( t1.x);
        System.out.println( t1.f);
        System.out.println( t1.ch );
        System.out.println(t1.b);
    }
}
