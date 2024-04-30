// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
    // Do your magic here
    String getJenis() { // Method getJenis()
        return "VIP";  // Mengembalikan nilai "VIP"
    }

    double getHarga(String tahap) { // Method getHarga(String tahap) yang berisi String tahap
        if (tahap.equals("Presale")) { // Untuk mendeteksi apakah pilihan tahapnya adalah untuk tiket "Presale" atau bukan
            return 150 * 0.8; // Mengembalikan nilai 150 * 08, yang berarti ini harga Presale
        }
        return 150; // Mengembalikan nilai 150, untuk harga normal
    }
}
