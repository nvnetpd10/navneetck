import java.util.*;
class Student {
    String name;
    int m1, m2, m3;
    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    int total() { return m1 + m2 + m3; }
    double average() { return total() / 3.0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        Student s = new Student(name, m1, m2, m3);
        System.out.println(s.total());
        System.out.println(s.average());
    }
}
