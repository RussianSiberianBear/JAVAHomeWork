//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook(10);

        // добавляем сотрудников
        addSampleEmployees(book);


        // размер массива 10, но в условиях задачи надо 11 раз заполнить!
        if (book.addEmployee(new Employee(5, 450, "11", "11", "11"))) {
            System.out.println("11-й сотрудник добавлен!");
        } else System.out.println("Ошибка! Сотрудник не добавлен!");


        // вывод всех сотрудников в консоль
        printAllEmployees(book);


        // Получить и вывести среднее значение зарплат
        System.out.println("Средняя зарплата оставляет " + book.getAvgWages());


        // Получить и вывести значение всех налогов по схеме PROPORTIONAL
        System.out.println("Сумма налогов по пропорциональной схеме " + book.getTax(EmployeeBook.TaxType.PROPORTIONAL));


        // Получить и вывести значение всех налогов по схеме PROPORTIONAL
        System.out.println("Сумма налогов по прогрессивной схеме " + book.getTax(EmployeeBook.TaxType.PROGRESSIVE));


        // Проиндексировать зарплату по всем сотрудникам 2 отдела на 20%
        performWageIndexation(book, 2, 0.2F);


        //Получить в качестве параметра номер отдела (1–5) и цифру зарплаты и вывести первого сотрудника
        // этого отдела с зарплатой больше указанной вместе с порядковым номером в списке.
        int dept = 3;
        int minWage = 150;
        printFirstEmployeeByDeptAndWage(book, dept, minWage);


        //Получить в качестве параметра цифру зарплаты wage и число сотрудников employeeNumber
        //и вывести первые employeeNumber сотрудников с зарплатой меньше wage
        int wage = 350;
        int employeeNumber = 3;
        printFirstEmployeesWithLessWages(book, wage, employeeNumber);


        //Получить в качестве параметра объект сотрудника и вернуть boolean, есть ли
        //такой сотрудник в массиве с точки зрения бухгалтерского учета (по зарплате) или нет.
        findEmployeeByDeptAndWage(book, new Employee(3, 200, "Сидоров", "Сидор", "Сидорович"));


        // Ищем и выводим в консоль сотрудника с конкретным ID
        int findId = 10;
        System.out.println("Ищем и выводим в консоль сотрудника с конкретным ID=" + findId);
        findEmployeeById(book, findId);

    }


    private static void addSampleEmployees(EmployeeBook book) {
        Employee[] sampleEmployees = {
                new Employee(1, 100, "Иван", "Иванович", "Иванов"),
                new Employee(2, 150, "Иван", "Петрович", "Петров"),
                new Employee(3, 200, "Иван", "Сидорович", "Сидоров"),
                new Employee(4, 250, "Петр", "Иванович", "Иванов"),
                new Employee(5, 300, "Петр", "Петрович", "Петров"),
                new Employee(1, 150, "Петр", "Сидорович", "Сидоров"),
                new Employee(2, 200, "Сидор", "Иванович", "Иванов"),
                new Employee(3, 250, "Сидор", "Петрович", "Петров"),
                new Employee(4, 350, "Сидор", "Сидорович", "Сидоров"),
                new Employee(5, 450, "Иван", "Петрович", "Сидоров")
        };

        for (Employee employee : sampleEmployees) {
            book.addEmployee(employee);
        }
    }


    private static void printAllEmployees(EmployeeBook book) {
        System.out.println("\n=== Все сотрудники ===");
        Employee[] employees = book.getEmployees();
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void performWageIndexation(EmployeeBook book, int dept, float index) {
        int cnt = book.wageIndexes(dept, index);
        if (cnt > 0) {
            System.out.println("Зарплата успешно проиндексирована у " + cnt + " сотрудников");
        } else {
            System.out.println("Зарплата не проиндексирована! Возможно ошибка в номере отдела или в нем нет сотрудников!");
        }
    }


    private static void printFirstEmployeeByDeptAndWage(EmployeeBook book, int dept, int minWage) {
        Employee empl = book.getEmployeeByDeptAndWage(dept, minWage);
        if (empl != null) {
            System.out.println("Первый найденный сотрудник с зарплатой больше " + minWage);
            empl.printShortInfo();
        } else {
            System.out.println("Таких сотрудников нет!");
        }
    }


    private static void printFirstEmployeesWithLessWages(EmployeeBook book, int wage, int employeeNumber) {
        Employee[] employees = book.getFirstEmployeesWithLessWages(wage, employeeNumber);
        System.out.println("Первые " + employeeNumber + " cотрудника/сотрудников с зарплатой меньше " + wage + " рублей:");
        for (Employee empl2 : employees) {
            if (empl2 != null) {
                empl2.printShortInfo();
            }
        }
    }


    private static void findEmployeeByDeptAndWage(EmployeeBook book, Employee findEmployee) {
        System.out.println("Ищем есть ли сотрудник с зарплатой 200 в 3 отделе");
        if (book.isEmployeeExixsts(findEmployee)) {
            System.out.println("Такой сотрудник есть!");
        } else {
            System.out.println("Такого сотрудника нет!");
        }
    }


    private static void findEmployeeById(EmployeeBook book, int findId) {
        Employee findEmplById = book.getEmployeeById(findId);
        if (findEmplById != null) {
            System.out.println("Такой сотрудник найден.");
            System.out.println(findEmplById.toString());
        } else {
            System.out.println("Сотрудника с таким ID нет!");
        }
    }

}
