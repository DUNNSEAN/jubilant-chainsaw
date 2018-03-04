import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	
	// Variables
	double xVelocity;
	double yVelocity;
	double x; 
	double y;
	
	public Ball() {
		x = 350;
		y = 250;
		xVelocity = getRandomSpeed() * getRandomDirection();
		yVelocity = getRandomSpeed() * getRandomDirection();
	}
	
	public double getRandomSpeed() {
		return (Math.random() * 3 + 2);
	}
	
	public int getRandomDirection() {
		int rand = (int)(Math.random() *2);
		if (rand == 1)
			return 1;
		else 
			return 2;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval((int)x-10, (int)y-10, 20, 20);
	}
	
	public void checkPaddleCollision(Paddle p1, Paddle p2) {
		if( x <= 50) {
			if(y >= p1.getY() && y <= p1.getY() + 80)
				xVelocity = -xVelocity;
		}
		else if (x >= 650) {
			if(y >= p2.getY() && y <= p2.getY() + 80)
				xVelocity = -xVelocity; 
		}
	}
	
	public void move() {
		x += xVelocity;
		y += yVelocity;
		
		if(y < 10)
			yVelocity = -yVelocity;
		if (y > 490)
			yVelocity = -yVelocity;
	}
	
	public int getX() {
		return (int)x;
	}
	
	public int getY() {
		return (int)y;
	}
}
