package P6;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do
        {
            System.out.println("==================================================");
            System.out.println("   PRAKTIKUM PBO - ARRAY, EXCEPTION & THREADING   ");
            System.out.println("==================================================");
            System.out.println("1.  Variasi Sintaks Array Integer");
            System.out.println("2.  Ubah Nilai Array String");
            System.out.println("3.  Operasi Array Satu Dimensi");
            System.out.println("4.  Daftar Nilai Mahasiswa");
            System.out.println("5.  Penjumlahan Matriks Dua Dimensi");
            System.out.println("6.  Rata-rata Array dengan Exception Handling");
            System.out.println("7.  Single Thread");
            System.out.println("8.  Multi-Thread");
            System.out.println("9.  Dua Macam Perulangan Array");
            System.out.println("10. ArrayList dengan Tipe Data Campuran");
            System.out.println("0.  Keluar");
            System.out.println("==================================================");
            System.out.print("Silahkan Masukkan Pilihan Anda (0-10): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan)
            {
                case 1:
                    Soal1.main(null);
                    break;
                case 2:
                    Soal2.main(null);
                    break;
                case 3:
                    Soal3.main(null);
                    break;
                case 4:
                    Soal4.main(null);
                    break;
                case 5:
                    Soal5.main(null);
                    break;
                case 6:
                    Soal6.main(null);
                    break;
                case 7:
                    Soal7.main(null);
                    break;
                case 8:
                    Soal8.main(null);
                    break;
                case 9:
                    Soal9.main(null);
                    break;
                case 10:
                    Soal10.main(null);
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka antara 0 sampai 10.");
                    break;
            }

            System.out.println();
        }
        while (pilihan != 0);

        sc.close();
    }
}
