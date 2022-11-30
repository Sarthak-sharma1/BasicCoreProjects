package FirstPrograms;

import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number of Term");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
