package FirstPrograms;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter any Number of Term");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1;i<=n;i++){
            sum = sum+i;
          //  System.out.println(sum);
        }
        System.out.println(sum);
    }
}
