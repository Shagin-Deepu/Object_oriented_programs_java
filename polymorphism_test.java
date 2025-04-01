import java.io.*;
import java.util.*;
abstract class shape 
{	public abstract void numberOfSides();	}
	class Rectangle extends shape
	{	public void numberOfSides()
	{	
		System.out.println(" Number of sides Rectangle = 4");
		}}
	class Triangle extends shape
	{	public void numberOfSides()
	{	System.out.println(" Number of sides of Triangle = 3");
		}}
	class Hexagon extends shape 
	{	public void numberOfSides()
	{	System.out.println(" Number of sides of Hexagon = 6");
		}}
		
	class polymorphism_test
	{	public static void main(String args[])
	{	Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
		
	}}
