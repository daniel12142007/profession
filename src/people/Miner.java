package people;

import abstract1.Person;
import interface1.Inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Miner extends Person implements Inter {
    public Miner(Long id, Object name, Object age) {
        super(id, name, age);
    }

    public Miner() {
    }

    public void Function() {
        Scanner an = new Scanner(System.in);
        Scanner an1 = new Scanner(System.in);
        List<Miner> miners = new ArrayList<>();
            System.out.println("Enter id");
            Long id = an.nextLong();
            System.out.println("Enter name");
            String name = an1.nextLine();
            System.out.println("Enter age");
            int age = an.nextInt();
            Miner miner = new Miner(id,name, age);
            miners.add(miner);
            System.out.println("Your data:");
            System.out.println(miners);
            System.out.println("You miner!");
    }

    @Override
    public void Functions(int a) {
        Scanner an = new Scanner(System.in);
        if (a == 1) {
            System.out.println("You can mine stone");
            System.out.println("It takes 2 durability to break 1 block!");
            System.out.println("How much stone do you want to mine?(600)");
            int b = an.nextInt();
            if (b <= 300) {
                System.out.println("You received " + b + " stone");
            } else {
                System.out.println("Your pick has been broken!");
            }
        }
        if (a == 2) {
            System.out.println("You can mine iron");
            System.out.println("It takes 2 durability to break 1 block!");
            System.out.println("How much iron do you want to mine?(800)");
            int b = an.nextInt();
            if (b <= 400) {
                System.out.println("You received " + b + " iron");
            } else {
                System.out.println("Your pick has been broken!");
            }
        }
        if (a == 3) {
            System.out.println("You can mine diamond");
            System.out.println("It takes 2 durability to break 1 block!");
            System.out.println("How much diamond do you want to mine?(1200)");
            int b = an.nextInt();
            if (b <= 600) {
                System.out.println("You received " + b + " diamond");
            } else {
                System.out.println("Your pick has been broken!");
            }
        }
        if (a == 4) {
            System.out.println("You can mine iron");
            System.out.println("It takes 2 durability to break 1 block!");
            System.out.println("How much iron do you want to mine?(400)");
            int b = an.nextInt();
            if (b <= 200) {
                System.out.println("You received " + b + " iron");
            } else {
                System.out.println("Your pick has been broken!");
            }
        }
        if (a == 5) {
            System.out.println("You can mine obsidian");
            System.out.println("It takes 2 durability to break 1 block!");
            System.out.println("How much obsidian do you want to mine?(2000)");
            int b = an.nextInt();
            if (b <= 1000) {
                System.out.println("You received " + b + " obsidian");
            } else {
                System.out.println("Your pick has been broken!");
            }
        }
    }
}
