//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound = false;
	public Maze()
	{
		maze = new int[][]{{'1','1'},
				{'1','1'}};
		

	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner file = new Scanner(line);
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j< size; j++)
			{
				maze[i][j]=file.nextInt();
			}
		}
	}

	public void hasExitPath(int r, int c)
	{
		if(r < maze.length && r >=0 && c < maze.length && c >=0 && maze[r][c]==1)
		{		
			maze[r][c] = 0;
			if(c==maze.length-1)
			{
				exitFound = true;
				return;
			}
			else
			{
				hasExitPath(r+1,c);
				hasExitPath(r,c-1);
				hasExitPath(r,c+1);
				hasExitPath(r-1,c);
 			}
			
		}
 	}

	public String toString()
	{
		String output="";
		output+=(Arrays.deepToString(maze));
		hasExitPath(0,0);
		if(exitFound == true)
			output+="\n"+"exit found";
		else
			output+="\n"+"exit not found";

		return output;
	}
}