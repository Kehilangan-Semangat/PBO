package P3;

import java.util.Scanner;

class no1 
{
    void hitungGaji() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nomor Induk Karyawan : ");
        String nik = sc.nextLine();
        System.out.print("Nama Karyawan      : ");
        String nama = sc.nextLine();
        System.out.print("Alamat             : ");
        String alamat = sc.nextLine();
        System.out.println("Jabatan            : Manajer");

        double p1 = 2000000;
        double p2 = 300000;
        double p3 = 200000;
        double p4 = 150000;

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * (p1 + p2 + p4);
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n--- RINCIAN GAJI ---");
        System.out.println("Total Gaji         : Rp " + totalGaji);
        System.out.println("Pajak Penghasilan  : Rp " + pajak);
        System.out.println("Gaji Bersih        : Rp " + gajiBersih);
    }
}