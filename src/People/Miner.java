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
            try {
                System.out.println("Enter name");
                String name = an1.nextLine();
                System.out.println("Enter age");
                int age = an.nextInt();
                Miner miner = new Miner(name, age);
                miners.add(miner);
                System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
                b = an.nextInt();
            } catch (Exception p) {
                System.out.println("Веди првильно данные!");
            }
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

    @Override
    public void Functions(int a) {
        Scanner an = new Scanner(System.in);
        if (a == 1) {
            System.out.println("Вы можете добывать камень");
            System.out.println("Сколько камня вы хотите добыть(600)");
            int b = an.nextInt();
            if (b <= 600) {
                System.out.println("Вы получили " + b + " камня");
            } else {
                System.out.println("Ваша кирка была сломана!");
            }
        }
        if (a == 2) {
            System.out.println("Вы можете добывать железо");
            System.out.println("Сколько железо вы хотите добыть(800)");
            int b = an.nextInt();
            if (b <= 800) {
                System.out.println("Вы получили " + b + " железо");
            } else {
                System.out.println("Ваша кирка была сломана!");
            }
        }
        if (a == 3) {
            System.out.println("Вы можете добывать алмаз");
            System.out.println("Сколько алмаза вы хотите добыть(1200)");
            int b = an.nextInt();
            if (b <= 1200) {
                System.out.println("Вы получили " + b + " алмаза");
            } else {
                System.out.println("Ваша кирка была сломана!");
            }
        }
        if (a == 4) {
            System.out.println("Вы можете добывать железо");
            System.out.println("Сколько железо вы хотите добыть(400)");
            int b = an.nextInt();
            if (b <= 400) {
                System.out.println("Вы получили " + b + " железо");
            } else {
                System.out.println("Ваша кирка была сломана!");
            }
        }
        if (a == 5) {
            System.out.println("Вы можете добывать обсидиан");
            System.out.println("Сколько обсидиана вы хотите добыть(2000)");
            int b = an.nextInt();
            if (b <= 2000) {
                System.out.println("Вы получили " + b + " обсидиана");
            } else {
                System.out.println("Ваша кирка была сломана!");
            }
        }
    }
}
