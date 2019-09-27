package trekant;

import java.util.Scanner;

public class Trekant {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast sidelængden a: ");
        double a = scanner.nextDouble();
        System.out.print("Indtast sidelængden b: ");
        double b = scanner.nextDouble();
        System.out.print("Indtast sidelængden c: ");
        double c = scanner.nextDouble();

        scanner.close();

        if (a == b && b == c) {
            System.out.println("Trekanten er ligesidet");
        } else if (a == b || b == c || a == c) {
            System.out.println("Trekanten er ligebenet");
        } else if(Math.asin(a/b) * (180 /Math.PI) == 90 || Math.asin(b/c) * (180 /Math.PI) == 90 || Math.asin(a/c) * (180 /Math.PI) == 90) {
            System.out.println("Trekanten er retvinklet");
        } else if (Math.asin(a/b) * (180 /Math.PI) < 90 && Math.asin(b/c) * (180 /Math.PI) < 90 && Math.asin(c/a) * (180 /Math.PI) < 90) {
            System.out.println("Trekanten er spids");
        } else if (Math.asin(a/b) * (180 /Math.PI) > 90 || Math.asin(b/c) * (180 /Math.PI) > 90 || Math.asin(c/a) * (180 /Math.PI) > 90) {
            System.out.println("Trekanten er stump");
        } else {
            System.out.println("Noget er galt!");
        }
        System.out.println(Math.asin(a/b) * (180 /Math.PI));
        System.out.println(Math.asin(b/c) * (180 /Math.PI));
        System.out.println(Math.asin(c/a) * (180 /Math.PI));

    }
}
