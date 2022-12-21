import People.Miner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Miner miners = new Miner();
        System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            int b = scanner.nextInt();
            miners.Function(b);
    }
}
