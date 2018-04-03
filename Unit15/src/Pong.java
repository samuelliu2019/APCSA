import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import static java.lang.Character.*;

import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	
	private int leftScore;
	private int rightScore;
	
	private boolean gameOver = false;

	public Pong()
	{
		//set up all variables related to the game
		//ball = new Ball();
		ball = new BlinkyBall();
		ball.setColor(Color.GREEN);
		leftPaddle = new Paddle(5, 10, 5, 10, 100);
		rightPaddle = new Paddle(720, 10, 5, 10, 100);
		
		leftPaddle.setColor((Color.BLUE));
		rightPaddle.setColor(new Color(0xff83ff));
		
		leftScore = 0;
		rightScore = 0;
		
		//ball.setXSpeed(3);
		//ball.setYSpeed(3);
		//back = new BufferedImage();

		keys = new boolean[4];
	
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
 		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }
   
   
   private static boolean PtInRect(Paddle p, int x, int y )
   {
       return x >= p.getX() && x < p.getX() + p.getWidth()
           && y >= p.getY() && y < p.getY() + p.getHeight();
   }

   public void paint(Graphics window)
   {
	   
	   Graphics2D twoDGraph = (Graphics2D)window;
	   
	   if (gameOver) {
		   
		  
		   
		  
		   return;
	   }
	   
		//set up the double buffering to make the game animation nice and smooth
		

		
		back = (BufferedImage)(createImage(getWidth(),getHeight()));	
		
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveDownAndDraw(window);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveDownAndDraw(window);
			
		}
		if(keys[3] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}

		//see if ball hits left wall or right wall
		/*if(!(ball.getX()>=10 && ball.getX()<=730))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=550))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		*/
		
		//window.setColor(Color.BLACK);
		
		if (ball.didCollideLeft(null)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			rightScore ++;
			gameOver = true;
		}
			
		if (ball.didCollideRight(null)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			leftScore ++;
			gameOver = true;
		}
		
		if (ball.didCollideTop(null) || ball.didCollideBottom(null)) {
			ball.setYSpeed(-ball.getYSpeed());

		}
		
		
		if (PtInRect(rightPaddle, ball.getX(), ball.getY())) {
			
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		
		if (PtInRect(leftPaddle, ball.getX(), ball.getY())) {
			ball.setXSpeed(-ball.getXSpeed());
			leftScore ++;
			
		}
		
	
		if (leftPaddle.getY() < 0)
			leftPaddle.setY(0);
		
		if (rightPaddle.getY() < 0)
			rightPaddle.setY(0);
		
		if (leftPaddle.getY() > 500)
			leftPaddle.setY(500);
		
		if (rightPaddle.getY() > 500)
			rightPaddle.setY(500);
		
		

		//see if the paddles need to be moved

		twoDGraph.drawImage(back, null, 0, 0);
	   
		twoDGraph.setColor(new Color(0x800080));
		twoDGraph.drawRect(2, 2, 730, 557);
		twoDGraph.drawString("Leftscore: " + Integer.toString(leftScore), 20, 520);
		twoDGraph.drawString("Rightscore: " + Integer.toString(rightScore), 20, 550);
		try {
			Thread.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
   
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
			
			case 'R':
				
				ball = new BlinkyBall();
				//ball.setXSpeed(3);
				//ball.setYSpeed(3);
				gameOver = false;
				break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   			
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}