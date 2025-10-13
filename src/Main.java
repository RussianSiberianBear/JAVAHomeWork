//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


// 1
        int firstFriday = 5;
        for (int i = 1; i <= 31; i++) {
            if (i % 7 == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
//2
        //2.1
        int distAll = 42195;
        int probeg = 0;
        int msgCount = 0;
        do {
            probeg += 500;
            System.out.println("Держитесь! Осталось " + (distAll - probeg) + " метров");
            msgCount++;
        } while (probeg + 500 <= distAll);
        System.out.println("Кол-во сообщений " + msgCount);

        //2.1
        msgCount = 0;
        for (int i = 500; i <= distAll; i += 500) {
            System.out.println("Держитесь! Осталось " + (distAll - i) + " метров");
            msgCount++;
        }
        System.out.println("Кол-во сообщений " + msgCount);


//3
        //3.1
        int sumClient = 1200;
        int taxa = 100;
        int days = 0;

        while (sumClient > 0) {
            days++;
            if (days % 5 == 0) continue;
            sumClient -= taxa;
        }
        System.out.println("Вы можете оставить автомобиль на " + days + " дней");

        //3.2
        sumClient = 1200;
        days = 0;

        for (; ; ) {
            if (sumClient <= 0) break;
            days++;
            if (days % 5 == 0) continue;
            sumClient -= taxa;
        }
        System.out.println("Вы можете оставить автомобиль на " + days + " дней");

//4
        // while
        int month = 0;
        float total = 0F;
        float totalMax = 12000000F;

        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) total *= 1.07F;
            System.out.println(" Номер месяца " + month + " Сумма накоплений " + total);
            if (total >= totalMax) break;
        }

//5

        float charge = 20;
        int minute = 0;      // общее время зарядки
        int overheats = 0;
        int pauseMin = 0;

        // Не совсем понятно что считать временем зарядки в условии задачи-чистое время зярядки или с паузами?
        // В условии задачи перегрев случается В НАЧАЛЕ каждой 10 минуты зарядки и пауза
        // в заярдке  составляет 2 минуты, таким образом, пауза происходит на 10 и 11 минуте и
        // общий цикл такой: 9 мин зарядка, 2 мин пауза.
        while (charge <= 100) {

            minute++;

            if ((minute - pauseMin) % 10 == 0) {
                overheats++;
                if (overheats > 3) {
                    break;
                }
                System.out.println("Перегрев! Ждём 2 минуты");
                continue;
            }

            charge *= 1.02F;
        }

        if (overheats > 3) {
            System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
        }
        System.out.println("Время зарядки составило " + minute + " минут");

    }
}