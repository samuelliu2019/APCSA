//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster()
	{
		setHeight(10);
		setWeight(10);
		setAge(10);
	}


	//write an initialization constructor with an int parameter ht

	public Monster(int ht)
	{
		setHeight(ht);
	}

	//write an initialization constructor with int parameters ht and wt

	public Monster(int ht, int wt)
	{
		setHeight(ht);
		setWeight(wt);
	}


	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age)
	{
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}


	//modifiers - write set methods for height, weight, and age

	public void setHeight(int ht)
	{
		myHeight = ht;
	}
	public void setWeight(int wt)
	{
		myWeight = wt;
	}
	public void setAge(int age)
	{
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getHeight()
	{
		return myHeight;
	}
	public int getWeight()
	{
		return myWeight;
	}
	public int getAge()
	{
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(getHeight(), getWeight(), getAge());
	}

	public boolean equals( Object obj )
	{
		Monster rhs = (Monster)obj;
		if( this.getHeight()==rhs.getHeight() && this.getAge()==rhs.getAge() && this.getWeight()==rhs.getWeight())
			return true;
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(this.equals(rhs))
			return 0;
		else if(this.getHeight()>rhs.getHeight())
			return 1;
		else if(this.getHeight()<rhs.getHeight())
			return -1;
		else if(this.getWeight()>rhs.getWeight())
			return 1;
		else if(this.getWeight()<rhs.getWeight())
			return -1;
		else if(this.getAge()>rhs.getAge())
			return 1;
		else if(this.getAge()<rhs.getAge())
			return -1;
		return 0;
	}

	//write a toString() method
	public String toString()
	{
		String output = Integer.toString(getHeight()) + " " + Integer.toString(getWeight()) + " " + Integer.toString(getAge());
		return output;
	}
	
}