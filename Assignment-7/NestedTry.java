class NestedTry {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
