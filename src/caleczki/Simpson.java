package caleczki;

import static java.lang.Math.pow;


public class Simpson extends Thread {

    double a,b;
    int n;

    public Simpson(double a, double b)
    {
        this.a = a;
        this.b = b;
        this.n = 6;
    }

    //f(x)
    private static double funkcja(double x){

        return (4*pow(x,2))+ 3*x;
    }

    public void run(){

        double h, temp, wynik, x;
        temp = 0; wynik = 0;

        h = (b - a) / n;

        for (int i=1; i<n; i++){
            x = a + i * h;
            temp += funkcja(x - h / 2);
            wynik += funkcja(x);
        }
        temp += funkcja(b - h / 2);
        wynik = (h/6) * (funkcja(a) + funkcja(b) + 2*wynik + 4*temp);

        System.out.println("\n Simpson = " + wynik);
    }
}