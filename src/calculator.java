import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double a = 20;
        double b = 20;

        System.out.println("Angka pertama: " + a);
        System.out.println("Angka kedua: " + b);

        // operasi mtk
        System.out.println("Hasil penjumlahan: " + (a + b));
        System.out.println("Hasil pengurangan: " + (a - b));
        System.out.println("Hasil perkalian: " + (a * b));
        System.out.println("Hasil pembagian: " + (a / b));
        System.out.println("Hasil modulus: " + (a % b));

        // perbandingan
        System.out.println("apakah a lebih besar dari b? " + (a > b));
        System.out.println("apakah a lebih kecil dari b? " + (a < b));
        System.out.println("apakah a sama dengan b? " + (a == b));

        // operasi logika
        boolean kondisi = (a > 10) && (b < 10);
        System.out.println("apakah a > 10 DAN b < 10? " + kondisi);
        
        //
        boolean hujan = true;
        System.out.println(hujan);
        System.out.println(!hujan);
    }
}
class ifelse {
    public static void main(String[] args) {
        int nilai = 75;

        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else if (nilai >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}

class cekUmur {
    public static void main(String[] args) {
        int umur = 17;
        
        if (umur < 13) {
            System.out.println("Anak-Anak");
        } else if (umur < 18) {
            System.out.println("Remaja");
        } else if (umur < 60) {
            System.out.println("Dewasa");
        } else if (umur >= 60) {
            System.out.println("Lansia");
        }
    }
}

class menuMakanan {
    public static void main(String[] args) {
        int menu = 5;

        switch (menu) {
            case 1:
                System.out.println("Nasi Goreng");
                break;
            case 2:
                System.out.println("Mie Ayam");
                break;
            case 3:
                System.out.println("Sate Ayam");
                break;
            default:
                System.out.println("woylah, cari menu tuh yang ada aja");
        }
    }
}

class kalkulator {
    public static void main(String[] args) {
        Scanner input;
        double a,b, hasil;
        char operator;

        input = new Scanner(System.in);

        System.out.print("berapa nilai a: ");
        a = input.nextDouble();

        System.out.print("operatornya: ");
        operator = input.next().charAt(0);

        System.out.print("berapa nilai b: ");
        b = input.nextDouble();

        System.out.println(a + " " + operator + " " + b);

        if (operator == '+') {
            hasil = a + b;
            System.out.println("hasilnya " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("hasilnya " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasilnya " + hasil);
        } else if (operator == '/') {
            hasil = a / b;
            System.out.println("hasilnya " + hasil);
        } else {
            System.out.println("gak ditemukan");
        }

        
    }
}