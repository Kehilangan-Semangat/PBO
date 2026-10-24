package P4;

import java.util.Scanner;

class Soal6 
{
    void hitungBelanja(Scanner sc) 
    {
        System.out.println("===== SOAL 6: KASIR DENGAN DISKON MEMBER (NESTED IF-ELSE) =====");
        
        System.out.print("Apakah memiliki kartu member? (y/n): ");
        String memberInput = sc.next();
        boolean isMember = memberInput.equalsIgnoreCase("y");

        System.out.print("Masukkan Total Belanja: Rp ");
        double totalBelanja = sc.nextDouble();

        double diskon = 0;

        if (isMember) 
        {
            if (totalBelanja > 500000) 
            {
                diskon = 50000;
            } else if (totalBelanja > 100000) 
            {
                diskon = 15000;
            } else 
            {
                diskon = 0;
            }
        } else 
        {
            if (totalBelanja > 100000) 
            {
                diskon = 10000;
            } else 
            {
                diskon = 0;
            }
        }

        double totalBayar = totalBelanja - diskon;

        System.out.printf("Total Bayar Setelah Diskon: Rp %,.2f\n", totalBayar);
        System.out.print("Masukkan Uang Bayar: Rp ");
        double uangBayar = sc.nextDouble();
        sc.nextLine();

        double kembalian = uangBayar - totalBayar;

        System.out.println("\n---------------- STRUK PEMBAYARAN ----------------");
        System.out.println("Status Member : " + (isMember ? "Ya (Member)" : "Tidak (Bukan Member)"));
        System.out.printf("Total Belanja : Rp %,.2f\n", totalBelanja);
        System.out.printf("Diskon        : Rp %,.2f\n", diskon);
        System.out.println("--------------------------------------------------");
        System.out.printf("Total Bayar   : Rp %,.2f\n", totalBayar);
        System.out.printf("Uang Bayar    : Rp %,.2f\n", uangBayar);
        if (kembalian >= 0) 
        {
            System.out.printf("Kembalian     : Rp %,.2f\n", kembalian);
        } else 
        {
            System.out.printf("Uang Kurang   : Rp %,.2f\n", Math.abs(kembalian));
        }
        System.out.println("--------------------------------------------------");
    }

    void hitungBelanja() 
    {
        Scanner sc = new Scanner(System.in);
        hitungBelanja(sc);
    }
}
