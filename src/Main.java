//import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


//1

        //1.1
        int [] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        //1.2
        float [] arrFloat = {1.57F, 7.654F, 9.986F};

        //1.3
        String [] arrStr = {"январь", "февраль", "март"};

//2
        //2.1
        String strInt = "" + arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            strInt += "," + arrInt[i];
        }
        System.out.println(strInt);

        //2.2
        String strFloat = String.valueOf(arrFloat[0]);
        for (int i = 1; i < arrFloat.length; i++) {
            strFloat += "," + arrFloat[i];
        }
        System.out.println(strFloat);

        //2.3
        String strStr = arrStr[0];
        for (int i = 1; i < arrStr.length; i++) {
            strStr += "," + arrStr[i];
        }
        System.out.println(strStr);

//3
        //3.1
        strInt = "" + arrInt[arrInt.length - 1];
        for (int i = arrInt.length - 2; i >= 0; i--) {
            strInt += "," + arrInt[i];
        }
        System.out.println(strInt);

        //3.2
        strFloat = "" + arrFloat[arrFloat.length - 1];
        for (int i = arrStr.length - 2; i >= 0; i--) {
            strFloat += "," + arrFloat[i];
        }
        System.out.println(strFloat);

        //3.3
        strStr = arrStr[arrStr.length - 1];
        for (int i = arrStr.length - 2; i >= 0; i--) {
            strStr += "," + arrStr[i];
        }
        System.out.println(strStr);

//4

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i] += 1;
            }
        }
        strInt = Arrays.toString(arrInt);
        System.out.println(strInt);
    }
}