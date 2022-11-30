package FirstPrograms;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number ");
        Scanner scanner = new Scanner(System.in);

        try {
            n = scanner.nextInt();
            switch (n) {
                case 1 -> System.out.println("Month January : days 31");
                case 2 -> System.out.println("Month February : days 28");
                case 3 -> System.out.println("Month March : days 31");
                case 4 -> System.out.println("Month April : days 30");
                case 5 -> System.out.println("Month May : days 31");
                case 6 -> System.out.println("Month June : days 30");
                case 7 -> System.out.println("Month July : days 31");
                case 8 -> System.out.println("Month August : days 31");
                case 9 -> System.out.println("Month September : days 30");
                case 10 -> System.out.println("Month October : days 31");
                case 11 -> System.out.println("Month November : days 30");
                case 12 -> System.out.println("Month December : days 31");
                default -> System.out.println("Sorry !! Error <h2>Sorry to Say</h2>");
            }
        }catch (Exception e){
            System.out.println("Sorry a Exception comes");
        }


    }
}
