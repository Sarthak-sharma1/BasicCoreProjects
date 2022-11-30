package FirstPrograms;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            for (int i=1;i<=n;i=i+2){
                System.out.println(i);
            }


    }
}
