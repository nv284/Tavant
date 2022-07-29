package com.org.tav.day7;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
  
// Class
@Entity
@Table(name = "P_Employee")
public class P_Employee extends Employee {
	 @Column(name = "salary") private double salary;
	  
	    // Getter and setters
	    public double getSalary() { return salary; }
	    public void setSalary(double salary)
	    {
	        // this keyword refers to current instance itself
	        this.salary = salary;
	    }
}
