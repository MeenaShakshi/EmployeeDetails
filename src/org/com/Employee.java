package org.com;

public class Employee {
	public static void empId() {
		System.out.println(1234);
		}
public static void empName() {
	System.out.println("Meena");
}
public static void empDOB() {
	System.out.println("Apr-30");
}
public static void empPhone() {
	System.out.println(7401211603l);
}
public static void empEmail() {
	System.out.println("meena.3093@gmail.com");
}
public static void empAdd() {
	System.out.println("chennai");
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDOB();
	e.empEmail();
	e.empPhone();
	e.empAdd();

}
}


