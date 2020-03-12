/*
Aaron Mckinley
G00299523
This is the List class to add and delete Employee objects from an ArrayList
 */

package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {
    ArrayList<Employee> employees = new ArrayList();

    public void addEmployee(Employee e){
        for(int i=0; i<employees.size(); i++){
            Employee temp = employees.get(i);
            if(temp.getEmployeeNumber() != e.getEmployeeNumber()){
                employees.add(e);
            }
            else{
                new IllegalArgumentException("Duplicate Employee Found, no object added");
            }
        }
    }
    public void delEmployee(Employee e){
        for(int i=0; i<employees.size(); i++){
            Employee temp = employees.get(i);
            if(temp.getEmployeeNumber() == e.getEmployeeNumber()){
                employees.remove(e);
            }
            else{
                new IllegalArgumentException("No Matching Employee Found");
            }
        }
    }
    public int getListSize(){
        return employees.size()+1;
    }

    public String getEmployeeListName(Employee e){
        for(int i=0; i<employees.size(); i++){
            Employee temp = employees.get(i);
            if(temp.getEmployeeNumber() == e.getEmployeeNumber()){
                return temp.getName();
            }
        }
        //throw new IllegalArgumentException("Employee does not exists");
        return "failed";
    }
}
