package P4;

import java.util.Scanner;

class Soal1 
{
    void hitungGenapGanjil(Scanner sc) 
    {
        System.out.println("===== SOAL 1: CEK BILANGAN GANJIL / GENAP =====");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int angka = sc.nextInt();
        sc.nextLine();

        if (angka % 2 == 0) 
        {
            System.out.println("Hasil: Bilangan " + angka + " adalah Genap");
        } else 
        {
            System.out.println("Hasil: Bilangan " + angka + " adalah Ganjil");
        }
    }

    void hitungGenapGanjil() 
    {
        Scanner sc = new Scanner(System.in);
        hitungGenapGanjil(sc);
    }
}
