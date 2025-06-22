public class EmployeeManagementSystem {
    private final Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(int id, String name, String department) {
        if (count >= employees.length) {
            System.out.println("Employee list is full.");
            return;
        }
        employees[count++] = new Employee(id, name, department);
        System.out.println("Employee added.");
    }

    public void viewEmployees() {
        if (count == 0) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("Employee List:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void updateEmployee(int id, String newName, String newDept) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                employees[i].setName(newName);
                employees[i].setDepartment(newDept);
                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                // Shift left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
