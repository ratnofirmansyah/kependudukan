import java.util.Scanner;

class OlahData { // class ini yang akan di wariskan nantinya.
    public static Scanner input = new Scanner(System.in);
    public static void input_data(Desa desa_penduduk, Penduduk dataPenduduk[]){
        // input desa melalui class desa
        System.out.print("Silakan Masukan Nama Desa : ");
        String desa = input.next();
        desa_penduduk.setNamaDesa(desa);

        // input penduduk melalui class penduduk
        int totalPenduduk = 0;
        while (totalPenduduk<2) {
            System.out.print("\nNama : ");
            String nama = input.next();
            System.out.print("Status Kawin : ");
            String kawin = input.next();
            System.out.print("Jenis Kelamin : ");
            String jenkel = input.next();
            input.nextLine();
            System.out.print("Umur : ");
            int umur = input.nextInt();
            System.out.println("Data Ke-"+(totalPenduduk+1)+" Disimpan!\n");

            dataPenduduk[totalPenduduk] = new Penduduk(nama, umur, jenkel, kawin);
            System.out.print("Input Lagi? [Yes=1/ No=0] : ");
            int inputLagi = input.nextInt();
            if (inputLagi==1) {
                totalPenduduk++;
            }else{
                totalPenduduk=2;
            }
        }
    }

    public static void cetak_data(Desa desa_penduduk, Penduduk dataPenduduk[]){
        desa_penduduk.tampilDesa();
        dataPenduduk[0].CetakHeaderPenduduk();
        for (int i = 0; i < dataPenduduk.length; i++){
            dataPenduduk[i].CetakPenduduk();
        }
    }
}