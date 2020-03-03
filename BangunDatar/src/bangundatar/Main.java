package BangunDatar;

// Polymafishm
public class Main {
    public static void main(String[] args){

        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("\t\t\tPERSEGI");
        System.out.println("====================================================");
        System.out.println("Sisi\t\t: " + persegi.getSisi());
        System.out.println("Luas\t\t: " + persegi.Luas());
        System.out.println("Keliling\t: " + persegi.Keliling());
        System.out.println("====================================================");

        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        System.out.println("\t\t\tKUBUS");
        System.out.println("====================================================");
        System.out.println("Sisi\t\t: " + kubus.getSisi());
        System.out.println("Volume\t\t: " + kubus.volume());
        System.out.println("====================================================");
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(4);
        System.out.println("\t\t\tLINGKARAN");
        System.out.println("====================================================");
        System.out.println("R\t\t: " + lingkaran.getR());
        System.out.println("Luas\t\t: " + lingkaran.Luas());
        System.out.println("Keliling\t: " + lingkaran.Keliling());
        System.out.println("====================================================");

        Silinder silinder = new Silinder();
        silinder.setR(4);
        silinder.setTinggi(10);
        System.out.println("\t\t\tSILINDER");
        System.out.println("====================================================");
        System.out.println("Tinggi\t\t: " + silinder.getTinggi());
        System.out.println("R\t\t: " + silinder.getR());
        System.out.println("Volume\t\t: " + silinder.volume());
        System.out.println("====================================================");
        
        PersegiPanjang PP = new PersegiPanjang();
        PP.setLebar(5);
        PP.setPanjang(10);
        System.out.println("\t\t\tPERSEGI PANJANG");
        System.out.println("====================================================");
        System.out.println("Lebar\t\t: " + PP.getLebar());
        System.out.println("Panjang\t\t: " + PP.getPanjang());
        System.out.println("Luas\t\t: " + PP.Luas());
        System.out.println("Keliling\t: " + PP.Keliling());
        System.out.println("====================================================");

        Balok balok = new Balok();
        balok.setPanjang(10);
        balok.setLebar(5);
        balok.setTinggi(8);
        System.out.println("\t\t\tBALOK");
        System.out.println("====================================================");
        System.out.println("Panjang\t\t: " + balok.getPanjang());
        System.out.println("Lebar\t\t: " + balok.getLebar());
        System.out.println("Tinggi\t\t: " + balok.getTinggi());
        System.out.println("Volume\t\t: " + balok.volume());
        System.out.println("====================================================");

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(5);
        segitiga.setTinggi(7);
        System.out.println("\t\t\tSEGITIGA");
        System.out.println("====================================================");
        System.out.println("Alas\t\t: " + segitiga.getAlas());
        System.out.println("Tinggi\t\t: "+ segitiga.getTinggi());
        System.out.println("Luas\t\t: " + segitiga.Luas());
        System.out.println("Keliling\t: " + segitiga.Keliling());
        System.out.println("====================================================");
    }
}
