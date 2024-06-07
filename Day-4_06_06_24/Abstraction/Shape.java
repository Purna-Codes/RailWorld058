package Abstraction;

abstract class Shape
{  
	abstract void draw();  
}  
class Rectangle extends Shape
{  
	void draw()
	{
		System.out.println("drawing a new rectangle");//implementation 1 by Rectangle Class
	}  
}  
class Circle1 extends Shape
{  
	void draw()
	{
		System.out.println("drawing a new circle");//implementation 2 by Circle1 class
	}  
} 

