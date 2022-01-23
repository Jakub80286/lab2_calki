package caleczki;

import static java.lang.Math.pow;

class Trapezy extends Thread
{
    double a,b;
    int n;

    public Trapezy(double a, double b)
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

        double h, wynik = 0;
        h = (b - a) / n;

        for (int i=1; i<n; i++) {
            wynik += funkcja(a + i * h);
        }

        wynik += (funkcja(a) + funkcja(b)) / 2;
        wynik *= h;

        System.out.println("\n Trapezy = " + wynik);
    }
}