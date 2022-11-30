package FirstPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact=1;
        System.out.println("Enter any Number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
