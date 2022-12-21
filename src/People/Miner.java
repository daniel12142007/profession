package People;

import Abstract.Person;
import Interface.Inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Miner extends Person implements Inter {
    public Miner(String name, int age) {
        super(name, age);
    }

    public Miner() {
        super();
    }

    @Override
    public int Function(int b) {
        Scanner an = new Scanner(System.in);
        Scanner an1 = new Scanner(System.in);
        List<Miner> miners = new ArrayList<>();
        if (b == 1) {
            System.out.println("Enter name");
            String name = an1.nextLine();
            System.out.println("Enter age");
            int age = an.nextInt();
            Miner miner = new Miner(name, age);
            miners.add(miner);
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            b = an.nextInt();
        }
        if (b == 2) {
            System.out.println("Select ID to delete");
            b = an.nextInt();
            System.out.println("removed by ID" + miners.get(b));
            miners.remove(b);
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            b = an.nextInt();
        }
        if (b == 3) {
            miners.removeAll(miners);
            System.out.println("Data deleted");
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            b = an.nextInt();
        }
        if (b == 4) {
            System.out.println("Your data:");
            System.out.println(miners);
            System.out.println("You miner!");
        }
        return b;
    }
}
