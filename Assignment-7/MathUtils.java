class MathUtils {
    static int max(int a, int b) { return a > b ? a : b; }
    static int min(int a, int b) { return a < b ? a : b; }
    static double average(int a, int b) { return (a + b) / 2.0; }
    public static void main(String[] args) {
        System.out.println(MathUtils.max(5, 10));
        System.out.println(MathUtils.min(5, 10));
        System.out.println(MathUtils.average(5, 10));
    }
}
