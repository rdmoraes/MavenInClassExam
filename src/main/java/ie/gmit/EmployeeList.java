package ie.gmit;

import java.util.ArrayList;

/*
    EmployeeList Class - organizes the employees in a list

    G00353112
    Renan Moraes
    12/03/2020
 */
public class EmployeeList {

    private ArrayList<Employee> employeesList;

    public EmployeeList(){
        employeesList = new ArrayList<>();
    }


    Boolean addEmployee(Employee employee){
        if(employeesList.contains(employee)){
            throw new IllegalArgumentException("Duplicate Employee details found, no object added");
        }
        employeesList.add(employee);
        return employeesList.contains(employee);
    }

    String deleteEmployee(int employeeNumber){
        for (Employee employee: employeesList){
            if(employee.getId() == employeeNumber){
                employeesList.remove(employee);
                return "Employee deleted from list";
            }

        }
        return "No matching Employee found";

    }

    public int getListSize() {
        return employeesList.size();
    }
}
