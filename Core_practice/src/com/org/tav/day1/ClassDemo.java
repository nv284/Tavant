package com.org.tav.day1;

public class ClassDemo {
	
	//instance variable
	public int year_of_joining ;
	
	public String empName ;
	
	//method
	public void disp() {
		String policy = "Company Policies ";
		System.out.println("Employee Name : "+empName + " He joined the Org in : "+year_of_joining +" He must follow the : "+policy );
	}
	
    
	
   //Constructor 
	public ClassDemo( int year_if_joining ,String empName) {
		super();
		this.year_of_joining = year_of_joining;
		this.empName = empName;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ClassDemo emp1 = new ClassDemo(2021, "Harsha Vardhan");
		emp1.empName="ABC";
		
    System.out.println("Hello Everyone!!!");
    emp1.disp();
	}

}
