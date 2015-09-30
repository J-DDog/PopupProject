package input.model;

/**
 * Creates a Thingy object to show access and proper variable types
 * @author jker3169
 *
 */
public class Thingy
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * The bad unwanted constructor, That gives it bad values. DO NOT USE!!!
	 */
	public Thingy()
	{
		name = "";
		age = -99;
		weight = -.008;
		
	}
	
	/**
	 * The constructor that is needed to be called
	 * @param name The name of your Thingy
	 * @param age The age of your Thingy
	 * @param weight The weight of your Thingy
	 */
	public Thingy(String name, int age, double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	public String getName()
	{		
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWieght()
	{	
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
}
