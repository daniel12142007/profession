package people;

import abstract1.Person;
import interface1.Inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cook extends Person implements Inter {
    public Cook(String name, int age) {
        super(name, age);
    }

    public Cook() {
    }

    @Override
    public int Function(int b) {
        Scanner an = new Scanner(System.in);
        Scanner an1 = new Scanner(System.in);
        List<Cook> cooks = new ArrayList<>();
        if (b == 1) {
                System.out.println("Enter name");
                String name = an1.nextLine();
                System.out.println("Enter age");
                int age = an.nextInt();
                Cook cook = new Cook(name, age);
                cooks.add(cook);
                System.out.println("1)Registration\n2)Get data");
                b = an.nextInt();
        }
//        if (b == 2) {
//            System.out.println("Select ID to delete");
//            b = an.nextInt();
//            System.out.println("removed by ID" + cooks.get(b));
//            cooks.remove(b);
//            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
//            b = an.nextInt();
//        }
//        if (b == 3) {
//            cooks.removeAll(cooks);
//            System.out.println("Data deleted");
//            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
//            b = an.nextInt();
//        }
        if (b == 2) {
            System.out.println("Your data:");
            System.out.println(cooks);
            System.out.println("You cook!");
        }
        return b;
    }

    @Override
    public void Functions(int a) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b == 1) {
            String n = scanner.nextLine();
switch (n){
    case"":
        System.out.println();
        break;
    case"  ":
        System.out.println();
        break;
    case" ":
        System.out.println();
        break;
    default:
        System.out.println("Noy");
        break;
}
        }
        if (b == 2) {

        }
        if (b == 3) {

        }
    }
}
