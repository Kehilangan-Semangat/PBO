package P3;

import java.io.*;

class no2 
{
    void hitungBelanja() throws Exception 
    {
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.print("Nama             : ");
        String nama = dis.readLine(); 
        System.out.print("Total Belanja    : ");
        double totalBelanja = Double.parseDouble(dis.readLine());
        System.out.print("Diskon (%)       : ");
        double diskon = Double.parseDouble(dis.readLine());

        double total = totalBelanja - (totalBelanja * (diskon / 100));
        System.out.println("Total            : " + total);

        System.out.print("Bayar            : ");
        double bayar = Double.parseDouble(dis.readLine());
        double kembalian = bayar - total;
        System.out.println("Kembalian        : " + kembalian);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("struk_belanja.dat"));
        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(total);
        dos.writeDouble(kembalian);
        dos.close();
        System.out.println("(Data berhasil di-output ke struk_belanja.dat)");
    }
}
