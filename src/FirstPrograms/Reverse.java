package FirstPrograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n,r;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n>0){
           r = n%10;
            System.out.print(r+" ");
            n=n/10;

        }
    }
}
