package people;

import abstract1.Person;
import interface1.Inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Teacher extends Person implements Inter {

    public Teacher(Long id, Object name, Object age) {
        super(id, name, age);
    }

    public Teacher() {
        super();
    }

    @Override
    public int Function(int b) {
        Scanner an = new Scanner(System.in);
        Scanner an1 = new Scanner(System.in);
        List<Teacher> teachers = new ArrayList<>();
        try {
            System.out.println("Enter id");
            Long id = an.nextLong();
            System.out.println("Enter name");
            String name = an1.nextLine();
            System.out.println("Enter age");
            int age = an.nextInt();
            Teacher teacher = new Teacher(id, name, age);
            teachers.add(teacher);
        } catch (Exception e) {
            System.out.println("Drive right!");
        }
        System.out.println("Your data:");
        System.out.println(teachers);
        System.out.println("You teacher!");

        return b;
    }

    @Override
    public void Functions(int a) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x1 = random.nextInt(400);
        int x2 = random.nextInt(400);
        int x4 = random.nextInt(400);
        int x5 = random.nextInt(200);
        int o1 = x1 + x2;
        int o2 = x4 - x5;
        int x3 = random.nextInt(3);
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
            try {
                if (x3 == 2) {
                    System.out.println(x4 + "-" + x5 + "=?");
                    int l = scanner.nextInt();
                    if (l == o2) {
                        System.out.println(x4 + "-" + x5 + "=" + o2);
                        System.out.println("Yes!");
                    }
                } else {
                    System.out.println(x4 + "-" + x5 + "=" + o2);
                    System.out.println("Noy!");
                }
            } catch (Exception m) {
                System.out.println(m.getMessage());
            }
        }
    }
}
