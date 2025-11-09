class Counter {
    static int count = 0;
    Counter() { count++; }
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(count);
    }
}
