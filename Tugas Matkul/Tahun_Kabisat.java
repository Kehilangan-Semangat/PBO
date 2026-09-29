import java.util.Scanner;

public class Tahun_Kabisat {

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Tahun (1909- 2024) : ");
        int tahun = input.nextInt();

        boolean isKabisat = (tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0));

        if (isKabisat)
        {
            System.out.println(tahun + " adalah Tahun Kabisat");
        }
        else
        {
            System.out.println(tahun + " bukan Tahun Kabisat");
        }

        input.close();
    }
}