//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//1

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";

        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(" Ф.И.О. сотрудника — " + fullName);

//2

        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — "+ fullName);


//3
        fullName = "Иванов Семён Семёнович";
        fullName=fullName.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника — "+ fullName);


    }
}