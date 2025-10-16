import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1
        System.out.println(isYearLeap(2021));

//2
        int clientOS2 = 0;
        int clientDeviceYear2 = 2025;
        System.out.println(selectSoftware(clientOS2, clientDeviceYear2));

//3
        int deliveryDistance = 95;
        System.out.println(getDeliveryMessage(deliveryDistance));

    }

    public static String isYearLeap(int year) {

        if ((year > 1584) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }


    public static String selectSoftware(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();
        String result = "Ваша ОС не поддерживается";

        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            result = "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            result = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            result = "Установите версию приложения для Android по ссылке";
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            result = "Установите облегченную версию приложения для Android по ссылке";
        }

        return result;
    }

    public static String getDeliveryMessage(int distance) {

        int deliveryDay = 0;
        String deliveryMsg = "Потребуется дней: ";

        if (distance < 20) {
            deliveryDay = 1;
        } else if (distance >= 20 && distance < 60) {
            deliveryDay = 2;
        } else if (distance >= 60 && distance <= 100) {
            deliveryDay = 3;
        } else {
            deliveryMsg = "Доставки дальше 100км нет";
        }

        if (deliveryDay >= 1 && deliveryDay <= 3) {
            deliveryMsg += deliveryDay;
        }

        return deliveryMsg;
    }


}