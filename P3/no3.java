package P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class no3 {
    void tampilkanPerbedaan() throws Exception {
        System.out.println("--- PERBEDAAN SCANNER & BUFFEREDREADER ---");
        System.out.println("1. Scanner otomatis mengonversi tipe data (misal: nextInt untuk angka).");
        System.out.println(
                "2. BufferedReader membaca semua input sebagai String, jadi butuh konversi manual (misal: Integer.parseInt).");
        System.out.println("3. BufferedReader butuh penanganan error bawaan (throws Exception/IOException).");

        System.out.println("\n--- PEMBUKTIAN CONTOH PROGRAM ---");

        System.out.println("[ Uji Coba Scanner ]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka favoritmu : ");
        int angkaScanner = sc.nextInt();
        System.out.println("Hasil Scanner            : " + angkaScanner);

        System.out.println();
        System.out.println("[ Uji Coba BufferedReader ]");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan angka favoritmu : ");
        String inputTeks = br.readLine();
        int angkaBuffer = Integer.parseInt(inputTeks);
        System.out.println("Hasil BufferedReader     : " + angkaBuffer);
    }
}
