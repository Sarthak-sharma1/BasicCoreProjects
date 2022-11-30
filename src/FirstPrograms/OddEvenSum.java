package FirstPrograms;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter any Range");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n%2==0){
            for (int i=2;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println(sum);
        }else {
            for (int i=1;i<=n;i=i+2){
                sum = sum +i;
            }
            System.out.println(sum);

        }
    }

}
