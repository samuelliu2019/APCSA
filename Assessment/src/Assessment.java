import java.util.Arrays;

public class Assessment {

	
	public static boolean isGoofy(int num)
	{
		String number = Integer.toString(num);	
		int ret = 0;
		int count = number.length();
		int[] array = new int[count];
		for(int i = 0; i < count; i++)
		{
			int a = Integer.parseInt(number.substring(i,i+1));
			array[i] = a;
		}
		for(int i: array)
		{
			if(i > 0)
			{
			if(num%i == 0)
			{
				ret += i;
			}
			}
		}
		if(ret%2 == 0)
		{
			return false;
		}
		return true;
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int x = 0;
		int[] array = new int[count];
		int index = 0;
		while(count != x)
		{
			for(int i = 1; i<99999999; i++)
			{
				if(isGoofy(i) == true)
				{
					array[index] = i;
					count++;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {

		String test = (Arrays.toString(getSomeGoofyNumbers(4)));
		System.out.println(test);
	}
	
}

