package P6;

import java.util.Scanner;

public class Soal5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = sc.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\n--- Input Elemen Matriks A ---");
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print("Matriks A [" + i + "][" + j + "]: ");
                matriksA[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Input Elemen Matriks B ---");
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print("Matriks B [" + i + "][" + j + "]: ");
                matriksB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\n--- Tampilan Matriks A ---");
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Tampilan Matriks B ---");
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print(matriksB[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Hasil Penjumlahan Matriks (A + B) ---");
        for (int i = 0; i < baris; i++)
        {
            for (int j = 0; j < kolom; j++)
            {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
