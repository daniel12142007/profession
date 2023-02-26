import enum1.Enum;
import people.Cook;
import people.Hunter;
import people.Miner;
import people.Teacher;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select gender 1)male or 2)female");
        String gender = scanner.nextLine();
        switch (gender) {
            case "female" -> {
                Teacher teacher = new Teacher();
                Cook cook = new Cook();
                System.out.println("You chose the gender:" + Enum.MALE);
                System.out.println("Choose a profession:");
                System.out.println("1)teacher\n2)cook");
                String a = scanner.nextLine();
                switch (a) {
                    case "teacher":
                        teacher.Function();
                        teacher.Functions(1);
                        break;
                    case "cook":
                        cook.Function();
                        break;
                    default:
                        System.err.println("error");
                        break;
                }
            }
            case "male" -> {
                Hunter hunter = new Hunter();
                Miner miners = new Miner();
                System.out.println("You chose the gender:" + Enum.FEMALE);
                System.out.println("Choose a profession:");
                System.out.println("1)miner\n2)hunter");
                String b = scanner.nextLine();
                switch (b) {
                    case "miner":
                        miners.Function();
                        Miner1();
                        break;
                    case "hunter":
                        hunter.Function();
                        System.out.println("\n1)awm\n2)scar\n3)digl");
                        int w = scanner.nextInt();
                        hunter.Functions(w);
                        break;
                    default:
                        System.err.println("eror");
                        break;
                }
            }
        }
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
}
