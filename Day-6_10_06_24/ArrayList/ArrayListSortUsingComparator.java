package ArrayList;

import java.util.Comparator;

public class ArrayListSortUsingComparator 
{
	String brand;
	String model;
	int price;
	int rating;
	public ArrayListSortUsingComparator(String brand,String model,int price,int rating) 
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.rating=rating;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public int getPrice()
	{
		return price;
	}
	public void getPrice(int price)
	{
		this.price=price;
	}
	public int getRating()
	{
		return rating;
	}
	public void getRating(int rating)
	{
		this.rating=rating;
	}
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "SmartPhone [brand=" + brand + ", model=" + model + ", price=" + price + ", rating=" + rating + "]";
	}
	public int compareTo(ArrayListSortUsingComparator alc) 
	{
		return this.price-alc.price;

	}
}
class RatingComparator implements Comparator<ArrayListSortUsingComparator> {  
    @Override  
    public int compare(ArrayListSortUsingComparator obj1, ArrayListSortUsingComparator obj2) {  
        return (obj1.rating<obj2.rating) ? -1 : (obj1.rating>obj2.rating) ? 1 : 0;  
    }  
}  
