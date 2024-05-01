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

        switch (tahap) { // Untuk mementukan pilihan tahap pembelian tiket, apakah Presale atau Reguler
            case "1": // Switch case ini akan berjalan jika input tahap adalah "1"
                System.out.print("\nPilih jenis tiket:\n1. VIP\n2. VVIP\nPilih jenis tiket (1/2): ");
                int jenisPresale = scanner.nextInt(); // Pengguna memasukkan jenis tiket, lalu disimpan di int jenisPresale
                System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
                int jumlahPresale = scanner.nextInt(); // Pengguna memasukkan jumlah tiket, lalu disimpan di int jumlahPresale

                Pemesanan pemesananPresale; // Mendeklarasikan variable pemesananPresale dari class Pemesanan
                switch (jenisPresale) { // Untuk mementukan pilihan jenis tiket presale
                    case 1:
                        pemesananPresale = new Pemesanan(nama, "Presale", new VIP(), jumlahPresale); // Membuat objek baru dari class Pemesanan
                        pemesananPresale.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                        break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
                    case 2:
                        pemesananPresale = new Pemesanan(nama, "Presale", new VVIP(), jumlahPresale); // Membuat objek baru dari class Pemesanan
                        pemesananPresale.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                        break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
                    default:
                        System.out.println("Input tidak valid!");
                        break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
                }
                break; // Agar program mengentukan case ini, tidak berlanjut ke case berikutnya

            case "2": // Switch case ini akan berjalan jika input tahap adalah "2"
                System.out.print("\nPilih jenis tiket:\n1. Festival\n2. VIP\n3. VVIP\nPilih jenis tiket (1/2/3): ");
                int jenisReguler = scanner.nextInt(); // Pengguna memasukkan jenis tiket, lalu disimpan di int jenisReguler
                System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
                int jumlahReguler = scanner.nextInt(); // Pengguna memasukkan jumlah tiket, lalu disimpan di int jumlahReguler

                Pemesanan pemesananReguler; // Mendeklarasikan variable pemesananReguler dari class Pemesanan
                switch (jenisReguler) { // Untuk mementukan pilihan jenis tiket reguler
                    case 1:
                        pemesananReguler = new Pemesanan(nama, "Reguler", new Festival(), jumlahReguler); // Membuat objek baru dari class Pemesanan
                        pemesananReguler.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                        break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
                    case 2:
                        pemesananReguler = new Pemesanan(nama, "Reguler", new VIP(), jumlahReguler); // Membuat objek baru dari class Pemesanan
                        pemesananReguler.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                        break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
                    case 3:
                        pemesananReguler = new Pemesanan(nama, "Reguler", new VVIP(), jumlahReguler); // Membuat objek baru dari class Pemesanan
                        pemesananReguler.cetakNota(); // Menjalankan method cetakNota() pada pemesanan
                        break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
                    default:
                        System.out.println("Input tidak valid!");
                        break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
                }
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
            default: // Switch case ini akan berjalan selain input tahap adalah "1" atau "2"
                System.out.println("Input tidak valid!");
                break; // Agar program mengentikan case ini, tidak berlanjut ke case berikutnya
        }
        scanner.close(); // Untuk menutup input dari scanner
    }
}