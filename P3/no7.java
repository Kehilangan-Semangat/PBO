package P3;

import java.util.Scanner;

class no7 
{
    void hitungWaktuCetak() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyaknya novel yang akan dicetak : ");
        int jumlahNovel = sc.nextInt();
        System.out.print("Tebalnya lembar per novel         : ");
        int tebal = sc.nextInt();

        int totalDetik = jumlahNovel * tebal; 
        int hari = totalDetik / 86400;
        int sisa = totalDetik % 86400;
        int jam = sisa / 3600;
        sisa %= 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("Waktu yang diperlukan untuk mencetak:");
        System.out.println(hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
    }
}