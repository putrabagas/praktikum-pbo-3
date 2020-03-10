package bangundatar;

public class Persegi implements BangunDatar {
    private double sisi;
//Konsep Encapsulation
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double Hitung(){
        System.out.println("hitung luas");
        return this.sisi * this.sisi;
    }

    @Override
    public double Keliling() {
        System.out.println("hitung keliling");
        return 4*sisi;
    }
}
