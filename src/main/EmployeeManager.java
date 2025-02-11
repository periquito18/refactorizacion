package main;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	
	List<Employee> employee;
	
  //List<String> employeeNames = new ArrayList<String>();
  //List<Integer> employeeYears = new ArrayList<Integer>();
  //int numberOfEmployees = 0;
    
	public EmployeeManager() {
		super();
		employee = new ArrayList<Employee>();
	}
	
    public void addEmployee(String name, int years) {
        Employee employee = new Employee(String name, int years) {
        	employees.add(employee);
        }
    }
    
    public void printEmployees() {
        for(Employee e: employees) {
        	System.out.println("Nombre :" + name);
        	System.out.println("Edad :" + years);
        }
    }
}
