import java.io.*;
import java.util.*;
class employee
{
	String name;
	int age;
	String phone_number;
	String address;
	String Salary;
	
void printSalary()	{
	System.out.println("salary: "+ Salary);
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
	
	off.name = "Shagin";
	off.age = 20;
	off.phone_number = "123456789";
	off.address = "india";
	off.Salary = "9999999999";
	off.department = "CS";
	
	mana.name = "Deepu";
	mana.age = 02;
	mana.phone_number = "987654321";
	mana.address = "india";
	mana.Salary = "11111111111";
	mana.specialisation = "SC";
	
	System.out.println("officer data ");
	System.out.println("name: " + off.name);
	System.out.println("age: " + off.age);
	System.out.println("phone_number: " + off.phone_number);
	System.out.println("address: " + off.address);
	off.printSalary();
	
	System.out.println("\n");
	System.out.println("manager data");
	System.out.println("name: " + mana. name);
	System.out.println("age: " + mana.age);
	System.out.println("phone_number: " + mana.phone_number);
	System.out.println("address: " + mana.address);
	mana.printSalary();

}
}


