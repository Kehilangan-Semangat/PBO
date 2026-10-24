package P4;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        Soal1 s1 = new Soal1();
        Soal2 s2 = new Soal2();
        Soal3 s3 = new Soal3();
        Soal4 s4 = new Soal4();
        Soal5 s5 = new Soal5();
        Soal6 s6 = new Soal6();
        Soal7 s7 = new Soal7();

        do 
        {
            System.out.println("\n=============================================");
            System.out.println("            PBO STRUKTUR KONTROL");
            System.out.println("=============================================");
            System.out.println("1. Cek Ganjil / Genap");
            System.out.println("2. Nama Hari");
            System.out.println("3. Hitung Gaji Bersih Karyawan");
            System.out.println("4. Cek Tahun Kabisat");
            System.out.println("5. Komisi & Uang Jasa Salesman");
            System.out.println("6. Kasir & Diskon Member");
            System.out.println("7. Menu Luas Bangun Datar");
            System.out.println("8. Jalankan Semua Soal (1 sampai 7 Sekaligus)");
            System.out.println("0. Keluar");
            System.out.println("=============================================");
            System.out.print("Pilih menu (0-8): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    s1.hitungGenapGanjil(sc);
                    break;
                case 2:
                    s2.tampilkanHari(sc);
                    break;
                case 3:
                    s3.hitungGajiBersih(sc);
                    break;
                case 4:
                    s4.cekTahunKabisat(sc);
                    break;
                case 5:
                    s5.hitungKomisiSalesman(sc);
                    break;
                case 6:
                    s6.hitungBelanja(sc);
                    break;
                case 7:
                    s7.hitungLuas(sc);
                    break;
                case 8:
                    s1.hitungGenapGanjil(sc);
                    System.out.println();
                    s2.tampilkanHari(sc);
                    System.out.println();
                    s3.hitungGajiBersih(sc);
                    System.out.println();
                    s4.cekTahunKabisat(sc);
                    System.out.println();
                    s5.hitungKomisiSalesman(sc);
                    System.out.println();
                    s6.hitungBelanja(sc);
                    System.out.println();
                    s7.hitungLuas(sc);
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka antara 0 sampai 8.");
                    break;
            }
        } while (pilihan != 0);
    }
}
