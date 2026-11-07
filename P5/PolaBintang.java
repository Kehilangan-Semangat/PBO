package P5;

public class PolaBintang
{
    public static void main(String[] args)
    {
        System.out.println("=== HALF TRIANGLE ===");
        for (int i = 1; i <= 5; i++)
        {
            for (int s = 1; s <= 5 - i; s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=== FULL TRIANGLE ===");
        for (int i = 1; i <= 3; i++)
        {
            for (int s = 1; s <= 3 - i; s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i >= 1; i--)
        {
            for (int s = 1; s <= 3 - i; s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
