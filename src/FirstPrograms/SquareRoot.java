package FirstPrograms;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
       int n;
        System.out.println("Enter any number");
        Scanner scanner =new Scanner(System.in);
        n = scanner.nextInt();
       double b= Math.sqrt(n);
        System.out.println(b);
    }
}
