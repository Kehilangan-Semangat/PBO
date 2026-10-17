package P3;

import java.io.*;

class no5 
{
    void hitungBuah() throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Masukkan data buah Bu Sisca:");
        System.out.print("Jumlah mangga yang dibeli          : ");
        int manggaAwal = Integer.parseInt(br.readLine()); 
        System.out.print("Jumlah tetangga yang diberi jambu  : ");
        int tetangga = Integer.parseInt(br.readLine());   
        System.out.print("Jumlah jambu per tetangga          : ");
        int jambuPerOrang = Integer.parseInt(br.readLine()); 
        System.out.print("Jumlah mangga busuk (dikembalikan) : ");
        int busuk = Integer.parseInt(br.readLine());      

        int totalJambu = tetangga * jambuPerOrang;
        int manggaBersih = manggaAwal - busuk;
        int totalBuahValid = manggaBersih + totalJambu;

        System.out.println("\nTotal jambu yang dibeli  : " + totalJambu + " pcs");
        System.out.println("Sisa mangga yang bagus   : " + manggaBersih + " pcs");
        System.out.println("Total buah valid Bu Sisca: " + totalBuahValid + " pcs");
    }
}