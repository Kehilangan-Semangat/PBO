package P2;

import java.util.Scanner;

class main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        //No 1
        System.out.println("===Iustrasi Increment===");
        No1 no1 = new No1();
        no1.tampilkan();
        System.out.println();

        //No 2
        System.out.println("===Menghitung Luas Persegi Panjang===");
        PersegiPanjang pp1 = new PersegiPanjang();
        System.out.println("Panjang: " + pp1.p);
        System.out.println("Lebar: " + pp1.l);
        System.out.println("Luas Persegi Panjang = " + pp1.hL());
        System.out.println();

        //No 3
        System.out.println("===Menghitung Persamaan Kuadrat===");
        PersamaanKuadrat pk1 = new PersamaanKuadrat();
        System.out.println("Nilai a: " + pk1.a);
        System.out.println("Nilai b: " + pk1.b);
        System.out.println("Nilai c: " + pk1.c);
        System.out.println("Persamaan Kuadrat = " + pk1.hitungPersamaanKuadrat());
        System.out.println();

        //No 4
        System.out.println("===Operasi Matematika===");
        OperasiMatematika operasi1 = new OperasiMatematika();
        System.out.println("Nilai x: " + 22);
        System.out.println("Nilai y: " + 33);
        operasi1.hitungOperasi();
        System.out.println();

        //No 5
        System.out.println("===Menghitung Luas Segitiga===");
        Segitiga s1 = new Segitiga();
        System.out.println("Alas Segitiga: " + s1.a);
        System.out.println("Tinggi Segitiga: " + s1.b);
        System.out.println("Luas Segitiga = " + s1.hitungLuasSegitiga());
        System.out.println();

        //no 6
        System.out.println("===Segitiga Pythagoras, Keliling===");
        Segitiga s2 = new Segitiga();
        System.out.println("Alas Segitiga: " + s2.a);
        System.out.println("Tinggi Segitiga: " + s2.b);
        System.out.println("Luas Segitiga = " + s2.hitungLuasSegitiga());
        System.out.println("Sisi Miring = " + s2.hitungSisiMiring());
        System.out.println("Keliling = " + s2.hitungKeliling());
        System.out.println();

        //No 7
        System.out.println("===Mengubah Huruf=== ");
        no7 ubah = new no7();
        System.out.println("Huruf Awal: " + "Saya Belajar Java");
        ubah.ubahLUhuruf();
        System.out.println();

        //No 8
        System.out.println("===Menghitung Jarak Tempuh Cahaya=== ");
        no8 jarak = new no8();
        System.out.println("Jarak Bumi ke Bulan: " + 384400);
        System.out.println("Jarak Bumi ke Matahari: " + 152100000);
        System.out.println("Kecepatan Cahaya: " + 300000);
        jarak.hitungWaktu();
        System.out.println();

        //No 9
        System.out.println("===Konversi Suhu=== ");
        KonversiSuhu suhu = new KonversiSuhu();
        System.out.println("Celcius: "+ 10);
        System.out.println("Fahrenheit: "+ 15);
        System.out.println("Reamur: "+ 50);
        suhu.hitungKonversi();
        System.out.println();

        input.close();
    }
}
