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
                System.out.println("1)Registration\n2)Get data");
                int b = scanner.nextInt();
                miners.Function(b);
                Miner1();
            }
            if (a == 2) {
                System.out.println("1)Registration\n2)Get data");
                int b = scanner.nextInt();
                hunter.Function(b);
                Hunter1();
            }
            if (a == 3) {
                System.out.println("1)Registration\n2)Get data");
                int b = scanner.nextInt();
                lerub.Function(b);
                Lerub1();
            }
            if (a == 4) {
                System.out.println("1)Registration\n2)Get data");
                int b = scanner.nextInt();
                cook.Function(b);
                Cook1();
            }
        } catch (Exception e) {
            System.out.println("Drive right!");
        }
    }

    public static void Lerub1() {

    }

    public static void Hunter1() {

    }

    public static void Miner1() {
        Miner miners = new Miner();
        Scanner an = new Scanner(System.in);
        System.out.println("Select pickaxe \n1)wooden\n2)stone\n3)iron\n4)golden\n5)diamond");
        int a = an.nextInt();
        try {
        switch (a) {
            case 1:
                System.out.println("You got a wooden pickaxe");
                miners.Functions(a);
                break;
            case 2:
                System.out.println("You got a stone pick");
                miners.Functions(a);
                break;
            case 3:
                System.out.println("You got an iron pickaxe");
                miners.Functions(a);
                break;
            case 4:
                System.out.println("You got the golden pickaxe");
                miners.Functions(a);
                break;
            case 5:
                System.out.println("You got a diamond pickaxe");
                miners.Functions(a);
                break;
            default:
                System.out.println("There is no such pick!");
                break;
        }
        }catch (Exception e){
            System.out.println("Write numbers");
        }

    }

    public static void Cook1() {

        }
}