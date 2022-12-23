package FirstPrograms;

import java.util.Scanner;

public class GreatestThree {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter any three number");
        Scanner scanner= new Scanner(System.in);
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
        if (a>=b && a>=c){
            System.out.println(a+": is Greater");
        } else if (b>=a && b>=c) {
            System.out.println(b+": is Grater");
        }else System.out.println(c+": is Greater");
    }
}
