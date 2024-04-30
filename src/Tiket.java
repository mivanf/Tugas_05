// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    //Do your magic here
    abstract String getJenis(); // Memanggil method getJenis()
    abstract double getHarga(String tahap); // Memanggil method getHarga(String tahap) yang berisi String tahap
}