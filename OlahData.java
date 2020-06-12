import java.util.Scanner;

class OlahData { // class ini yang akan di wariskan nantinya.
    public static Scanner input = new Scanner(System.in);
    public static void input_data(){
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