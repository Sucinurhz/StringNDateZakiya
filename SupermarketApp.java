import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SupermarketApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loginSuccess = false;

        // Login Process
        while (!loginSuccess) {
            System.out.println("+-----------------------------------------------------+");
            System.out.print("Username: ");
            String username = "admin"; // pre-filled username
            System.out.print("Password: ");
            String password = "1234"; // pre-filled password
            System.out.print("Captcha (Masukkan '12345'): ");
            String captcha = "12345"; // pre-filled captcha
            System.out.println("+-----------------------------------------------------+");

            // Validate login (String methods: equals, trim)
            if (username.trim().equals("admin") && password.trim().equals("1234") && captcha.trim().equals("12345")) {
                loginSuccess = true;
                System.out.println("Login berhasil!\n");
            } else {
                System.out.println("Login gagal, silakan coba lagi.\n");
            }
        }

        // Welcome Message
        System.out.println("Selamat Datang di Supermarket Makmur Jaya");
        Date currentDate = new Date(); // Mengambil tanggal dan waktu saat ini
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Tanggal dan Waktu: " + dateFormat.format(currentDate));
        System.out.println("+-----------------------------------------------------+");

        // Input Transaction Details
        // Di bawah ini akan berfungsi sebagai input statis (contoh yang telah diberikan)
        String noFaktur = "12345";
        String kodeBarang = "A001";
        String namaBarang = "Sabun Mandi";
        double hargaBarang = 15000;
        int jumlahBeli = 3;
        System.out.println("+-----------------------------------------------------+");

        // Calculate Total
        double total = hargaBarang * jumlahBeli;

        // Output Transaction Details
        System.out.println("No. Faktur: " + noFaktur.toUpperCase()); // String method: toUpperCase
        System.out.println("Kode Barang: " + kodeBarang.toLowerCase()); // String method: toLowerCase
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: Rp " + String.format("%.2f", hargaBarang)); // String.format
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("TOTAL: Rp " + String.format("%.2f", total));
        System.out.println("+-----------------------------------------------------+");

        // Input Kasir Name
        // Menggunakan input statis (contoh yang telah diberikan)
        String namaKasir = "Budi";
        System.out.println("Kasir: " + namaKasir);
        System.out.println("+-----------------------------------------------------+");

        // End of program
        System.out.println("Terima kasih telah berbelanja di Supermarket Makmur Jaya!");
        scanner.close();
    }
}
