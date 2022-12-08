public class MainKomputer {
    public static void main(String[] args) {

        //membuat objek komputer
        Komputer komputer =new Komputer("ASUS","Vivibook15");

        //membuat komponen nya
        komputer.addKomponen(new Printer("Epson"), new Keyboard("QWRTY"), new Cpu("Intel CORE i5"));
    }
}
