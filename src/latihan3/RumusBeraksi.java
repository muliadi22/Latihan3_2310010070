package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        Rumus Imul = new Rumus();
        
        Imul.sisi = 5;
        Imul.panjang = 10;
        Imul.lebar = 4;
        
        Imul.hitungLuasPersegi();
        System.out.println("Hasil luas persegi : " + Imul.getHasil());
        
        Imul.hitungLuasPersegiPanjang();
        System.out.println("Hasil luas persegi panjang : " + Imul.getHasil());
    }
 
}
