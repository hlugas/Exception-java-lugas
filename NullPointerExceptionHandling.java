package arithmeticexception;
public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        try {
            String str = null;
            
            // Mencoba untuk memanggil metode pada objek yang bernilai null
            int length = str.length();
            
            // Baris ini tidak akan pernah tercetak karena exception telah terjadi
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            // Menangkap NullPointerException dan menangani atau mencetak pesan kesalahan
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
        }
    }
}

