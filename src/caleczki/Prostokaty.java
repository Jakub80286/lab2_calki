package caleczki;

import static java.lang.Math.pow;

public class Prostokaty extends Thread{

    double a,b;
    int n;

    public Prostokaty(double a, double b)
    {
        this.a = a;
        this.b = b;
        this.n = 6;
    }


    private static double funkcja(double x){

        return (4*pow(x,2))+ 3*x;
    }

    public void run(){
        double x, wynik = 0;

        double[][] wezly = new double[14][14];
        double[][] wagi = new double[14][14];

        //tablice dla n = 6
        wezly[5][0] = 0.6612093864662645;
        wezly[5][1] = -0.6612093864662645;
        wezly[5][2] = -0.2386191860831969;
        wezly[5][3] = 0.2386191860831969;
        wezly[5][4] = -0.9324695142031521;
        wezly[5][5] = 0.9324695142031521;

        wagi[5][0] = 0.3607615730481386;
        wagi[5][1] = 0.3607615730481386;
        wagi[5][2] = 0.4679139345726910 ;
        wagi[5][3] = 0.4679139345726910;
        wagi[5][4] = 0.1713244923791704;
        wagi[5][5] = 0.1713244923791704;

        //tablice dla n = 8
        wezly[7][0] = -0.1834346424956498;
        wezly[7][1] = 0.1834346424956498;
        wezly[7][2] = -0.5255324099163290;
        wezly[7][3] = 0.5255324099163290;
        wezly[7][4] = -0.7966664774136267;
        wezly[7][5] = 0.7966664774136267;
        wezly[7][6] = -0.9602898564975363;
        wezly[7][7] = 0.9602898564975363;

        wagi[7][0] = 0.3626837833783620;
        wagi[7][1] = 0.3626837833783620;
        wagi[7][2] = 0.3137066458778873;
        wagi[7][3] = 0.3137066458778873;
        wagi[7][4] = 0.2223810344533745;
        wagi[7][5] = 0.2223810344533745;
        wagi[7][6] = 0.1012285362903763;
        wagi[7][7] = 0.1012285362903763;

        //tablice dla n = 10
        wezly[9][0] = -0.1488743389816312;
        wezly[9][1] = 0.1488743389816312;
        wezly[9][2] = -0.4333953941292472;
        wezly[9][3] = 0.4333953941292472;
        wezly[9][4] = -0.6794095682990244;
        wezly[9][5] = 0.6794095682990244;
        wezly[9][6] = -0.8650633666889845;
        wezly[9][7] = 0.8650633666889845;
        wezly[9][8] = -0.9739065285171717;
        wezly[9][9] = 0.9739065285171717;

        wagi[9][0] = 0.2955242247147529;
        wagi[9][1] = 0.2955242247147529;
        wagi[9][2] = 0.2692667193099963;
        wagi[9][3] = 0.2692667193099963;
        wagi[9][4] = 0.2190863625159820;
        wagi[9][5] = 0.2190863625159820;
        wagi[9][6] = 0.1494513491505806;
        wagi[9][7] = 0.1494513491505806;
        wagi[9][8] = 0.0666713443086881;
        wagi[9][9] = 0.0666713443086881;

        //tablice dla n = 12
        wezly[11][0] = -0.1252334085114689;
        wezly[11][1] = 0.1252334085114689;
        wezly[11][2] = -0.3678314989981802;
        wezly[11][3] = 0.3678314989981802;
        wezly[11][4] = -0.5873179542866175;
        wezly[11][5] = 0.5873179542866175;
        wezly[11][6] = -0.7699026741943047;
        wezly[11][7] = 0.7699026741943047;
        wezly[11][8] = -0.9041172563704749;
        wezly[11][9] = 0.9041172563704749;
        wezly[11][10] = -0.9815606342467192;
        wezly[11][11] = 0.9815606342467192;

        wagi[11][0] = 0.2491470458134028;
        wagi[11][1] = 0.2491470458134028;
        wagi[11][2] = 0.2334925365383548;
        wagi[11][3] = 0.2334925365383548;
        wagi[11][4] = 0.2031674267230659;
        wagi[11][5] = 0.2031674267230659;
        wagi[11][6] = 0.1600783285433462;
        wagi[11][7] = 0.1600783285433462;
        wagi[11][8] = 0.1069393259953184;
        wagi[11][9] = 0.1069393259953184;
        wagi[11][10] = 0.0471753363865118;
        wagi[11][11] = 0.0471753363865118;

        //tablice dla n = 14
        wezly[13][0] = -0.1080549487073437;
        wezly[13][1] = 0.1080549487073437;
        wezly[13][2] = -0.3191123689278897;
        wezly[13][3] = 0.3191123689278897;
        wezly[13][4] = -0.5152486363581541;
        wezly[13][5] = 0.5152486363581541;
        wezly[13][6] = -0.6872929048116855;
        wezly[13][7] = 0.6872929048116855;
        wezly[13][8] = -0.8272013150697650;
        wezly[13][9] = 0.8272013150697650;
        wezly[13][10] = -0.9284348836635735;
        wezly[13][11] = 0.9284348836635735;
        wezly[13][12] = -0.9862838086968123;
        wezly[13][13] = 0.9862838086968123;

        wagi[13][0] = 0.2152638534631578;
        wagi[13][1] = 0.2152638534631578;
        wagi[13][2] = 0.2051984637212956;
        wagi[13][3] = 0.2051984637212956;
        wagi[13][4] = 0.1855383974779378;
        wagi[13][5] = 0.1855383974779378;
        wagi[13][6] = 0.1572031671581935;
        wagi[13][7] = 0.1572031671581935;
        wagi[13][8] = 0.1215185706879032;
        wagi[13][9] = 0.1215185706879032;
        wagi[13][10] = 0.0801580871597602;
        wagi[13][11] = 0.0801580871597602;
        wagi[13][12] = 0.0351194603317519;
        wagi[13][13] = 0.0351194603317519;

        for (int i = 0; i < n; i++) {
            x = (((b - a) / 2) * wezly[n-1][i] + ((b + a) / 2));
            wynik+= (wagi[n-1][i] * funkcja(x));
        }

        wynik *= (b-a) / 2;

        System.out.println("\n Prostokaty:  = " + wynik);
    }
}