public class Penduduk {
    protected String nama;
    protected int umur;
    protected String jenis_kelamin;
    protected String status_kawin;
    Penduduk(String nama, int umur, String jenis_kelamin, String status_kawin) {
        this.nama = nama;
        this.umur = umur;
        this.jenis_kelamin = jenis_kelamin;
        this.status_kawin = status_kawin;
    }
    public void CetakHeaderPenduduk() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("| Nama\t\t\t| Umur\t| Jenis Kelamin\t| Status Kawin\t|");
        System.out.println("----------------------------------------------------------------");
    }
    public void CetakPenduduk() {
        System.out.println("| "+nama+"\t\t| "+umur+"\t| "+jenis_kelamin+"\t| "+status_kawin+"\t|");
        System.out.println("----------------------------------------------------------------");
    }
}