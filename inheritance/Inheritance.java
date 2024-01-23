package inheritance;

public class Inheritance {
   
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 8;
        persegipanjang.lebar = 4;
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
        
    }
}
