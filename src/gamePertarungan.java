// ----pakai abstract class / polymorphism----//

// class maqam {
//     void bersuara(){}
// }

// class jiharkah extends maqam {
//     void bersuara(){
//         System.out.println("feels happy");
//     }
// }

// class hijaz extends maqam {
//     void bersuara(){
//         System.out.println("menyayat hati");
//     }
// }

// public class praktikum8 {
//     public static void main(String[] args) {
//         maqam maqam1= new jiharkah();
//         maqam maqam2= new hijaz();

//         maqam1.bersuara();  // Output: feels happy
//         maqam2.bersuara();  // Output: menyayat hati
//     }
// }

//----pakai interface----//

// interface kendaraan {
//     void jalan();
//     void ngerem();
// }

// class mobil implements kendaraan {
//     public void jalan() {
//         System.out.println("mobil berjalan di jalan raya");
//     }
//     public void ngerem() {
//         System.out.println("mobil mengerem dengan rem cakram");
//     }
// }

// class motor implements kendaraan {
//     public void jalan() {
//         System.out.println("motor berjalan di jalan raya");
//     }
//     public void ngerem() {
//         System.out.println("motor mengerem dengan rem tromol");
//     }
// }

// public class praktikum8 {
//     public static void main(String[] args) {
//         kendaraan k1 = new mobil();
//         kendaraan k2 = new motor();

//         k1.jalan();
//         k2.jalan();
//         k1.ngerem();
//         k2.ngerem();
//     }
// }

// ---pakai keduanya, kunamakan ini game pertempuran---//
import java.util.Random;
import java.util.Scanner;

interface CharacterAction {
    void attack();
    void defend();
    int getAttackPower();
    String getName();
}

class warriors implements CharacterAction {
    public void attack() {
        System.out.println("Warrior menyerang dengan pedang!");
    }
    public void defend() {
        System.out.println("Warrior bertahan dengan perisai!");
    }
    public int getAttackPower() {
        return 20;
    }
    public String getName() {
        return "Warrior";
    }
}
class mages implements CharacterAction {
    public void attack() {
        System.out.println("Mage menyerang dengan bola api!");
    }
    public void defend() {
        System.out.println("Mage bertahan dengan penghalang sihir!");
    }
    public int getAttackPower() {
        return 15;
    }
    public String getName() {
        return "Mage";
    }
}
class archer implements CharacterAction {
    public void attack() {
        System.out.println("Archer menembak dengan panah dari jauh!");
    }
    public void defend() {
        System.out.println("Archer bersembunyi dibalik pohon!");
    }
    public int getAttackPower() {
        return 12;
    }
    public String getName() {
        return "Archer";
    }
}
        // main game
public class gamePertarungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=== Battle Game ===");
        System.out.println("Pilih karaktermu:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");
        System.out.print("Masukkan pilihan (1-3): ");
        int choice = input.nextInt();

        CharacterAction player;
        switch (choice) {
            case 1:
                player = new warriors();
                break;
            case 2:
                player = new mages();
                break;
            case 3:
                player = new archer();
                break;
            default:
                System.out.println("Pilihan tidak valid, memilih Warrior secara default.");
                player = new warriors();
        }

            // musuh acak
        CharacterAction[] enemies = {new warriors(), new mages(), new archer()};
        CharacterAction enemy = enemies[rand.nextInt(choice)];
        System.out.println("\nKamu memilih: " + player.getName());
        System.out.println("Musuhmu: " + enemy.getName());
        System.out.println("\n=== Pertarungan Dimulai! ===");
        
        int playerHP = 100;
        int enemyHP = 100;
        while (playerHP > 0 && enemyHP >0) {
            System.out.print("\nketik 1 untuk menyerang, 2 untuk bertahan: ");
            int aksi = input.nextInt();

            if (aksi == 1){
                player.attack();
                int damage = player.getAttackPower();
                enemyHP -= damage;
                System.out.println("musuh kehilangan " + damage + " HP. Sisa HP musuh: " + enemyHP);
            } else {
                player.defend();
                System.out.println("Kamu bertahan dan mengurangi serangan musuh.");
            }

            if (enemyHP > 0) {
                enemy.attack();
                int damage = enemy.getAttackPower() + rand.nextInt(10); // Tambahkan elemen acak pada damage musuh
                if (aksi == 2) {
                    damage /= 2; // kalau bertahan, damage berkurang
                }
                playerHP -= damage;
                System.out.println("Kamu kehilangan " + damage + " HP. Sisa HP kamu: " + playerHP);
            } 
                System.out.println("\n❤️ HP Kamu: " + playerHP + " | 💀 HP Musuh: " + enemyHP);

            }
            System.out.println("\n === hasil pertarungan ===");
            if (playerHP > 0) {
                System.out.println("Kamu menang! " + player.getName() + " mengalahkan " + enemy.getName());
            } else {
                System.out.println("Kamu kalah... " + enemy.getName() + " lebih kuat kali ini.");
            }

            input.close();

        }
    }
    
    // CharacterAction[] characters =  {
    //     new warriors(),
    //     new mages(),
    //     new archer()
    // };

    // // CharacterAction character1 = new warriors();
    // // CharacterAction character2 = new mages();
    // // CharacterAction character3 = new archer();

    // System.out.println("=== pertarungan dimulai! ===");
    // for (CharacterAction character : characters) {
    //     character.attack();
    //     character.defend();
    //     System.out.println("-----------------------");
    // }






