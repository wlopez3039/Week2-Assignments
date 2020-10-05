import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class RoboFace extends GraphicsProgram {
	public void run() {
		GRect Head = new GRect(100, 100, 200, 600);
		Head.setColor(Color.black);
		Head.setFillColor(Color.gray);
		double x= (getWidth() - Head.getWidth())/2;
		double y= (getHeight() - Head.getHeight())/2;
		add(Head, x, y);
		
		GRect Mouth = new GRect(100, 100, 200, 300);
		Mouth.setColor(Color.white);
		double x= (Head.getWidth() - Mouth.getWidth())/2;
		double y= (Head.getHeight() - Mouth.getHeight())/3;
		add (Mouth, x, y);
		
		GOval leftEye = new GOval(100, 100, 50, 50);
		leftEye.setColor(Color.yellow);
		double x= (Head.getWidth() - leftEye.getRadius())/4;
		double y= (Head.getHeight() - leftEye.getRadius())/4;
		add (leftEye, x, y);
		
		GOval rightEye = new GOval(300, 300, 50, 50);
		rightEye.setColor(Color.yellow);
		double x= (Head.getWidth() - rightEye.getRadius())/4;
		double y= (Head.getHeight() - rightEye.getRadius));
		add (rightEye, x, y);
		
	}
}