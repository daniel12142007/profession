import People.Cook;
import People.Hunter;
import People.Lerub;
import People.Miner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        }
        if (a == 2) {
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            int b = scanner.nextInt();
            hunter.Function(b);
        }
        if (a == 3) {
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            int b = scanner.nextInt();

            lerub.Function(b);
        }
        if (a == 4) {
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            int b = scanner.nextInt();
            cook.Function(b);
        }
    }
}
