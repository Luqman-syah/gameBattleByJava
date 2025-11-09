import java.util.Scanner;
import java.text.DecimalFormat;

public class adudu {
    public static void main(String[] args) {
        Scanner input;
        double hargaBarang, pascaDiskon;
        input = new Scanner(System.in);
        DecimalFormat uang = new DecimalFormat("#,###");

        System.out.print("harga barang= ");
        hargaBarang = input.nextInt();

        if (hargaBarang > 500000) {
            pascaDiskon = hargaBarang * 85/100;
            System.out.println("harganya jadi " + uang.format(pascaDiskon));
        } else if (hargaBarang > 300000) {
            pascaDiskon = hargaBarang * 90/100;
            System.out.println("harganya jadi " + uang.format(pascaDiskon));
        } else if (hargaBarang > 100000) {
            pascaDiskon = hargaBarang * 95/100;
            System.out.println("harganya jadi " + uang.format(pascaDiskon));
        } else {
            System.out.println("yaah gak dapet diskon lu!");
        }
        input.close();
    }


}
class sayasuka {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.println("saya suka javaa");
            i++;
        }
    }
}
class jumlah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiPertama = 0;
        int nilaiKedua = 0;
        int nilaiKetiga = 0;
        int hasil;

        System.out.print("Masukkan nilai pertama: ");
        nilaiPertama = input.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        nilaiKedua = input.nextInt();
        System.out.print("Masukkan nilai ketiga: ");
        nilaiKetiga = input.nextInt();
        hasil = nilaiPertama + nilaiKedua + nilaiKetiga;
        System.out.println("Hasilnya adalah : " + hasil);

        input.close();
    }
}