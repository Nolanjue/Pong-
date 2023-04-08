
import java.awt.Color;
import java.awt.Graphics;


public class Ball {
//the class for the ball thats being hit by the paddles(used for collision tests)
  
  public static final int SIZE = 16;
  //size of the ball, final is used because its a constant
  private int x, y; 
  //to find the cooridnate position of the ball
  private int xVel, yVel;  
  //velocity of the ball(direction)
  private int speed = 5; 
  //speed of the ball(time) 

  
  public Ball() {
    reset();
    //calls the reset method
  }

  
  private void reset() {
    
    x = Main.WIDTH / 2 - SIZE / 2; 
    y = Main.HEIGHT / 2 - SIZE / 2;
    //position of the ball, size is subtracted as X is set in the top left corner of the screen
   
    xVel = Main.sign(Math.random() * 2.0 - 1);
    yVel = Main.sign(Math.random() * 2.0 - 1);
    //finds velocity. sign is calling the direction 
  }

  
  public void draw(Graphics g) {
    g.setColor(Color.white);
    //color of the ball is set
    g.fillRect(x, y, SIZE, SIZE);
    //rectangle(the shape of the ball) is being filled
  }

 
  public void update(Paddle lp, Paddle rp) {
 //needed for collision tests and for the ball to move
   
    x += xVel * speed;
    //x position of the ball after movement 
    y += yVel * speed;
    //y position of the ball after movement


   
    if (y + SIZE >= Main.HEIGHT || y <= 0)
      changeYDir();
    //collisions of the ceiling and the floor. if the ball touches the top(equal to height) or touches the floor(at zero) it will change direction


    if (x + SIZE >= Main.WIDTH) { 
    //collisions of the walls, if it touches the walls(equal to the width), then it will change direction)
      lp.addPoint();
      //point gained to the left if it touches the wall
      reset();
    }
    if (x <= 0) { 
      rp.addPoint();
      //point gained to the right side(if it touches the other side)
      reset();
    }
  }

  
  public int getX() {
    return x;
  }
``
 
  public int getY() {
    return y;
  }
``//Getters and setters for x and y position of the ball
 
  public void changeXDir() {
  //in the case of collision,the x velocity is changed(angle changes when it bounces off)
    xVel *= -1;
  }

  
  public void changeYDir() {
    //in the case of collision, the y velocity is changed
    yVel *= -1;
  }
}
