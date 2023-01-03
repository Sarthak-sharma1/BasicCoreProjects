package FirstPrograms;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Enter any Number in celsius");
        Scanner scanner = new Scanner(System.in);
        float temp = scanner.nextFloat();
        float ans =(temp*9/5)+32;
        System.out.println(ans);
    }
}
