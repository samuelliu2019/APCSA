//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;
	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		
		
	}

	public void hasExitPath(int r, int c)
	{
		if(r < maze.length && r >=0 && c < maze.length && c >=0 && maze[r][c]==1)
		{
			if(c==maze.length-1)
				exitFound = true;
			else
			{
				int save = maze[r][c];
				hasExitPath(r+1,c);
				hasExitPath(r,c-1);
				hasExitPath(r,c+1);
				hasExitPath(r-1,c);
				maze[r][c]=save;
			}
		}
 	}

	public String toString()
	{
		String output="";





		return output;
	}
}