package P6;

import java.util.Scanner;

public class Soal6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;

        while (true)
        {
            try
            {
                System.out.print("Masukkan jumlah bilangan: ");
                jumlah = Integer.parseInt(sc.nextLine().trim());
                if (jumlah <= 0)
                {
                    System.out.println("Kesalahan: Jumlah bilangan harus lebih dari 0!");
                    continue;
                }
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Kesalahan: Input jumlah harus berupa bilangan bulat!");
            }
        }

        double[] bilangan = new double[jumlah];
        double total = 0;

        for (int i = 0; i < jumlah; i++)
        {
            boolean valid = false;
            while (!valid)
            {
                try
                {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    bilangan[i] = Double.parseDouble(sc.nextLine().trim());
                    total += bilangan[i];
                    valid = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Kesalahan: Input bukan bilangan! Silakan masukkan angka.");
                }
            }
        }

        double rataRata = total / jumlah;
        System.out.println("\nTotal Penjumlahan : " + total);
        System.out.println("Nilai Rata-rata   : " + rataRata);
    }
}
