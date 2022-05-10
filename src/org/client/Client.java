package org.client;

import org.demo.Company;
import org.demo.Employee;

public class Client {
	
	private void clientName() {
		System.out.println("Client Name :Info Tech");

	}
	public static void main(String[] args) {
		
		Client a=new Client();
		Company c=new Company();
		Employee e=new Employee();
		
		a.clientName();
		c.comName();
		c.comId();
		e.empName();
		e.empId();
	}

}
