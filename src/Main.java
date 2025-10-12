//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//1

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


//2

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

//3

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }


//4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

//5
        for (int i = 0; i <= (2096 - 1904); i += 4) {
            System.out.println(i + 1904);
        }


//6
       //6.1
        for (int i = 1; i <= 14; i++) {
            System.out.println(7 * i);
        }

        // или так 6.2
        int varOut = 0;
        for (int i = 1; i <= 14; i++) {
            varOut += 7;
            System.out.println(varOut);
        }


//7
        int stepen = 1;
        for (int i = 0; i <= 9; i++) {
            System.out.println(stepen);
            stepen *= 2;
        }

//8
        int summa = 0;
        for (int i = 1; i <= 12; i++) {
            summa += 29000;
            System.out.println("Месяц " + i + " сумма накоплений " + summa);
        }

//9
        float summa2 = 0F;
        float vklad = 29000F;
        float yearPercent = 1;
        for (int i = 1; i <= 12; i++) {
            summa2 += vklad * yearPercent/100;
            System.out.println("Месяц " + i + " сумма накоплений " + summa2);
        }
//10
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i);
        }


    }
}