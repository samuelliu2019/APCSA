//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   

   public Ball(int i, int j) {
		// TODO Auto-generated constructor stub
	}

public Ball(int i, int j, int k, int l) {
	// TODO Auto-generated constructor stub
}

public Ball(int i, int j, int k, int l, Color blue) {
	// TODO Auto-generated constructor stub
}

public Ball(int i, int j, int k, int l, Color blue, int m, int n) {
	// TODO Auto-generated constructor stub
}

public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}

	public void setXSpeed(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setYSpeed(int i) {
		// TODO Auto-generated method stub
		
	}

	public int getYSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getXSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}   

   //add the get methods

   //add a toString() method
}