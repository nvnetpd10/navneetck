class Rethrow {
    public static void main(String[] args) {
        try {
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Handled inside, rethrowing");
                throw e;
            }
        } catch (ArithmeticException e) {
            System.out.println("Handled again in outer catch");
        }
    }
}
