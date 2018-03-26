<<<<<<< HEAD
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = null;

	}

	public void setTicTacToe(String game)
	{
		int count = 0;
		mat = new char[3][3];
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
			{
				mat[i][j]=game.charAt(count);
				count++;
			}

	}

	public String getWinner()
	{
		if(mat[0][0]==mat[1][1] && mat[1][1] == mat[2][2])
			return mat[0][0] + " wins diagonally";
		if(mat[0][2]==mat[1][1] && mat[1][1] == mat[2][0])
			return mat[1][1] + " wins diagonally";
		if(mat[0][1]==mat[1][1] && mat[1][1] == mat[2][1])
			return mat[0][1] + " wins vertically";
		if(mat[0][0]==mat[1][0] && mat[1][0] == mat[2][0])
			return mat[0][0] + " wins vertically";
		if(mat[0][2]==mat[1][2] && mat[1][2] == mat[2][2])
			return mat[0][2] + " wins vertically";
		if(mat[2][1]==mat[2][0] && mat[2][0] == mat[2][2])
			return mat[2][1] + " wins horizontally";
		if(mat[1][0]==mat[1][1] && mat[1][1] == mat[1][2])
			return mat[1][0] + " wins horizontally";
		if(mat[0][2]==mat[0][1] && mat[0][1] == mat[0][0])
			return mat[0][2] + " wins horizontally";

		return "no winner";
	}

	public String toString()
	{
		String output="";
		output+=(Arrays.deepToString(mat));

		output+= getWinner();





		return output+"\n\n";
	}
=======
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = null;

	}

	public void setTicTacToe(String game)
	{
		int count = 0;
		mat = new char[3][3];
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
			{
				mat[i][j]=game.charAt(count);
				count++;
			}

	}

	public String getWinner()
	{
		if(mat[0][0]==mat[1][1] && mat[1][1] == mat[2][2])
			return mat[0][0] + " wins diagonally";
		if(mat[0][2]==mat[1][1] && mat[1][1] == mat[2][0])
			return mat[1][1] + " wins diagonally";
		if(mat[0][1]==mat[1][1] && mat[1][1] == mat[2][1])
			return mat[0][1] + " wins vertically";
		if(mat[0][0]==mat[1][0] && mat[1][0] == mat[2][0])
			return mat[0][0] + " wins vertically";
		if(mat[0][2]==mat[1][2] && mat[1][2] == mat[2][2])
			return mat[0][2] + " wins vertically";
		if(mat[2][1]==mat[2][0] && mat[2][0] == mat[2][2])
			return mat[2][1] + " wins horizontally";
		if(mat[1][0]==mat[1][1] && mat[1][1] == mat[1][2])
			return mat[1][0] + " wins horizontally";
		if(mat[0][2]==mat[0][1] && mat[0][1] == mat[0][0])
			return mat[0][2] + " wins horizontally";

		return "no winner";
	}

	public String toString()
	{
		String output="";
		output+=(Arrays.deepToString(mat));

		output+= getWinner();





		return output+"\n\n";
	}
>>>>>>> origin/master
}