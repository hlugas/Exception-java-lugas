package arithmeticexception;
public class IllegalArgumentExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Hasil pembagian: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi IllegalArgumentException: " + e.getMessage());
        }
    }

    // Metode untuk melakukan pembagian dengan penanganan IllegalArgumentException
    private static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator tidak boleh nol");
        }

        return numerator / denominator;
    }
}

