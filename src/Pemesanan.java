// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) { // Konstruktor dengan input nama, tahap, tiket, dan jumlah
        this.nama = nama; // Menyimpan nama pemesan tiket
        this.tahap = tahap; // Menyimpan tahap pembelian tiket
        this.tiket = tiket; // Menyimpan jenis tiket
        this.jumlah = jumlah; // Menyimpan jumlah tiket yang ingin dibeli
    }

    public void cetakNota() { // Menampilkan output nota
        // Do your magic here
        double totalHarga = tiket.getHarga(tahap) * jumlah; // Mendeklarasikan variable totalHarga yang berisi dari method getHarga dikali dengan jumlah
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama); // Menampilkan nama
        System.out.println("Tahap Pembelian: " + tahap); // Menampilkan tahap pembelian tiket
        System.out.println("Jenis Tiket: " + tiket.getJenis()); // Menampilkan jenis tiket yang dipilih
        System.out.println("Jumlah Tiket: " + jumlah); // Menampilkan jumlah tiket yang dipilih
        System.out.println("Total Harga: Rp " + totalHarga); // Menampilkan total harga dari pembelian
    }
}