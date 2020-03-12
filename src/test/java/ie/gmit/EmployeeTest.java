/*
Aaron Mckinley
G00299523
This is the test class to make sure that there is no error in the code
 */

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    private Employee myEmployee;
    @BeforeEach
    void init(){
        myEmployee = new Employee("Aaron", 1234567);
        myEmployee.addEmployee(myEmployee);
    }
    @Test
    void testName(){
        assertEquals("Aaron", myEmployee.getName());
    }
    @Test
    void testNumber(){
        assertEquals(1234567, myEmployee.getEmployeeNumber());
    }
    @Test
    void testNameException(){
        Exception e = assertThrows(IllegalArgumentException.class , ()-> myEmployee.setName("Bob"));
        assertEquals("Employee Name is too short", e.getMessage());
    }
    @Test
    void testNumberException(){
        Exception e = assertThrows(IllegalArgumentException.class , ()-> myEmployee.setEmployeeNumber(1234));
        assertEquals("Employee Number is too short", e.getMessage());
    }
    @Test
    void testList(){
        assertEquals("Aaron", myEmployee.getEmployeeListName(myEmployee));
    }
}
