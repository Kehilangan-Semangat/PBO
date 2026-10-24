package P4;

import java.util.Scanner;

class Soal2 
{
    void tampilkanHari(Scanner sc) 
    {
        System.out.println("===== SOAL 2: MENENTUKAN NAMA HARI (SWITCH-CASE) =====");
        System.out.print("Masukkan kode hari (1 - 7): ");
        int kodeHari = sc.nextInt();
        sc.nextLine();

        switch (kodeHari) 
        {
            case 1:
                System.out.println("Hari ke-1 adalah Senin");
                break;
            case 2:
                System.out.println("Hari ke-2 adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ke-3 adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ke-4 adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ke-5 adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ke-6 adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-7 adalah Minggu");
                break;
            default:
                System.out.println("Kode hari tidak valid! Harap masukkan angka antara 1 sampai 7.");
                break;
        }
    }

    void tampilkanHari() 
    {
        Scanner sc = new Scanner(System.in);
        tampilkanHari(sc);
    }
}
