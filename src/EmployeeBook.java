public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public Employee[] getEmployees() {
        return this.employees;
    }
    public enum TaxType {
        PROPORTIONAL,
        PROGRESSIVE
    }

    public float getAvgWages() {
        float sum = 0F;
        int count = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                sum += empl.getWages();
                count++;
            } else {
                break;
            }
        }
        return (count > 0) ? sum / count : 0F;
    }

    public float getTax(TaxType taxType) {
        float sum = 0F;
        for (Employee empl : employees) {
            if (empl == null) {
                continue;
            }

            switch (taxType) {
                case PROPORTIONAL:
                    sum += empl.getWages() * 0.13F;

                    break;

                case PROGRESSIVE:
                    if (empl.getWages() < 150) {
                        sum += empl.getWages() * 0.13F;
                    } else if (empl.getWages() >= 150 && empl.getWages() < 350) {
                        sum += empl.getWages() * 0.17F;
                    } else {
                        sum += empl.getWages() * 0.21F;
                    }
            }

        }
        return sum;
    }

    public int wageIndexes(int dept, float percent) {
        int result = 0;

        if (dept < 1) return 0; // ошибка! Номер отдела не может быть меньше 0
        for (Employee empl : employees) {
            if ((empl == null) || (empl.getDepartment() != dept)) {
                continue;
            }
            empl.setWages((int) (empl.getWages() * (1.0F + percent)));
            result++;
        }
        return result;
    }

    public Employee getEmployeeByDeptAndWage(int dept, int wage) {
        // по условиям задачи городим огород для break
        Employee result = null;
        for (Employee empl : employees) {
            if ((empl != null) && (empl.getDepartment() == dept) && (empl.getWages() > wage)) {
                result = empl;
                break;
            }
        }
        return result;
    }

    public Employee[] getFirstEmployeesWithLessWages(int wage, int count) {

        if (count <= 0 || count > employees.length || wage < 0) {
            return null;
        }
        Employee[] result = new Employee[count];
        int idx = 0;
        int i = 0;
        while (idx < this.employees.length) {
            if ((this.employees[idx] != null) && (employees[idx].getWages() < wage)) {
                result[i] = this.employees[idx];
                i++;
                count--;
                if (count == 0) {
                    break;
                }
            }
            idx++;
        }
        return result;
    }

    public boolean isEmployeeExixsts(Employee empl) {
        boolean result = false;
        for (Employee empl2 : employees) {
            if (empl2 == null) {
                continue;
            }
            if (empl2.equals(empl)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean addEmployee(Employee empl) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = empl;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        if (id < 0 || id > employees.length) {
            return null;
        }

        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }
}
