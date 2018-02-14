//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{

		number = num;
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = number;
		for(int n = 1; n <= max; n++)
	    {
		 for(a = n; a <= max; a++)
		    {
		        a = n;
		        for(b = a +1; b <= max; b++)
		        {
		            b =n;
		            for(c = b + 1; c <= max; c++)
		            {
		                c = n;
		                if(Math.pow(a, 2)+ Math.pow(b, 2)== Math.pow(c, 2))
		                {
		                    if((a%2==1 && b%2==0)|| (a%2==0 && b%2==1))
		                    {
		                        if(a%2<=1 && b%2<=1 && c%2<=1)
		                        {

		                            String last = a + "" + b + c;
		                        }
		                    }
		                }

		            }

		        }

		    }
	}

		return 1;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}