import java.util.Scanner;

public class UkuranFile {
    // Komentar: 1024.0 disimpan sebagai konstanta bertipe double bernama SATU_KB
    public static final double SATU_KB = 1024.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama file : ");
        String namaFile = scanner.nextLine();

        // Komentar: Menggunakan long agar angka byte bernilai besar tidak error/overflow
        System.out.print("Ukuran (byte) : ");
        long ukuranByte = scanner.nextLong();

        // Komentar: Pembagian dengan 1024.0 (SATU_KB) agar hasil desimal tidak hilang
        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        // Komentar: Casting (int) memotong angka di belakang koma (truncation)
        int ukuranMBDibulatkan = (int) ukuranMB;

        // Komentar: Menghitung selisih antara nilai desimal MB dan pembulatan int
        double selisihPembulatan = ukuranMB - ukuranMBDibulatkan;

        System.out.println("\n===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println(ukuranByte + " byte");
        System.out.println(ukuranKB + " KB");
        System.out.println(ukuranMB + " MB");
        System.out.println(ukuranGB + " GB");
        System.out.println();
        System.out.println("Dibulatkan ke MB : " + ukuranMBDibulatkan);
        System.out.println("Selisih pembulatan: " + selisihPembulatan);
        scanner.close();
    }
}