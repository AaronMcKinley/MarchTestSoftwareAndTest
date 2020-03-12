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
    private Employee myEmployee2;
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
        assertEquals("Invalid Name length", e.getMessage());
    }
    @Test
    void testNumberException(){
        Exception e = assertThrows(IllegalArgumentException.class , ()-> myEmployee.setEmployeeNumber(1234));
        assertEquals("Employee Number should be 5 digits", e.getMessage());
    }
    @Test
    void testArraySize(){
        assertEquals(1,myEmployee.getListSize());
    }
    //these tests for checking the list class are not working on time
    /*@Test
    void testList(){
        assertEquals("Aaron", myEmployee.getEmployeeListName(myEmployee));
    }
    @Test
    void testAdd(){
        myEmployee.delEmployee(myEmployee)
        assertEquals("Aaron", );
    }
    @Test
    void testDel(){
        assertEquals("Aaron", myEmployee.getEmployeeListName(myEmployee));
    }*/
}
