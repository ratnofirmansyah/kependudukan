import java.util.Scanner;

public class Kependudukan {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // if (HalamanLogin() == 'login_success') {

            // System.out.println("Silahkan pilih menu :");
            // System.out.println("1.Input Data Kependudukan");
            // System.out.println("2.Lihat Data Kependudukan");
            // System.out.print("Masukkan pilihan : ");

            // int pilih = input.nextInt();
            // switch(pilih){
            //     case 1:
                input_data();
                
                // case 2:
                // cetak_data();
            // }
        // }else{
            
        // }
    }

    public static void input_data(){
        System.out.print("Silakan Masukan Nama Desa : ");
        String nama_desa = input.next();
        Desa desa_penduduk = new Desa(nama_desa);
        Penduduk data_penduduk = new Penduduk("Firman", 22, "Laki Laki", "Belum Kawin");
        Penduduk data_penduduk = new Penduduk("Fahrul", 22, "Laki Laki", "Kawin Belum");
        Penduduk data_penduduk = new Penduduk("Rangga", 23, "Laki Laki", "Mau Kawin");

        penduduk_1.CetakHeaderPenduduk();
        penduduk_1.CetakPenduduk();
        penduduk_2.CetakPenduduk();
        penduduk_3.CetakPenduduk();
    }

    public static void cetak_data(Desa desa_penduduk, Penduduk data_penduduk){
        System.out.print("Silakan Masukan Nama Desa : ");
        String nama_desa = input.next();
        Desa desa_penduduk = new Desa(nama_desa);
        Penduduk penduduk_1 = new Penduduk("Firman", 22, "Laki Laki", "Belum Kawin");
        Penduduk penduduk_2 = new Penduduk("Fahrul", 22, "Laki Laki", "Kawin Belum");
        Penduduk penduduk_3 = new Penduduk("Rangga", 23, "Laki Laki", "Mau Kawin");

        penduduk_1.CetakHeaderPenduduk();
        penduduk_1.CetakPenduduk();
        penduduk_2.CetakPenduduk();
        penduduk_3.CetakPenduduk();
    }
}
