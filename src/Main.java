import java.util.Scanner;

public class Main {
    // задача1. Метод для ввода года
    public static int getYear() {
        System.out.print("Введите год не старше 1584: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    // задача1. Метод проверки не является ли указанный год старше 1584.
    public static int checkingLowerLimitOfYear (){
        int year = getYear();
        while (year <1584) {
            System.out.println(year + " год. Вы ввели год старше 1584. Попробуйте ещё раз");
            year = getYear();
        }
        return year;
    }
    //задача1. Метод проверки является ли год високосным
    public static String isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " - Это високосный год.";
        } else {
            return year + " - Это не високосный год.";
        }
    }

    public static void main(String[] args) {
        System.out.println("\nЗадача 1. Проверка високосного года ");
        int year;
        year = checkingLowerLimitOfYear();
        System.out.println(isLeapYear(year));
        System.out.println("\nЗадача 2.");
    }
}
