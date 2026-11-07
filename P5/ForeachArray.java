package P5;

public class ForeachArray
{
    public static void main(String[] args)
    {
        System.out.println("=== PROGRAM PERULANGAN FOR-EACH PADA ARRAY ===");

        String[] daftarBahasa = new String[]
        {
            "Java", "Python", "C++", "JavaScript", "PHP"
        };

        System.out.println("Daftar Elemen Array (String):");
        for (String bahasa : daftarBahasa)
        {
            System.out.println("- " + bahasa);
        }

        System.out.println();

        int[] kumpulanNilai = new int[]
        {
            10, 25, 40, 55, 70, 85, 100
        };

        System.out.println("Daftar Elemen Array (Integer):");
        for (int nilai : kumpulanNilai)
        {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
