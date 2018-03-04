
import java.awt.Color;	
import java.awt.Graphics;

public class AIPaddle implements Paddle{

	// Final Variables
	final double GRAVITY = 0.94;
	
	//Global Variables
	double y; // position
	double yVelocity; // y velocity
	boolean upAccel; // Going up
	boolean downAccel; // Going down
	int player; // values are 1 or 2 for player1 player2
	int x; 
	
	//Ball Variable
	Ball b1;
		
	public AIPaddle(int Player,Ball b) {
		upAccel = false;
		downAccel = false;
			
		b1 = b;
			
		y = 210; 
		yVelocity = 0;
			
		if (player == 1) 
			x = 20;
		else
			x = 660;
	}
		
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, (int)y, 20, 80);
			
	}

	public void move() {
		y = b1.getY() - 40;
			
		if(y < 0 )
			y = 0;
		if(y > 420)
			y = 420;
	}

	public void setUpAccel(boolean input) {
		upAccel = input;
	}
		
	public void setDownAccel(boolean input) {
		downAccel = input;
	}
		
	public int getY() {
		return (int)y;
			
		}

}


