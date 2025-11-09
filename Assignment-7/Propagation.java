class Propagation {
    void m3() { int x = 10 / 0; }
    void m2() { m3(); }
    void m1() {
        try { m2(); }
        catch (ArithmeticException e) { System.out.println("Caught in m1"); }
    }
    public static void main(String[] args) {
        new Propagation().m1();
    }
}
