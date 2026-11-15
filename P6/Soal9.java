package P6;

public class Soal9
{
    public static void main(String[] args)
    {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("--- Perulangan Pertama (For Standar dengan Indeks) ---");
        for (int i = 0; i < age.length; i++)
        {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        System.out.println("\n--- Perulangan Kedua (For-Each) ---");
        for (int a : age)
        {
            System.out.println("Nilai elemen = " + a);
        }
    }
}
