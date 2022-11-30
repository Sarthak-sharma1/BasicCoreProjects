package FirstPrograms;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter any two Number");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(Math.max(a, b));

    }
}
