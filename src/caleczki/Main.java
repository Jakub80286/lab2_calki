package caleczki;

public class Main {

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        Trapezy trapez = new Trapezy(a,b);
        Simpson simpson = new Simpson(a,b);
        Prostokaty prostokat = new Prostokaty(a,b);
        trapez.start();
        simpson.start();
        prostokat.start();
    }
}