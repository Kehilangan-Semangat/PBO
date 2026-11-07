package P5;

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
            System.out.println("       PRAKTIKUM PBO - PERULANGAN (LOOPING)       ");
            System.out.println("==================================================");
            System.out.println("1. Min & Max (10 Bilangan)");
            System.out.println("2. Total & Rata-rata Dinamis");
            System.out.println("3. Floyd's Triangle");
            System.out.println("4. Deret Bilangan Ganjil");
            System.out.println("5. Pola Bintang");
            System.out.println("6. Logika Rumpang");
            System.out.println("7. Pre vs Post Increment");
            System.out.println("8. Perulangan For-Each Array");
            System.out.println("0. Keluar");
            System.out.println("==================================================");
            System.out.print("Pilih menu (0-8): ");
            pilihan = sc.nextInt();
            System.out.println();

            switch (pilihan)
            {
                case 1:
                    MinMax.main(null);
                    break;
                case 2:
                    TotalRataRata.main(null);
                    break;
                case 3:
                    FloydsTriangle.main(null);
                    break;
                case 4:
                    DeretGanjil.main(null);
                    break;
                case 5:
                    PolaBintang.main(null);
                    break;
                case 6:
                    LogikaRumpang.main(null);
                    break;
                case 7:
                    PrePostIncrement.main(null);
                    break;
                case 8:
                    ForeachArray.main(null);
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka antara 0 sampai 8.");
                    break;
            }

            System.out.println();
        }
        while (pilihan != 0);

        sc.close();
    }
}
