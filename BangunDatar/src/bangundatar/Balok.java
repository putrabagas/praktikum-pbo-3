package BangunDatar;

public class Balok extends PersegiPanjang {
    private double tinggi;
    private double panjang,lebar;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }


    public double volume(){
        return panjang*lebar*tinggi;
    }
}
