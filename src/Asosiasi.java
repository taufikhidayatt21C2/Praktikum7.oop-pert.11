public class Asosiasi {
    public static void main(String[] args) {
        Mahasisswa taufik = new Mahasisswa("11106", "Taufik Hidayat");

        // Dosenpengampu Agung = new Dosenpengampu ("123456", "Agung Nugroho", "1234567");


        Dosenpengampu Agung = new Dosenpengampu("123456", "Agung Nugroho", taufik.getNim());
        Agung.infoDosen();
    }
}