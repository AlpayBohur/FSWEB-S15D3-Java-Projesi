package workintech.main;

import com.workintech.model.Employee;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        setEmployeeList(employeeList);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println("Removed Employees:");
        for (Employee removedEmployee : removedEmployees) {
            System.out.println(removedEmployee);
        }

        System.out.println("\nUnique Employees:");
        for (Employee uniqueEmployee : employeeMap.values()) {
            System.out.println(uniqueEmployee);
        }
    }

    public static void setEmployeeList(LinkedList<Employee> employeeList) {
        employeeList.add(new Employee(1, "name1", "lastname1"));
        employeeList.add(new Employee(2, "name2", "lastname2"));
        employeeList.add(new Employee(3, "name3", "lastname3"));
        employeeList.add(new Employee(4, "name4", "lastname4"));
        employeeList.add(new Employee(5, "name5", "lastname5"));
    }
}
