package P4;

import java.util.Scanner;

class Soal7 
{
    void hitungLuas(Scanner sc) 
    {
        System.out.println("===== SOAL 7: MENU HITUNG LUAS BANGUN DATAR =====");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih bangun datar (1 - 5): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) 
        {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double sisi = sc.nextDouble();
                sc.nextLine();
                double luasPersegi = sisi * sisi;
                System.out.printf("Luas Persegi (sisi %.2f) = %.2f\n", sisi, luasPersegi);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = sc.nextDouble();
                sc.nextLine();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.printf("Luas Segitiga (alas %.2f, tinggi %.2f) = %.2f\n", alas, tinggi, luasSegitiga);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double r = sc.nextDouble();
                sc.nextLine();
                double luasLingkaran = Math.PI * r * r;
                System.out.printf("Luas Lingkaran (r %.2f) = %.2f\n", r, luasLingkaran);
                break;

            case 4:
                System.out.print("Masukkan panjang sisi atas (a): ");
                double a = sc.nextDouble();
                System.out.print("Masukkan panjang sisi bawah (b): ");
                double b = sc.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tTrapesium = sc.nextDouble();
                sc.nextLine();
                double luasTrapesium = 0.5 * (a + b) * tTrapesium;
                System.out.printf("Luas Trapesium (a %.2f, b %.2f, tinggi %.2f) = %.2f\n", a, b, tTrapesium, luasTrapesium);
                break;

            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = sc.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = sc.nextDouble();
                sc.nextLine();
                double luasLayangLayang = 0.5 * d1 * d2;
                System.out.printf("Luas Layang-layang (d1 %.2f, d2 %.2f) = %.2f\n", d1, d2, luasLayangLayang);
                break;

            default:
                System.out.println("Pilihan tidak valid! Masukkan angka antara 1 sampai 5.");
                break;
        }
    }

    void hitungLuas() 
    {
        Scanner sc = new Scanner(System.in);
        hitungLuas(sc);
    }
}
