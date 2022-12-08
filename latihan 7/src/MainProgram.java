public class MainProgram {
        public static void main(String[] args){
// Membuat object engine
            Engine mesin = new Engine();
            /* memanggil atribut dan nilai */
            mesin.merk = "Honda F23A";
            mesin.cc = 2300;
            Mobil odyssey = new Mobil();
            odyssey.merk = "Honda Odyssey";
            odyssey.mesin = mesin;
            odyssey.start();
            odyssey.run();
            odyssey.stop();
    }
}
