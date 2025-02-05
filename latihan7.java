import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan7 {
    public static void main(String[] args) throws IOException{
        String nama;
        int umur;
        //Membuat objek inputsream
        InputStreamReader isr = new InputStreamReader(System.in);
        //Membuat objek buffereader
        BufferedReader br = new BufferedReader(isr);
        //Mengisi variabel nama dengan BuffeReader
        System.out.print("Inputkan nama anda :");
        nama = br.readLine();
        System.out.print("Inputkan umur anda :");
        umur = Integer.parseInt(br.readLine());
        //Tampilkan output isi variabel nama
        System.out.println("Nama anda adalah " + nama);
        System.out.println("Umur " + umur);
        
    }
    
}
