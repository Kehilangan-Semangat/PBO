package P2;

class KonversiSuhu
{
    double c = 10;
    double f = 15;
    double r = 50;
    
    void hitungKonversi()
    {
        System.out.println("C ke F = " + (c * 9/5) + " Fahrenheit");
        System.out.println("F ke C = " + (f - 32) * 5/9 + " Celcius");

       System.out.println("C ke R = " + (c * 4/5) + " Reamur");
       System.out.println("R ke C = " + (r * 5/4) + " Celcius");

        System.out.println("F ke R = " + (f - 32) * 4/9 + " Reamur");
        System.out.println("R ke F = " + (r * 9/4) + 32 + " Fahrenheit");
    }
}
