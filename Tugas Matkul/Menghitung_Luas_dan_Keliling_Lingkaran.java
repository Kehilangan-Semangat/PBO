import java.util.Scanner;

public class Menghitung_Luas_dan_Keliling_Lingkaran 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        float jari, keliling, luas;
        final float PI = 3.14f;

        System.out.println("Masukkan Nilai Jari-jari : ");
        jari = input.nextFloat();

        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);

        input.close();
    }
}