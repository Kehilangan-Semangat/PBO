package P4;

import java.util.Scanner;

class Soal4 
{
    void cekTahunKabisat(Scanner sc) 
    {
        System.out.println("===== SOAL 4: CEK TAHUN KABISAT =====");
        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();
        sc.nextLine();

        boolean isKabisat = (tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0);

        if (isKabisat) 
        {
            System.out.println("Hasil: Tahun " + tahun + " adalah TAHUN KABISAT.");
        } else 
        {
            System.out.println("Hasil: Tahun " + tahun + " BUKAN TAHUN KABISAT.");
        }
    }

    void cekTahunKabisat() 
    {
        Scanner sc = new Scanner(System.in);
        cekTahunKabisat(sc);
    }
}
