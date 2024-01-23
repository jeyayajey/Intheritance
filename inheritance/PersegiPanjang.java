package inheritance;

public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;
    
    double luas(){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;
    }

    double keliling(){
        double kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + kll);
        return kll;
    }
}
