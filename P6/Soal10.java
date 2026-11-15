package P6;

import java.util.ArrayList;

public class Soal10
{
    public static void main(String[] args)
    {
        ArrayList<Object> data = new ArrayList<Object>();

        data.add(19);
        data.add(0.2);
        data.add('C');
        data.add("Java");
        data.add(true);

        System.out.println("Menampilkan elemen ArrayList per indeks:");
        for (int i = 0; i < data.size(); i++)
        {
            System.out.println("Indeks ke-" + i + " : " + data.get(i));
        }

        System.out.println("\nMenampilkan seluruh isi koleksi ArrayList:");
        System.out.println(data);
    }
}
