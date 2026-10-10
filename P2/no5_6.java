package P2;

class Segitiga
{
    int a = 6;
    int b = 8;

    double hitungLuasSegitiga()
    {
        return 0.5 * a * b;
    }

    double hitungSisiMiring()
    {
        return Math.sqrt((a*a) + (b*b));
    }

    double hitungKeliling()
    {
        return a + b + hitungSisiMiring();
    }
}
