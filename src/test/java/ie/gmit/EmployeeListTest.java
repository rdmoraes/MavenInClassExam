package ie.gmit;

/*
    EmployeeListTest Class - test the features in list of employees

    G00353112
    Renan Moraes
    12/03/2020
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeListTest {

    Employee employee;
    EmployeeList employeeList;

    @BeforeEach
    void init(){
        employee = new Employee(45264, "Joseph");
        employeeList = new EmployeeList();
        employeeList.addEmployee(employee);
    }

    @Test
    void testAddEmployeeException(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> employeeList.addEmployee(employee));

        assertEquals("Duplicate Employee details found, no object added", exception.getMessage());
    }

    @Test
    void testAddNewEmployeeMethod(){
        employee = new Employee(89756, "Albert");
        assertTrue(employeeList.addEmployee(employee));
    }

    @Test
    void testDeleteEmployeeMethod(){
        Employee employee2 = new Employee(89757, "Daniel");
        employeeList.addEmployee(employee2);
        assertEquals("Employee deleted from list", employeeList.deleteEmployee(89757));
        assertEquals("No matching Employee found", employeeList.deleteEmployee(89757));

    }

    @Test
    void testGetListSizeMethod(){
        Employee employee2 = new Employee(89757, "Daniel");
        employeeList.addEmployee(employee2);

        assertEquals(2, employeeList.getListSize());
        
        employeeList.deleteEmployee(89757);
        assertEquals(1,employeeList.getListSize());

    }

}
