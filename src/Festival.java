// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Do your magic here
    String getJenis() { // Method getJenis()
        return "Festival"; // Mengembalikan nilai "Festival"
    }

    double getHarga(String tahap) { // Method getHarga(String tahap) yang berisi String tahap
        return 100; // Mengembalikan nilai 100
    }
}