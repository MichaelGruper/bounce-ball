import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MyPanel extends JPanel {
private Ball[] ballArray = new Ball[20];
private int xLoc = (int)(Math.random() + 255) , yLoc = (int)(Math.random() + 255);
private int xVel = 100;
private int yVel = 100;
public MyPanel(){
for(int i = 0;i<ballArray.length;i++){
    xLoc = (int)(Math.random()*500);
    yLoc = (int)(Math.random()*500);
    ballArray[i] = new Ball(xLoc,yLoc);

 }
}
    @Override
    public void paintComponent(Graphics g) {
        //super means go up one level and call the method
        super.paintComponent(g);
        for (int i = 0; i < ballArray.length; i++) {
            ballArray[i].draw(g);
            ballArray[i].move();
//        xLoc += xVel;
//        yLoc += yVel;

            //subtract ball width from panel size
            if (ballArray[i].getXLoc() >= getWidth()-ballArray[i].getSize()) {
                ballArray[i].setXSpeed(-1);
            }
            if (ballArray[i].getXLoc() <= 0) {
                ballArray[i].setXSpeed(-1);
            }
            if (ballArray[i].getYLoc() >= getHeight()-ballArray[i].getSize()) {
                ballArray[i].setYSpeed(-1);
            }
            if (ballArray[i].getYLoc() <= 0) {
                ballArray[i].setYSpeed(-1);
            }
            //this is the delay for repaint
            //you need one of these because it is guaranteed to throw an exception
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            //repaint method calls paintComponent again
            repaint();
        }

    }
}
