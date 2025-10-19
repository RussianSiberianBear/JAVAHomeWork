//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        EmployeeBook book = new EmployeeBook(10);
        // добавляем сотрудников
        book.addEmployee(new Employee(1, 100, "Иван", "Иванович", "Иванов"));
        book.addEmployee(new Employee(2, 150, "Иван", "Петрович", "Петров"));
        book.addEmployee(new Employee(3, 200, "Иван", "Сидорович", "Сидоров"));
        book.addEmployee(new Employee(4, 250, "Петр", "Иванович", "Иванов"));
        book.addEmployee(new Employee(5, 300, "Петр", "Петрович", "Петров"));
        book.addEmployee(new Employee(1, 150, "Петр", "Сидорович", "Сидоров"));
        book.addEmployee(new Employee(2, 200, "Сидор", "Иванович", "Иванов"));
        book.addEmployee(new Employee(3, 250, "Сидор", "Петрович", "Петров"));
        book.addEmployee(new Employee(4, 350, "Сидор", "Сидорович", "Сидоров"));
        book.addEmployee(new Employee(5, 450, "Иван", "Петрович", "Сидоров"));

        // размер массива 10, но в условиях задачи надо 11 раз заполнить!
        if (book.addEmployee(new Employee(5, 450, "11", "11", "11"))) {
            System.out.println("11-й сотрудник добавлен!");
        } else System.out.println("Превышен размер массива! Сотрудник не добавлен!");


        // Получили всех сотрудников
        Employee[] employees = book.getEmployees();

        // вывод всех сотрудников в консоль
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        // или так
/*
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println(empl.toString());
            }
        }
*/
        // Получить и вывести среднее значение зарплат
        System.out.println("Средняя зарплата оставляет " + book.getAvgWages());

        // Получить и вывести значение всех налогов по схеме PROPORTIONAL
        float taxSum = book.getTax("PROPORTIONAL");
        System.out.println("Сумма налогов по пропорциональной схеме " + taxSum);

        // Получить и вывести значение всех налогов по схеме PROPORTIONAL
        taxSum = book.getTax("PROGRESSIVE");
        System.out.println("Сумма налогов по прогрессивной схеме " + taxSum);

        // Проиндексировать зарплату по всем сотрудникам заданного отдела
        int dept = 2;
        float index = 0.20F;
        int cnt = book.wageIndexes(dept, index);
        if (cnt > 0) {
            System.out.println("Зарплата успешно проиндексирована у "+cnt+" сотрудников");
        } else {
            System.out.println("Зарплата не проиндексирована! Возможно ошибка в номере отдела или в нем нет сотрудников!");
        }


        //Получить в качестве параметра номер отдела (1–5) и цифру зарплаты и вывести первого сотрудника
        // этого отдела с зарплатой больше указанной вместе с порядковым номером в списке.

        dept = 3;
        int minWage = 150;

        Employee empl = book.getEmployeeByDeptAndWage(dept, minWage);
        if (empl != null) {
            System.out.println("Первый найденный сотрудник с зарплатой больше " + minWage);
            empl.printShortInfo();
        } else {
            System.out.println("Таких сотрудников нет!");
        }


        //Получить в качестве параметра цифру зарплаты wage и число сотрудников employeeNumber
        //и вывести первые employeeNumber сотрудников с зарплатой меньше wage

        int wage = 350;
        int employeeNumber = 3;
        employees = book.getFirstEmployeesWithLessWages(wage, employeeNumber);
        System.out.println("Первые " + employeeNumber + " cотрудника/сотрудников с зарплатой меньше " + wage + " рублей:");
        for (Employee empl2 : employees) {
            if (empl2 != null) {
                empl2.printShortInfo();
            }
        }


        //Получить в качестве параметра объект сотрудника и вернуть boolean, есть ли
        //такой сотрудник в массиве с точки зрения бухгалтерского учета (по зарплате) или нет.

        Employee findEmployee = new Employee(3, 200, "Сидоров", "Сидор", "Сидорович");
        System.out.println("Ищем есть ли сотрудник с зарплатой 200 в 3 отделе");
        if (book.isEmployeeExixsts(findEmployee)) {
            System.out.println("Такой сотрудник есть!");
        } else {
            System.out.println("Такого сотрудника нет!");
        }

        // Ищем и выводим в консоль сотрудника с конкретным ID
        int findId = 10;
        System.out.println("Ищем и выводим в консоль сотрудника с конкретным ID=" + findId);
        Employee findEmplById = book.getEmployeeById(findId);
        if (findEmplById != null) {
            System.out.println("Такой сотрудник найден.");
            System.out.println(findEmplById.toString());
        } else {
            System.out.println("Сотрудника с таким ID нет!");
        }
    }
}