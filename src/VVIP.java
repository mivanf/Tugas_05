// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here
    String getJenis() { // Method getJenis()
        return "VVIP";  // Mengembalikan nilai "VVIP"
    }

    double getHarga(String tahap) { // Method getHarga(String tahap) yang berisi String tahap
        if (tahap.equals("Presale")) { // Untuk mendeteksi apakah pilihan tahapnya adalah untuk tiket "Presale" atau bukan
            return 200 * 0.8; // Mengembalikan nilai 200 * 08, yang berarti ini harga Presale
        }
        return 200; // Mengembalikan nilai 200, untuk harga normal
    }
}