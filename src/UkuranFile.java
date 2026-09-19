import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama file : ");
        String namaFile = scanner.nextLine();

        System.out.print("Ukuran (byte) : ");
        long ukuranByte = scanner.nextLong();

        System.out.println("\n===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println(ukuranByte + " byte");

        scanner.close();
    }
}