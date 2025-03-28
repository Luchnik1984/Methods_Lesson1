import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    // задача1. Метод для ввода года
    public static int getYear() {
//        System.out.print("Введите год не старше 1584: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    // задача1. Метод проверки не является ли указанный год старше 1584.
    public static int checkingLowerLimitOfYear (){
        int year = getYear();
        while (year <1584) {
            System.out.print(year + " год. Вы ввели год старше 1584. Попробуйте ещё раз: ");
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
    // Задача 2. Метод для ввода номера ОС
    public static int getOsVersion () {
        System.out.println("Если у Вас система iOS введите 0");
        System.out.print("Если у Вас система Android введите 1\n" +
                "Какая у Вас система?: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    // Задача 2. Метод вывода ссылки для установки нужной ОС
    public static void softwareVersionSelection (int currentYear) {
        int year = getYear();
        if (year == currentYear) {
            switch (getOsVersion()) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке:");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке:");
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение.");
            }
        }
        else if(year < currentYear){
            switch (getOsVersion()) {
                case 0:
                    System.out.println("Установите облегчённую версию приложения для iOS по ссылке:");
                    break;
                case 1:
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке:");
                    break;
                default:
                    System.out.println("Вы ввели недопустимое значение.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\nЗадача 1. Проверка високосного года ");
        System.out.print("Введите год не старше 1584: ");
        int year;
        year = checkingLowerLimitOfYear();
        System.out.println(isLeapYear(year));
        // Задача 2.
        System.out.println("\nЗадача 2.");
        System.out.print("Укажите год создания телефона: ");
        int currentYear = LocalDate.now().getYear();
        softwareVersionSelection(currentYear);
    }
}
