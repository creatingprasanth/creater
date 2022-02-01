package tamilnadu.madurai;

import tamilnadu.chennai.Office;

public class Employee2 //Canonical
{
public static void main(String[] args)
{

Employee2 emp = new Employee2();
emp.wfh();
	Office off = new Office();
	off.provideSalary();
	}
public void wfh()
{
System.out.println("Connected through online");
}
}