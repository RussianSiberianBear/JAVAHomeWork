public class Employee {
    private static int idCounter = 0;
    private final int id;
    private int department;

    private int wages;
    private String firstName;
    private String lastName;

    private String familyName;

    public Employee(int department, int wages, String firstName, String lastName, String familyName) {

        this.id = ++idCounter;
        this.department = department;
        this.wages = wages;
        this.firstName = firstName;
        this.lastName = lastName;
        this.familyName = familyName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getWages() {
        return this.wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public void printShortInfo() {
        System.out.println("ФИО сотрудника " + this.firstName + " " + this.lastName + " " + this.familyName
                + ", зарплата " + this.wages);
    }


    @Override
    public String toString() {
        return ("Код сотрудника " + this.id + " ФИО сотрудника " + this.firstName + " " + this.lastName + " " + this.familyName
                + ", зарплата " + this.wages);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employee other)) return false;
        return this.wages == other.wages;

    }
}
