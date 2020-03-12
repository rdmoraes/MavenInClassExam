package ie.gmit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Employee Test Class - test functionality of employee class

    G00353112
    Renan Moraes
    12/03/2020
 */
public class EmployeeTest {

    Employee employee;

    @BeforeEach
    void init(){
        employee = new Employee( 54167,"James");
    }

    @Test
    void testEmployeeConstructorInvalidNameLength(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> employee = new Employee( 54168,"Eva"));

        assertEquals("Invalid name length", exception.getMessage());

    }

    @Test
    void testEmployeeConstructorInvalidIdDigits(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> employee = new Employee( 5469, "Robert"));

        assertEquals("Employee Number should be 5 digits", exception.getMessage());

    }

    @Test
    void testGetNameMethod(){
        assertEquals("James", employee.getName());
    }

    @Test
    void testGetIDMethod(){
        assertEquals(54167, employee.getId());
    }

}
