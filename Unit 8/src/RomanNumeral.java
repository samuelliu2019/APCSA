//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{

		setRoman(str);

	}

	public RomanNumeral(Integer orig)
	{

		setNumber(orig);

	}

	public void setNumber(Integer num)
	{
		
		number = num;


	}

	public void setRoman(String rom)
	{

		roman = rom;

	}

	public Integer getNumber()
	{
		number = 0;
		while(roman.length() > 0)
		{
			for(int x = 0; x < LETTERS.length; x++)
			{
				while(roman.indexOf(LETTERS[x]) == 0)
				{
					number = number + NUMBERS[x];
					if((LETTERS[x]).length() == 2)
					{
						roman = roman.substring(2);
					}
					else
					{
						roman = roman.substring(1);
					}
					
				}
			}
		}
		return number;
	}

	public String toString()
	{
		roman = "";
		int num = number;
		while(num > 0)
		{
			for(int x = 0; x < NUMBERS.length; x++)
			{
				while(num >= NUMBERS[x])
				{
					roman = roman + LETTERS[x];
					num = num - NUMBERS[x];
				}
			}
		}
		return roman + "\n";
	}
}