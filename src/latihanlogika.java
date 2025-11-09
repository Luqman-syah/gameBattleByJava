import java.util.*;

public class latihanlogika {
    public static void main(String[] args) {
        
        // membuat sebuah objek untuk menangkap input dari user
        Scanner input = new Scanner(System.in);

        // program simple buat nebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("lu nebak berapa? =  ");
        nilaiTebakan = input.nextInt();
        System.out.println("nilai tebakan anda = " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("survei membuktikan = " + statusTebakan);

        // operasi aljabar boolean
        System.out.print("masukan nilai antara 4 dan 9; ");
        nilaiTebakan = input.nextInt();
        statusTebakan = (nilaiTebakan > 4 && nilaiTebakan < 9);
        System.out.println("tebakan anda: " + statusTebakan);

        // menutup objek input
        input.close();  
    }
}