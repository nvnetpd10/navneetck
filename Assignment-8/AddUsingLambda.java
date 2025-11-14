import java.util.function.BiFunction;

interface Addable {
    int add(int a, int b);
}

public class AddUsingLambda {
    public static void main(String[] args) {
        Addable add1 = (a,b)->a+b;
        System.out.println(add1.add(5, 15));

        Addable add2 = (a, b) -> a* b;
        System.out.println(add2.add(10, 20));

        BiFunction<Integer , Integer , Integer> add3 =(a , b) -> a+b;
        System.out.println("hello" + add3.apply(30,40));
    }
}
