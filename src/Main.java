import java.util.Scanner;

public class Main {
    public static String isLeapYear(int year) {
        if (year < 1584) {
            return year + " год. Вы ввели год, старше 1584 года, первого високосного года ";
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " - Это високосный год.";
        } else {
            return year + " - Это не високосный год.";
        }
    }

    public static void main(String[] args) {
        // Задача 1.
        System.out.println("\nЗадача 1.");
        System.out.print("Определитель високосного года\nВведите год не старше 1584: ");
        Scanner input = new Scanner(System.in);
        int year;
        year = input.nextInt();
        System.out.println(isLeapYear(year));
    }
}