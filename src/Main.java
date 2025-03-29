import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    // Задача 1 и задача 2. Метод для ввода года.
    public static int getYear() {
//        System.out.print("Введите год не старше 1584: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    // задача1. Метод проверки не является ли указанный год старше 1584.
    public static int checkLowerLimitOfYear (){
        int year = getYear();
        while (year <1584) {
            System.out.print(year + " год. Вы ввели год старше 1584. Попробуйте ещё раз: ");
            year = getYear();
        }
        return year;
    }
    //задача1. Метод проверки является ли год високосным
    public static String checkIsLeapYear(int year) {
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
    public static void selectionSoftwareVersion(int currentYear) {
        String yearVersion = getYear() < currentYear ? " облегчённую " : " обычную ";
        int appVersion = getOsVersion();
        if (appVersion != 0 && appVersion != 1) {
            System.out.println("Вы ввели недопустимое значение версии.");
        } else {
            String osVersion = appVersion == 0 ? "iOs" : "Android";
            System.out.println("Установите" + yearVersion + "версию приложения для " + osVersion + " по ссылке:");
        }
    }
    // Задача 3. Метод определения дней доставки от расстояния
    public static String estimatingDeliveryTime(int distance) {
        int deliveryTime = 0;
        if (distance<0){
            return "Введите корректное расстояние";
        }
        if ( distance <= 20) {
            deliveryTime++;
            // return "понадобится " + time + " день для доставки карты";
        } else if(distance<=60){
            deliveryTime+=2;
            // return "понадобится " + time + " дня для доставки карты";
        } else if (distance<=100) {
            deliveryTime+=3;
            //return "понадобится " + time + " дня для доставки карты";
        } else {
            return " Карта не доставляется";
        }
        return "Понадобится "+ deliveryTime+(deliveryTime==1 ?" день ":" дня ")+"для доставки карты";
    }

    public static void main(String[] args) {
        System.out.println("\nЗадача 1. Проверка високосного года ");
        System.out.print("Введите год не старше 1584: ");
        int year;
        year = checkLowerLimitOfYear();
        System.out.println(checkIsLeapYear(year));
        // Задача 2.
        System.out.println("\nЗадача 2.");
        System.out.print("Укажите год создания телефона: ");
        int currentYear = LocalDate.now().getYear();
        selectionSoftwareVersion(currentYear);
        // Задача 3.
        System.out.println("\nЗадача 3.");
        int deliveryDistance = 95;
        System.out.println(estimatingDeliveryTime(deliveryDistance));
    }
}
