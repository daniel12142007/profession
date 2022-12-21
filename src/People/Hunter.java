package People;

import Abstract.Person;
import Interface.Inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hunter extends Person implements Inter {
    public Hunter(String name, int age) {
        super(name, age);
    }

    public Hunter() {
        super();
    }

    @Override
    public int Function(int b) {
        Scanner an = new Scanner(System.in);
        Scanner an1 = new Scanner(System.in);
        List<Hunter> hunters = new ArrayList<>();
        if (b == 1) {
            try {
                System.out.println("Enter name");
                String name = an1.nextLine();
                System.out.println("Enter age");
                int age = an.nextInt();
                Hunter hunter = new Hunter(name, age);
                hunters.add(hunter);
                System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
                b = an.nextInt();
            } catch (Exception i) {
                System.out.println("Веди првильно данные!");
            }
        }
        if (b == 2) {
            System.out.println("Select ID to delete");
            b = an.nextInt();
            System.out.println("removed by ID" + hunters.get(b));
            hunters.remove(b);
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            b = an.nextInt();
        }
        if (b == 3) {
            hunters.removeAll(hunters);
            System.out.println("Data deleted");
            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
            b = an.nextInt();
        }
        if (b == 4) {
            System.out.println("Your data:");
            System.out.println(hunters);
            System.out.println("You hunter!");
        }
        return b;
    }
}
