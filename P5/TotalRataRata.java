package P5;

import java.util.Scanner;

public class TotalRataRata
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM TOTAL & RATA-RATA DINAMIS ===");
        System.out.print("Masukkan banyak bilangan: ");
        int n = sc.nextInt();

        double total = 0;
        for (int i = 1; i <= n; i++)
        {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double bilangan = sc.nextDouble();
            total += bilangan;
        }

        double rataRata = 0;
        if (n > 0)
        {
            rataRata = total / n;
        }

        System.out.println("Total penjumlahan : " + total);
        System.out.println("Nilai rata-rata   : " + rataRata);
    }
}
