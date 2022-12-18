import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1");
        printLeapYear(2020);
        System.out.println("ЗАДАНИЕ 2");
        printParameters(1,2022);
        System.out.println("ЗАДАНИЕ 3");
        printCountDays(109);
    }
    //ЗАДАНИЕ 1
    public static boolean countDate(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void printLeapYear(int year) {
        if (countDate(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    // ЗАДАНИЕ 2
    public static void printParameters(int osMobile, int dateRelease) {
        System.out.println(findParametersDate(dateRelease) + " версию приложения для " + findParameters(osMobile));
    }
    public static String findParameters(int osMobile) {
        if (osMobile == 0) {
            return "IOS";
        } else if (osMobile == 1) {
            return "Android";
        } else {
            return " Неизвестная ОС";
        }
    }
    public static String findParametersDate(int dateRelease){
        int currentYear = LocalDate.now().getYear();
        if (currentYear!= dateRelease){
            return "Установите облегченную";
        } else {
            return "Установите";
        }
    }
    //ЗАДАНИЕ 3
    public static int distance (int  deliveryDistance) {
        if ( deliveryDistance < 20) {
            return 1;
        } else if ( deliveryDistance <= 60) {
            return 2;
        } else if ( deliveryDistance <= 100) {
            return 3;
        } else {
            System.out.println("Свыше 100 км доставки нет.");
            return 0;
        }
    }
    public static void printCountDays(int  deliveryDistance){
        System.out.println("Потребуется дней: " + distance( deliveryDistance));

    }
}