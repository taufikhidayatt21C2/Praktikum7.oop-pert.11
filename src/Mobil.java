public class Mobil{
    int Nomer;
    String Keistimewaan;

    Tombol tombol;

    Mobil(int Nomer, String Keistimewaan, Tombol tombol){

        this.Nomer= Nomer;
        this.Keistimewaan= Keistimewaan;
        this.tombol= tombol;
    }

    public static void main(String args[]){

        Tombol ad = new Tombol ("modifikasi", "Sensor :SIDIK JARI");

        Mobil obj1 = new Mobil(2,"Keluaran :TERBARU", ad);
        System.out.println(obj1.Nomer);
        System.out.println(obj1.Keistimewaan);
        System.out.println(obj1.tombol.pintu);
        System.out.println(obj1.tombol.sensor);
    }
}
