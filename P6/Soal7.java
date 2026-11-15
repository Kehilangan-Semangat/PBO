package P6;

class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread anak mulai dijalankan.");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Thread anak mengeksekusi langkah ke-" + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread anak terinterupsi: " + e.getMessage());
            }
        }
        System.out.println("Thread anak selesai dieksekusi.");
    }
}

public class Soal7
{
    public static void main(String[] args)
    {
        System.out.println("Membuat dan menjalankan thread anak...");
        MyThread thread = new MyThread();
        thread.start();

        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread utama terinterupsi: " + e.getMessage());
        }

        System.out.println("Proses thread selesai.");
    }
}
