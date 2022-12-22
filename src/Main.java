import People.Cook;
import People.Hunter;
import People.Lerub;
import People.Miner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Miner miners = new Miner();
            Hunter hunter = new Hunter();
            Lerub lerub = new Lerub();
            Cook cook = new Cook();
            System.out.println("Choose a profession:");
            System.out.println("1)Miner\n2)Hunter\n3)Lerub\n4)Cook");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
                int b = scanner.nextInt();
                miners.Function(b);
                Miner1();
            }
            if (a == 2) {
                System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
                int b = scanner.nextInt();
                hunter.Function(b);
                Hunter1();
            }
            if (a == 3) {
                System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
                int b = scanner.nextInt();
                lerub.Function(b);
                Lerub1();
            }
            if (a == 4) {
                System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
                int b = scanner.nextInt();
                cook.Function(b);
                Cook1();
            }
        } catch (Exception e) {
            System.out.println("Веди правильно");
        }
    }

    public static void Lerub1() {

    }

    public static void Hunter1() {

    }

    public static void Miner1() {
        Miner miners = new Miner();
        Scanner an = new Scanner(System.in);
        System.out.println("Выберите кирку \n1)деревяная\n2)каменая\n3)железная\n4)золотая\n5)алмазная");
        int a = an.nextInt();
        switch (a) {
            case 1:
                System.out.println("Вы получили деревяную кирку");
                miners.Functions(a);
                break;
            case 2:
                System.out.println("Вы получили каменую кирку");
                miners.Functions(a);
                break;
            case 3:
                System.out.println("Вы получили железную кирку");
                miners.Functions(a);
                break;
            case 4:
                System.out.println("Вы получили золотую кирку");
                miners.Functions(a);
                break;
            case 5:
                System.out.println("Вы получили алмазную кирку");
                miners.Functions(a);
                break;
            default:
                System.out.println("такой кирки нету");
                break;
        }

    }

    public static void Cook1() {

        }
}