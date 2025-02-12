//Latihan method static
public class Mobilana {
    //variable static
    static String Warna = "Hitam";
    static int tahun_produksi = 2001;
    //method static
    static void ubah(){
        Warna = "Abu-Abu";
    }
    static void tampil (){
        System.out.println(Warna);
        System.out.println(tahun_produksi);
    }
    public static void main(String[] args) {
        //pemanggilan method static
        Mobilana.ubah();
        Mobilana.tampil();
    }
}
