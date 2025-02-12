//Latihan method non void
public class Mobilku {
    String warna;
    int tahun_produksi;
    int nomorMesin;
    int nomorRangka;
    //Method mengisi variable instance
    void isi (String warna,int tahun_produksi,int nomorMesin, int nomorRangka) {
        this.warna = warna;
        this.tahun_produksi = tahun_produksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;
    }
    //Method menampilkan isi variable
    String ambil_warna (){
        return this.warna;
    }
    int ambil_tahun_produksi (){
        return tahun_produksi;
     }
    int ambil_nomor_Mesin (){
        return nomorMesin;
    }
    int ambil_nomor_Rangka (){
        return nomorRangka;
    }
    public static void main(String[] args) {
        Mobilku mobilNiaga = new Mobilku();
        //Proses pemanggilan method void
        mobilNiaga.isi("Pink", 2001, 12345, 98765);
        System.out.println("Warna  : " + mobilNiaga.ambil_warna());
        System.out.println("Tahun Produksi  : " + mobilNiaga.ambil_tahun_produksi());
        System.out.println("Nomor Mesin  : " + mobilNiaga.ambil_nomor_Mesin());
        System.out.println("Nomor Rangka  : " + mobilNiaga.ambil_nomor_Rangka());

    }

 }
    

