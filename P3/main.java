package P3;

class main 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("===== JAWABAN SOAL NO 1 =====");
        no1 n1 = new no1();
        n1.hitungGaji();

        System.out.println("\n===== JAWABAN SOAL NO 2 =====");
        no2 n2 = new no2();
        n2.hitungBelanja();

        System.out.println("\n===== JAWABAN SOAL NO 3 =====");
        no3 n3 = new no3();
        n3.tampilkanPerbedaan();

        System.out.println("\n===== JAWABAN SOAL NO 4 =====");
        no4 n4 = new no4();
        n4.hitungSentripetal();

        System.out.println("\n===== JAWABAN SOAL NO 5 =====");
        no5 n5 = new no5();
        n5.hitungBuah();

        System.out.println("\n===== JAWABAN SOAL NO 6 =====");
        no6 n6 = new no6();
        n6.hitungSelisihWaktu();

        System.out.println("\n===== JAWABAN SOAL NO 7 =====");
        no7 n7 = new no7();
        n7.hitungWaktuCetak();
    }
}

