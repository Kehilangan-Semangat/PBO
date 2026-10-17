package P3;

import java.util.Scanner;

class no6 
{
    void hitungSelisihWaktu() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Waktu Pertama (Jam Menit Detik dipisah spasi): ");
        int j1 = sc.nextInt(); int m1 = sc.nextInt(); int d1 = sc.nextInt();
        
        System.out.println("Input Waktu Kedua (Jam Menit Detik dipisah spasi): ");
        int j2 = sc.nextInt(); int m2 = sc.nextInt(); int d2 = sc.nextInt();

        int totalDetik1 = (j1 * 3600) + (m1 * 60) + d1;
        int totalDetik2 = (j2 * 3600) + (m2 * 60) + d2;
        int selisihDetik = Math.abs(totalDetik1 - totalDetik2); 

        int jam = selisihDetik / 3600;
        selisihDetik %= 3600;
        int menit = selisihDetik / 60;
        int detik = selisihDetik % 60;

        System.out.println("Selisih waktu adalah: " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
    }
}