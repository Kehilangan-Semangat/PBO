package P4;

import java.util.Scanner;

class Soal3 
{
    void hitungGajiBersih(Scanner sc) 
    {
        System.out.println("===== SOAL 3: HITUNG GAJI BERSIH KARYAWAN =====");

        System.out.print("Masukkan NIK: ");
        String nik = sc.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Golongan (1 - 4): ");
        int golongan = sc.nextInt();
        sc.nextLine();

        double gajiPokok;
        switch (golongan) 
        {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                gajiPokok = 0;
                System.out.println("Golongan tidak valid! Gaji pokok diatur ke Rp 0.");
                break;
        }

        System.out.println("Status Pernikahan:");
        System.out.println(" 1. Menikah");
        System.out.println(" 2. Single / Belum Menikah");
        System.out.println(" 3. Cerai");
        System.out.print("Pilih status pernikahan (1-3): ");
        int status = sc.nextInt();
        sc.nextLine();

        String statusPernikahan;
        double tunjanganPasangan = 0;

        switch (status) 
        {
            case 1:
                statusPernikahan = "Menikah";
                tunjanganPasangan = 0.10 * gajiPokok;
                break;
            case 2:
                statusPernikahan = "Single / Belum Menikah";
                tunjanganPasangan = 0;
                break;
            case 3:
                statusPernikahan = "Cerai";
                tunjanganPasangan = 0;
                break;
            default:
                statusPernikahan = "Tidak Diketahui";
                tunjanganPasangan = 0;
                break;
        }

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = sc.nextInt();
        sc.nextLine();
        if (jumlahAnak < 0) 
        {
            jumlahAnak = 0;
        }

        double tunjanganAnak = (0.05 * gajiPokok) * jumlahAnak;

        double gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;

        System.out.println("\n---------------- RINCIAN GAJI ----------------");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Golongan            : " + golongan);
        System.out.printf("Gaji Pokok          : Rp %,.2f\n", gajiPokok);
        System.out.println("Status Pernikahan   : " + statusPernikahan);
        System.out.printf("Tunjangan Pasangan  : Rp %,.2f\n", tunjanganPasangan);
        System.out.println("Jumlah Anak         : " + jumlahAnak);
        System.out.printf("Tunjangan Anak      : Rp %,.2f\n", tunjanganAnak);
        System.out.println("----------------------------------------------");
        System.out.printf("Gaji Bersih         : Rp %,.2f\n", gajiBersih);
        System.out.println("----------------------------------------------");
    }

    void hitungGajiBersih() 
    {
        Scanner sc = new Scanner(System.in);
        hitungGajiBersih(sc);
    }
}
