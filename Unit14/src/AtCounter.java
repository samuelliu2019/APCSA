//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
			   atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if(atMat[r][c] == '-')
			return 0;
		
		if(r == 0)
		{
			if(c==0)
				return 1 + countAts(1,0) + countAts(0,1);
			if(c==10)
				return 1 + countAts(0,9) + countAts(1,10);
			return 1 + countAts(0,c+1) + countAts(0,c-1) + countAts(1,c);
		}
		if(r == 10){
			if(c==10)
				return 1 + countAts(9,10) + countAts(10,9);
			if(c==0)
				return 1 + countAts(10,1) + countAts(9,0);
			return 1 + countAts(10,c+1) + countAts(10,c-1) + countAts(9,c);
		}
		if(c==10)
			return 1 + countAts(r+1,c) + countAts(r-1,c) + countAts(r,9);
		if(c==0)
			return 1 + countAts(r+1,c) + countAts(r-1,c) + countAts(r,1);
		return 1 + countAts(r+1,c) + countAts(r,c+1) + countAts(r-1,c) + countAts(r, c-1);
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}