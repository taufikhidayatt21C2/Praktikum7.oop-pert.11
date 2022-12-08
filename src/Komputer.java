public class Komputer {
   private String merk;
   private  String tipe;
   private  Printer printer;
   private Keyboard keyboard;
   private Cpu cpu;

   public Komputer (String merk, String tipe) {
    this.merk =merk;
    this.tipe = tipe;
   }

   public void addKomponen(Printer printer, Keyboard keyboard, Cpu cpu){
        this.printer = printer;
        this.keyboard = keyboard;
        this.cpu= cpu;
   }
}