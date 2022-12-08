public class Dosenpengampu {
    String nip, nama, nimMhs;
    public Dosenpengampu (String nip, String nama, String nim_Mhs) {
        this.nip = nip;
        this.nama = nama;
        this.nimMhs = nim_Mhs;
    }
    public void infoDosen(){
        System.out.println("DOSEN");
        System.out.println("Nip     ="+ this.nip);
        System.out.println("Nama    ="+ this.nama);
        System.out.println("NIM MAHASISWA   ="+ this.nimMhs);
    }
}
