package P6;

import java.util.Scanner;
import java.util.Arrays;

public class Soal3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Masukkan nilai elemen indeks ke-" + i + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int idxMax = 0;
        int idxMin = 0;
        int total = 0;
        int totalGanjil = 0;
        int totalGenap = 0;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                idxMax = i;
            }

            if (arr[i] < min)
            {
                min = arr[i];
                idxMin = i;
            }

            total += arr[i];

            if (i % 2 == 0)
            {
                totalGenap += arr[i];
            }
            else
            {
                totalGanjil += arr[i];
            }
        }

        double rataRata = (double) total / n;

        System.out.println("\nNilai Terbesar : " + max + " (pada indeks ke-" + idxMax + ")");
        System.out.println("Nilai Terkecil : " + min + " (pada indeks ke-" + idxMin + ")");
        System.out.println("Total Penjumlahan Seluruh Elemen : " + total);
        System.out.println("Nilai Rata-rata : " + rataRata);

        System.out.println("Hasil Penjumlahan Elemen Berindeks Ganjil : " + totalGanjil);
        if (totalGanjil % 2 == 0)
        {
            System.out.println("Status Penjumlahan Indeks Ganjil : Genap");
        }
        else
        {
            System.out.println("Status Penjumlahan Indeks Ganjil : Ganjil");
        }

        System.out.println("Hasil Penjumlahan Elemen Berindeks Genap : " + totalGenap);
        if (totalGenap % 2 == 0)
        {
            System.out.println("Status Penjumlahan Indeks Genap : Genap");
        }
        else
        {
            System.out.println("Status Penjumlahan Indeks Genap : Ganjil");
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        System.out.print("Array Setelah Diurutkan : ");
        for (int i = 0; i < sortedArr.length; i++)
        {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }
}
