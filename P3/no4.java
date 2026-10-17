package P3;

import java.util.Scanner;

class no4 
{
    void hitungSentripetal() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Massa (M) kg      : ");
        double m = sc.nextDouble();
        System.out.print("Masukkan Kecepatan (V) m/s : ");
        double v = sc.nextDouble();
        System.out.print("Masukkan Jari-jari (r) m   : ");
        double r = sc.nextDouble();

        double fc = (m * Math.pow(v, 2)) / r;
        System.out.println("Gaya Sentripetal (Fc)      = " + fc + " Newton");
    }
}
