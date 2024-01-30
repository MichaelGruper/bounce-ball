import java.awt.*;
import java.util.*;

public class Ball {
    private int size;
    private int randomR;
    private int randomG;
    private int randomB;
    private Color color;
    private int speed;
    private int xLoc, yLoc;

    public Ball(int xLoc, int yLoc){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        size = 20;
        speed = 20;
        randomR = (int)(Math.random()*255);
        randomG = (int)(Math.random()*255);
        randomB = (int)(Math.random()*255);
        color = new Color(randomR,randomG,randomB);
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(xLoc,yLoc,size,size);
    }

    public void move(){
        xLoc += speed;
        yLoc += speed;
    }
    public int getXLoc(){
        return xLoc;
    }
    public int getYLoc(){
        return yLoc;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int newSpeed){
        speed *= newSpeed;
    }


}

