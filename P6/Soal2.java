package P6;

public class Soal2
{
    public static void main(String[] args)
    {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        System.out.println("Daftar mobil sebelum diubah:");
        for (int i = 0; i < mobil.length; i++)
        {
            System.out.println("Indeks ke-" + i + ": " + mobil[i]);
        }

        mobil[1] = "Honda";

        System.out.println("\nNilai pada indeks ke-1 setelah diubah: " + mobil[1]);

        System.out.println("\nDaftar mobil setelah diubah:");
        for (int i = 0; i < mobil.length; i++)
        {
            System.out.println("Indeks ke-" + i + ": " + mobil[i]);
        }
    }
}
