package P6;

import java.util.Scanner;

class ThreadPekerja extends Thread
{
    private String nama;

    public ThreadPekerja(String nama)
    {
        this.nama = nama;
    }

    @Override
    public void run()
    {
        System.out.println(nama + " mulai berjalan.");
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(nama + " iterasi ke-" + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(nama + " terinterupsi: " + e.getMessage());
            }
        }
        System.out.println(nama + " selesai.");
    }
}

public class Soal8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread anak yang ingin dibuat: ");
        int jumlah = sc.nextInt();

        ThreadPekerja[] threads = new ThreadPekerja[jumlah];

        System.out.println("\nMenjalankan " + jumlah + " thread anak...");
        for (int i = 0; i < jumlah; i++)
        {
            threads[i] = new ThreadPekerja("Thread-Anak-" + (i + 1));
            threads[i].start();
        }

        for (int i = 0; i < jumlah; i++)
        {
            try
            {
                threads[i].join();
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread utama terinterupsi: " + e.getMessage());
            }
        }

        System.out.println("\nSemua thread anak telah selesai bekerja.");
    }
}
