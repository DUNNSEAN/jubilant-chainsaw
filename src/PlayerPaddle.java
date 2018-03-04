import java.awt.Color;
import java.awt.Graphics;

public class PlayerPaddle implements Paddle{

	// Final Variables
	final double GRAVITY = 0.94;
	
	//Global Variables
	double y; // position
	double yVelocity; // y velocity
	boolean upAccel; // Going up
	boolean downAccel; // Going down
	int player; // values are 1 or 2 for player1 player2
	int x; 
	
	public PlayerPaddle(int Player) {
		upAccel = false;
		downAccel = false;
		
		//Starting points
		y = 210; 
		yVelocity = 0;
		
		if (player == 1) 
			x = 660;
		else
			x = 20;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, (int)y, 20, 80);
		
	}

	public void move() {
		if(upAccel) {
			yVelocity -= 2;
		}
		else if(downAccel) {
			yVelocity += 2;
		}
		else if(!upAccel && !downAccel)
		{
			yVelocity *= GRAVITY;
		}
		
		if (yVelocity >= 5)
			yVelocity = 5;
		else if (yVelocity <= -5)
			yVelocity = -5;
		
		y += yVelocity;
		
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
