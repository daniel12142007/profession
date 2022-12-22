package people;

import abstract1.Person;
import interface1.Inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Teacher extends Person implements Inter {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
        super();
    }

    @Override
    public int Function(int b) {
        Scanner an = new Scanner(System.in);
        Scanner an1 = new Scanner(System.in);
        List<Teacher> teachers = new ArrayList<>();
        if (b == 1) {
            try {
                System.out.println("Enter name");
                String name = an1.nextLine();
                System.out.println("Enter age");
                int age = an.nextInt();
                Teacher teacher = new Teacher(name, age);
                teachers.add(teacher);
                System.out.println("1)Registration\n2)Get data");
                b = an.nextInt();
            } catch (Exception e) {
                System.out.println("Drive right!");
            }
        }
//        if (b == 2) {
//            System.out.println("Select ID to delete");
//            b = an.nextInt();
//            System.out.println("removed by ID" + lerubs.get(b));
//            lerubs.remove(b);
//            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
//            b = an.nextInt();
//        }
//        if (b == 3) {
//            lerubs.removeAll(lerubs);
//            System.out.println("Data deleted");
//            System.out.println("1)Registration\n2)Deletion by ID\n3)Delete everything\n4)Get data");
//            b = an.nextInt();
//        }
        if (b == 2) {
            System.out.println("Your data:");
            System.out.println(teachers);
            System.out.println("You teacher!");
        }
        return b;
    }

    @Override
    public void Functions(int a) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x1 = random.nextInt(0, 400);
        int x2 = random.nextInt(400, 600);
        int o1 = x1 + x2;
        int o2 = x1 - x2;
        int x3 = random.nextInt(1, 3);
        if (x3 == 1) {
            System.out.println(x1 + "+" + x2 + "=?");
            int b = scanner.nextInt();
            if (b == o1) {
                System.out.println(x1 + "+" + x2 + "=" + o1);
                System.out.println("Yes!");
            } else {
                System.out.println(x1 + "+" + x2 + "=" + o1);
                System.out.println("Noy!");
            }
        }
        if (x3 == 2) {
            System.out.println(x1+"-"+x2+"=?");
            int b = scanner.nextInt();
            if (b==o2){
                System.out.println(x1+"-"+x2+"="+o2);
                System.out.println("Yes!");
            }else {
                System.out.println(x1+"-"+x2+"="+o2);
                System.out.println("Noy!");
            }
        }
    }
}
