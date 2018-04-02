//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(0);
		setY(0);
		setWidth(2);
		setHeight(2); 

	}

   public Block(int x, int y) {
	   setX(x);
	setY(y);
	}

public Block(int x, int y, int w, int h) {
	setX(x);
	setY(y);
	setWidth(w);
	setHeight(h); 
}

public Block(int x, int y, int w, int h, Color col) {
	setX(x);
	setY(y);
	setWidth(w);
	setHeight(h); 
	setColor(col);
}

public void setColor(Color col)
   {
	color = col;

   }

   public void draw(Graphics window)
   {
       window.setColor(color);
       window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   protected int getHeight() {
	return height;
}

protected int getWidth() {
 	return width;
}

public void draw(Graphics window, Color col)
   {
    window.setColor(col);
    window.fillRect(getX(), getY(), getWidth(), getHeight());


   }
   
	public boolean equals(Block obj)
	{
		if(this.getWidth() == obj.getWidth() && this.getHeight() == obj.getHeight() && this.getX() == obj.getX() && this.getY() == obj.getY() && this.getColor() == obj.getColor())
			return true;



		return false;
	}

	protected Color getColor() {
 		return color;
	}

 	public void setPos(int x, int y) {
 		xPos = x;
 		yPos = y;
	}
 	public void setWidth(int w) {
		width = w;
	}
 	public void setHeight(int h) {
		height = h;
	}
 
	@Override
	public void setX(int x) {
		xPos = x;
	}

	@Override
	public void setY(int y) {
		yPos = y;
	}

	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
 	}   

   //add the other get methods
    
	public String toString()
	{
		String output = "";
		output += "x = " + Integer.toString(xPos) + "\n";
		output += "y = " + Integer.toString(yPos) + "\n";
		output += "width = " + Integer.toString(width) + "\n";
		output += "height = " + Integer.toString(height) + "\n";
		output += "Color = " + color + "\n";

		return output;
	}
   //add a toString() method  - x , y , width, height, color
}