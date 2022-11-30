package FirstPrograms;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any case 0 to 7");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        switch (n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Sorry not found");
        }
    }
}
