package bangundatar;
//Konsep Inheritance
public class Kubus extends Persegi {
    public double Hitung(){    //Konsep Polymorphism
        return (float) (Math.pow(super.getSisi(), 3));
    }
}
