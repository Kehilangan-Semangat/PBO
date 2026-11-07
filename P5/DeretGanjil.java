package P5;

import java.util.Scanner;

public class DeretGanjil
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM DERET BILANGAN GANJIL ===");
        System.out.print("Masukkan banyak angka : ");
        int n = sc.nextInt();

        int total = 0;
        int angka = 1;

        for (int i = 1; i <= n; i++)
        {
            System.out.print(angka + " ");
            total += angka;
            angka += 2;
        }

        System.out.println();
        System.out.println("Total penjumlahan : " + total);
    }
}
