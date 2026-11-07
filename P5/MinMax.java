package P5;

import java.util.Scanner;

public class MinMax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM MENCARI NILAI TERBESAR & TERKECIL ===");
        System.out.println("Masukkan 10 bilangan:");

        System.out.print("Bilangan ke-1: ");
        int angka = sc.nextInt();
        int max = angka;
        int min = angka;

        for (int i = 2; i <= 10; i++)
        {
            System.out.print("Bilangan ke-" + i + ": ");
            angka = sc.nextInt();

            if (angka > max)
            {
                max = angka;
            }

            if (angka < min)
            {
                min = angka;
            }
        }

        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);
    }
}
