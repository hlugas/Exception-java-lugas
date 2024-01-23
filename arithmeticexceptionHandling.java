package arithmeticexception;
public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        try {
            performArithmeticOperation();
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmetika: " + e.getMessage());
        }
    }

    // Metode untuk melakukan operasi aritmetika yang menyebabkan ArithmeticException
    private static void performArithmeticOperation() {
        int numerator = 10;
        int denominator = 0;

        // Mencoba melakukan pembagian yang akan menimbulkan ArithmeticException
        int result = numerator / denominator;

        // Baris ini tidak akan pernah tercetak karena exception telah terjadi
        System.out.println("Hasil pembagian: " + result);
    }
}

