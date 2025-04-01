import java.io.*;
import java.util.*;
class employee
{
	String name;
	int age;
	String phone_number;
	String address;
	float salary;
	
void printsalary()	{
	System.out.println("salary:$ ", + salary);
	}
}

class officer extends employee
{
	String department;
}

class manager extends employee
{
	String specialisation;
}

class inherit
{
	public static void main(String args[])
{
	officer off = new officer();
	manager mana = new manager();
	
	off.name = ;
	off.age = 5;
	off.phone_number = phone_number;
	off.address = address;
	off.salary = salary;
	off.department = department;
	
	mana.name = name;
	mana.age = age;
	mana.phone_number = phone_number;
	mana.address = address;
	mana.salary = salary;
	mana.specialisation = specialisation;
	
	System.out.println("name: " + off.name);
	System.out.println("age: " + off.age);
	System.out.println("phone_number: " + off.phone_number);
	System.out.println("address: " + off.address);
	officer.printsalary();
	
	System.out.println("name: " + mana. name);
	System.out.println("age: " + mana.age);
	System.out.println("phone_number: " + mana.phone_number);
	System.out.println("address: " + mana.address);
	manager.printsalary();

}
}


















