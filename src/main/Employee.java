package main;

import java.util.Arrays;

/**
 * 
 */

public class Employee {
	private String[] name;
	private int year;
	
	/**
	 * Constructor de Empleado
	 * @param name nombre del empleado
	 * @param year edad del empleado
	 */
	public Employee(String[] name, int year) {
		this.name = name;
		this.year = year;
	}

	
	public String[] getName() {
		return name;
	}

	
	public void setName(String[] name) {
		this.name = name;
	}

	
	public int getYear() {
		return year;
	}

	
	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Employee [name=" + Arrays.toString(name) + ", year=" + year + "]";
	}
	
	
	
	
}
