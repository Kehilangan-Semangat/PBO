package P4;

import java.util.Scanner;

class Soal5 
{
    void hitungKomisiSalesman(Scanner sc) 
    {
        System.out.println("===== SOAL 5: KOMISI & PENDAPATAN SALESMAN =====");
        System.out.print("Masukkan nominal pendapatan hasil penjualan: Rp ");
        double penjualan = sc.nextDouble();
        sc.nextLine();

        double uangJasa;
        double persenKomisi;

        if (penjualan <= 2000000) 
        {
            uangJasa = 100000;
            persenKomisi = 0.10;
        } else if (penjualan <= 5000000) 
        {
            uangJasa = 200000;
            persenKomisi = 0.15;
        } else 
        {
            uangJasa = 300000;
            persenKomisi = 0.20;
        }

        double komisi = persenKomisi * penjualan;
        double totalPendapatan = uangJasa + komisi;

        System.out.println("\n------------- RINCIAN PENDAPATAN SALESMAN -------------");
        System.out.printf("Hasil Penjualan    : Rp %,.2f\n", penjualan);
        System.out.printf("Uang Jasa          : Rp %,.2f\n", uangJasa);
        System.out.printf("Komisi (%.0f%%)       : Rp %,.2f\n", (persenKomisi * 100), komisi);
        System.out.println("------------------------------------------------------");
        System.out.printf("Total Pendapatan   : Rp %,.2f\n", totalPendapatan);
        System.out.println("------------------------------------------------------");
    }

    void hitungKomisiSalesman() 
    {
        Scanner sc = new Scanner(System.in);
        hitungKomisiSalesman(sc);
    }
}
