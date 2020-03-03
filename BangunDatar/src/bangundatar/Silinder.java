package BangunDatar;

public class Silinder extends Lingkaran {
    private double tinggi;
    private final double PI = (float) 3.14;
    private double r;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getR() {
        return r;
    }

    @Override
    public void setR(double r) {
        this.r = r;
    }

    public double volume(){
        return (double) (PI * Math.pow(this.r, 2)*tinggi);
    }



}
