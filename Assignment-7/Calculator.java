import java.util.*;
class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
    double divide(int a, int b) { return (double) a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        Calculator c = new Calculator();
        System.out.println(c.add(a, b));
        System.out.println(c.subtract(a, b));
        System.out.println(c.multiply(a, b));
        System.out.println(c.divide(a, b));
    }
}
