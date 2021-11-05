public class Arithmetic {
    int sum;
    int proizvedenie;

    int sum(int a, int b) {
        sum = a + b;
        return sum;
    }
    int proizvedenie(int a, int b) {
        proizvedenie = a * b;
        return proizvedenie;
    }
    public static int min(int a, int b) {
        int result;
        if (a < b) {
            result = a;
        } else {
            result = b;
        }
            return result;
        }

    public static int max(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
class TestArithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int a = 10;
        int b = 35;

        System.out.println("Summa value is: " + arithmetic.sum(a, b));
        System.out.println("Proizvedenie value is: " + arithmetic.proizvedenie(a, b));
        System.out.println("Minimum value is: " + Arithmetic.min(a, b));
        System.out.println("Maximum value is: " + Arithmetic.max(a, b));
    }
}

