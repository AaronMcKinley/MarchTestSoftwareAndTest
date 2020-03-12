/*
Aaron Mckinley
G00299523
This is the Employee class where Employee objects are made
 */

package ie.gmit;

public class Employee extends EmployeeList{
    private String name;
    private int employeeNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=5) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Employee Name is too short");
        }
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        if(employeeNumber>9999) {
            this.employeeNumber = employeeNumber;
        }
        else{
            throw new IllegalArgumentException("Employee Number is too short");
        }
    }
    public Employee(String name, int number){
        setName(name);
        setEmployeeNumber(number);
    }
}
