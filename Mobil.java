//Latihan void method
public class Mobil {
    String warna;
    int tahunProduksi;
    int nomor_mesin;
    int nomor_rangka;
    public static void main(String[] args) {
        Mobil mobilNiaga = new Mobil();
        //Pemanggilan method void
        mobilNiaga.isi();
        mobilNiaga.tampil();
    }
    //Mengisi variabel instance
    void isi(){
        warna = "Pink";
        tahunProduksi = 2001;
        nomor_mesin = 123456;
        nomor_rangka = 98765;
    }
    //Menampilkan isi variabel 
    void tampil(){
        System.out.println("Warna : " + warna);
        System.out.println("Tahun Prouksi : " + tahunProduksi);
        System.out.println("Nomor Mesin : " + nomor_mesin);
        System.out.println("Nomor Rangka : " + nomor_rangka);
    }
} 
