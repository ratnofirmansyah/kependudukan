public class Kependudukan extends OlahData { // inheritance atau pewarisan
    public static void main(String[] args) {
        Desa desa_penduduk = new Desa();
        Penduduk dataPenduduk[] = new Penduduk[2];
        input_data(desa_penduduk, dataPenduduk);
        cetak_data(desa_penduduk, dataPenduduk);
    }
}
