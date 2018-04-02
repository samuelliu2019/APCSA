//© A+ Computer Science  -  www.apluscompsci.com
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
super(i,j);
}

public Ball(int i, int j, int k, int l) {
super(i,j,k,l);
}

public Ball(int i, int j, int k, int l, Color col) {
	super(i,j,k,l,col);
}

public Ball(int i, int j, int k, int l, Color col, int m, int n) {
	super(i,j,k,l,col);
	setXSpeed(m);
	setYSpeed(n);
}

public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	Color white = null;
 	draw(window,white);

      setX(getX()+xSpeed);
	  setY(getY()+ySpeed);
	  draw(window,getColor());

		//draw the ball at its new location
   }
   
	public boolean equals(Ball obj)
	{
		if(this.getWidth() == obj.getWidth() && this.getHeight() == obj.getHeight() && this.getX() == obj.getX() && this.getY() == obj.getY() && this.getColor() == obj.getColor())
			return true;

		return false;
	}

	public void setXSpeed(int i) {
		xSpeed = i;
	}

	public void setYSpeed(int i) {
		ySpeed = i;
	}

	public int getYSpeed() {
 		return ySpeed;
	}


	public int getXSpeed() {
 		return xSpeed;
	}   
	public String toString()
	{
		String output = "";
		output+= 
	}
}