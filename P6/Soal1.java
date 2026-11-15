package P6;

public class Soal1
{
    public static void main(String[] args)
    {
        int angka1[] = {10, 20, 30};

        int[] angka2;
        angka2 = new int[]{40, 50, 60};

        int[] angka3 = new int[3];
        angka3[0] = 70;
        angka3[1] = 80;
        angka3[2] = 90;

        System.out.println("Variasi 1: int angka1[] = {10, 20, 30};");
        for (int i = 0; i < angka1.length; i++)
        {
            System.out.println("angka1[" + i + "] = " + angka1[i]);
        }

        System.out.println("\nVariasi 2: int[] angka2 = new int[]{40, 50, 60};");
        for (int i = 0; i < angka2.length; i++)
        {
            System.out.println("angka2[" + i + "] = " + angka2[i]);
        }

        System.out.println("\nVariasi 3: int[] angka3 = new int[3]; (diisi per indeks)");
        for (int i = 0; i < angka3.length; i++)
        {
            System.out.println("angka3[" + i + "] = " + angka3[i]);
        }
    }
}
