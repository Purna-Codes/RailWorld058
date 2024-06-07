package Encapsulation;

public class GetterSetter 
{
	private long accno;
	private String name,email;
	private float amount;
	
	//Writing Getter Methods
	public long getAccno()
	{
		return accno;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public float getAmount()
	{
		return amount;
	}
	
	//Writing Setter Methods
	public void setAccno(long accno)
	{
		this.accno=accno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setAmount(float amount)
	{
		this.amount=amount;
	}
	//NOTE: THIS KEYWORD IS REPLACED WITH YOUR NAME-E.G-PURNA'S
	//main method
	public static void main(String[] args) 
	{
		GetterSetter gs=new GetterSetter();
		gs.setAccno(256);
		gs.setName("java");
		gs.setEmail("abcd@gmail.com");
		gs.setAmount(199859);
		System.out.println("account number is "+gs.getAccno());
		System.out.println("account name is "+gs.getName());
		System.out.println("account email id is "+gs.getEmail());
		System.out.println("account amount is "+gs.getAmount());
	}
	
}
