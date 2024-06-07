package Interface;

class ImpClass1 implements Drawable
{
	public void draw()
	{
		System.out.println("draw a circle");
	}
	public static void main(String args[])
	{  
		ImpClass1 c=new ImpClass1();
		c.draw();
	} 
}