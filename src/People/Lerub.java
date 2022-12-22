package People;

import Abstract.Person;
import Interface.Inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lerub extends Person implements Inter {
    public Lerub(String name, int age) {
        super(name, age);
    }

    public Lerub() {
        super();
    }

    @Override
    public int Function(int b) {
        Scanner an = new Scanner(System.in);
        Scanner an1 = new Scanner(System.in);
        List<Lerub> lerubs = new ArrayList<>();
        if (b == 1) {
            try {
                System.out.println("Enter name");
                String name = an1.nextLine();
                System.out.println("Enter age");
                int age = an.nextInt();
                Lerub lerub = new Lerub(name, age);
                lerubs.add(lerub);
                System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
                b = an.nextInt();
            } catch (Exception e) {
                System.out.println("Веди првильно данные!");
            }
        }
        if (b == 2) {
            System.out.println("Select ID to delete");
            b = an.nextInt();
            System.out.println("removed by ID" + lerubs.get(b));
            lerubs.remove(b);
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            b = an.nextInt();
        }
        if (b == 3) {
            lerubs.removeAll(lerubs);
            System.out.println("Data deleted");
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            b = an.nextInt();
        }
        if (b == 4) {
            System.out.println("Your data:");
            System.out.println(lerubs);
            System.out.println("You logger!");
        }
        return b;
    }

    @Override
    public void Functions(int a) {

    }
}
