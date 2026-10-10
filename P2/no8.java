package P2;

class no8 
{
    void hitungWaktu()
    {
        double jarakBumiBulan = 384400;
        double jarakBumiMatahari = 152100000;
        double kecepatanCahaya = 300000;

        System.out.println("Waktu tempuh ke Bulan: "+ (jarakBumiBulan / kecepatanCahaya) + " detik");
        System.out.println("Waktu tempuh ke Matahari: "+ (jarakBumiMatahari / kecepatanCahaya) + " detik");
    }
}
