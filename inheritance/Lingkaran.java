package inheritance;


public class Lingkaran extends BangunDatar{
    double r;
    
     double luas(){
        double luas = (double) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
    double keliling(){
        double keliling = (double) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
}
