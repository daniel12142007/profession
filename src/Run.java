import enum1.Enum;
import people.Cook;
import people.Hunter;
import people.Teacher;
import people.Miner;

import java.util.Random;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select gender 1)male or 2)female");
        int gender = scanner.nextInt();
        if (gender == 1) {
            Teacher teacher = new Teacher();
            Cook cook = new Cook();
            System.out.println("You chose the gender" + Enum.MALE);
            System.out.println("Choose a profession:");
            System.out.println("1)teacher\n2)cook");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("1)Registration\n2)Get data");
                int b = scanner.nextInt();
                teacher.Function(b);
                teacher.Functions(b);
            }
            if (a == 2) {
                System.out.println("1)Registration\n2)Get data");
                int b = scanner.nextInt();
                cook.Function(b);
                Cook1();
            }
        }
        if (gender == 2) {
            Hunter hunter = new Hunter();
            Miner miners = new Miner();
            System.out.println("You chose the gender" + Enum.FEMALE);
            System.out.println("Choose a profession:");
            System.out.println("1)Miner\n2)Hunter");
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
        }
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
        } catch (Exception e) {
            System.out.println("Write numbers");
        }

    }

    public static void Cook1() {

    }
}
