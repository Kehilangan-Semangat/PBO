package P5;

public class PrePostIncrement
{
    public static void main(String[] args)
    {
        System.out.println("=== PERBEDAAN POST-INCREMENT (i++) DAN PRE-INCREMENT (++i) ===");

        System.out.println("1. Post-Increment (i++) pada kondisi while (i++ < 3):");
        int i = 0;
        while (i++ < 3)
        {
            System.out.println("Nilai i di dalam perulangan: " + i);
        }
        System.out.println("Nilai i setelah while selesai: " + i);

        System.out.println();

        System.out.println("2. Pre-Increment (++j) pada kondisi while (++j < 3):");
        int j = 0;
        while (++j < 3)
        {
            System.out.println("Nilai j di dalam perulangan: " + j);
        }
        System.out.println("Nilai j setelah while selesai: " + j);

        System.out.println();

        System.out.println("3. Perbedaan saat dicetak di dalam tubuh while:");
        int a = 1;
        System.out.println("Menggunakan a++:");
        while (a <= 3)
        {
            System.out.println("Nilai dicetak (a++): " + (a++) + " | Nilai a sekarang: " + a);
        }

        int b = 1;
        System.out.println("Menggunakan ++b:");
        while (b <= 3)
        {
            System.out.println("Nilai dicetak (++b): " + (++b) + " | Nilai b sekarang: " + b);
        }
    }
}
