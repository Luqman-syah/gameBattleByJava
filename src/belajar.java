import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {
        // for (int z=0; z<=5; z++) {
        //     System.out.println("hello world " + z);
        // }
        // for (int z=0; z<=2; z++) {
            
        // }

        Scanner input = new Scanner(System.in); // strukturnya mirip kaya mau bikin variable. 
                                                // buatkan variable input bertipe-data Scanner,
                                                // lalu panggil objek 'new Scanner(System.in)'
        
        int panjang, lebar, luas, tinggi, volume;
        System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
        System.out.print("panjang = ");     // jgn pake println
        panjang = input.nextInt();
        System.out.print("lebar = ");
        lebar = input.nextInt();

        luas = panjang*lebar;
        System.out.println("luasnya adalah: " + luas);

        System.out.println("MENGHITUNG VOLUME KUBUS");
        System.out.print("tinggi = ");
        tinggi = input.nextInt();

        volume = luas*tinggi;
        System.out.println("volumenya adalah: " + volume);

        input.close(); // menutup objek input
    }
}

class nestedLoop {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            for (int j=1; j<=4; j++) {
                System.out.printf("%d | %d\n", i, j); // spasi diantara i dan j
            }
        }
    }
}


class percabangan {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("nilainya : " + a);
        if (a == 5) {
            System.out.println("nilai a adalah 5");
        } else {
            System.out.println("nilai a bukan 5");
        }
    }
}
class ifelse_bersarang {
    public static void main(String[] args) {
        int a = 7;
        int b = 11;
        if (a == 7) {
            if (b == 10) {
                System.out.println("right! bener 2 2nya");
            } else {System.out.println("cuma bener 1 : a = 7");}
        } else {System.out.println("nilai a bukan 7 dan b bukan 10");}
    }
}

class woii {
    public static void main(String[] args) {
        int x = 1;
        int hasil = 0;
        do {
            hasil+=x;
        } while (x++ < 3);
        System.out.println(x + " " + hasil);
    }
}

// kita coba terapin simple oop, yaitu dgn class, atribut, dan metode baru
class kucing{
    String nama;

    void meong(){
        System.out.println(nama + " bilang: meongggg");
    }

    public static void main(String[] args) {
        kucing kucing1 = new kucing();
        kucing1.nama = "Luna";
        kucing1.meong();
    }
}

