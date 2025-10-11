//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//1
        int clientOS = 0;
        String msgOS = "";


        if (clientOS == 0) {
            msgOS = "Установите версию приложения для iOS по ссылке";
        } else {
            msgOS = "Установите версию приложения для Android по ссылке";
        }

        System.out.println(msgOS);

//2

        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            msgOS = "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            msgOS = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            msgOS = "Установите версию приложения для Android по ссылке";
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            msgOS = "Установите облегченную версию приложения для Android по ссылке";
        }
        System.out.println(msgOS);


//3

        int year = 2021;
        String msgYear = "";

        if ((year > 1584) && (year % 4 == 0) && ((year % 100 != 0) || (year % 100 == 0) && (year % 400 == 0))) {
            msgYear = "Год високосный";
        } else {
            msgYear = "Год не високосный";
        }
        System.out.println(msgYear);

//4

        int deliveryDistance = 95;
        int deliveryDay = 0;
        String deliveryMsg = "Потребуется дней: ";

        if (deliveryDistance < 20) {
            deliveryDay = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDay = 3;
        } else {
            deliveryMsg = "Доставки дальше 100км нет";
        }

        if (deliveryDay >= 1 && deliveryDay <= 3) {
            deliveryMsg += deliveryDay;
        }
        System.out.println(deliveryMsg);


//5
        int monthNumber = 12;
        String msgSeason = "";

        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    msgSeason = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    msgSeason = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    msgSeason = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    msgSeason = "Осень";
            }
            System.out.println(msgSeason);

        }

    }
}