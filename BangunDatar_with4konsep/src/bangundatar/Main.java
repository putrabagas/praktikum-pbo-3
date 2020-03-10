package bangundatar;

public class Main {
    public static void main(String[] args){

        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("\t\t\tPERSEGI");
        System.out.println("====================================================");
        System.out.println("Sisi\t\t: " + persegi.getSisi());
        System.out.println("Luas\t\t: " + persegi.Hitung());
        System.out.println("Keliling\t: " + persegi.Keliling());
        System.out.println("====================================================");

        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        System.out.println("\t\t\tKUBUS");
        System.out.println("====================================================");
        System.out.println("Sisi\t\t: " + kubus.getSisi());
        System.out.println("Volume\t\t: " + kubus.Hitung());
        System.out.println("====================================================");
        

    }
}
