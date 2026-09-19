import java.util.Scanner;

public class UkuranFile {
    public static final double SATU_KB = 1024.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama file : ");
        String namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte) : ");
        long ukuranByte = scanner.nextLong();

        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        System.out.println("\n===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println(ukuranByte + " byte");

        System.out.println(ukuranKB + " KB");
        System.out.println(ukuranMB + " MB");
        System.out.println(ukuranGB + " GB");

        scanner.close();
    }
}