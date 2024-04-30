import java.util.Scanner; // Mengimport Scanner

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Memanggil Scanner

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Do your magic here
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine(); // Pengguna menginputkan nama, lalu disimpan di String nama
        System.out.print("\nPilih tahap pembelian:\n1. Presale\n2. Reguler\nPilih tahap pembelian (1/2): ");
        String tahap = scanner.nextLine(); // Pengguna menginputkan tahap, lalu disimpan di String tahap

        switch (tahap) { // Untuk mementikan pilihan tahap pembelian tiket
            case "1": // Switch case ini akan berjalan jika input tahap adalah "1"
                presale(nama, scanner); // Memanggil method presale
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            case "2": // Switch case ini akan berjalan jika input tahap adalah "2"
                reguler(nama, scanner); // Memanggil method reguler
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            default: // Switch case ini akan berjalan selain input tahap adalah "1" atau "2"
                System.out.println("Input tidak valid!");
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
        }
    }

    public static void presale(String nama, Scanner scanner) { // Method presale
        System.out.print("\nPilih jenis tiket:\n1. VIP\n2. VVIP\nPilih jenis tiket (1/2): ");
        int jenis = scanner.nextInt(); // Pengguna memasukkan jenis tiket, lalu disimpan di int jenis
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = scanner.nextInt(); // Pengguna memasukkan jumlah tiket, lalu disimpan di int jumlah

        Pemesanan pemesanan; // Mendeklarasikan variable pemesanan dari class Pemesanan
        switch (jenis) { // Untuk mementikan pilihan jenis tiket
            case 1:
                pemesanan = new Pemesanan(nama, "Presale", new VIP(), jumlah); // Membuat objek baru dari class Pemesanan
                pemesanan.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            case 2:
                pemesanan = new Pemesanan(nama, "Presale", new VVIP(), jumlah); // Membuat objek baru dari class Pemesanan
                pemesanan.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            default:
                System.out.println("Input tidak valid!");
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
        }
    }

    public static void reguler(String nama, Scanner scanner) { // Method presale
        System.out.print("\nPilih jenis tiket:\n1. Festival\n2. VIP\n3. VVIP\nPilih jenis tiket (1/2/3): ");
        int jenis = scanner.nextInt(); // Pengguna memasukkan jenis tiket, lalu disimpan di int jenis
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = scanner.nextInt(); // Pengguna memasukkan jumlah tiket, lalu disimpan di int jumlah

        Pemesanan pemesanan; // Mendeklarasikan variable pemesanan dari class Pemesanan
        switch (jenis) { // Untuk mementikan pilihan jenis tiket
            case 1:
                pemesanan = new Pemesanan(nama, "Reguler", new Festival(), jumlah); // Membuat objek baru dari class Pemesanan
                pemesanan.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            case 2:
                pemesanan = new Pemesanan(nama, "Reguler", new VIP(), jumlah); // Membuat objek baru dari class Pemesanan
                pemesanan.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            case 3:
                pemesanan = new Pemesanan(nama, "Reguler", new VVIP(), jumlah); // Membuat objek baru dari class Pemesanan
                pemesanan.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            default:
                System.out.println("Input tidak valid!");
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
        }
    }
}
