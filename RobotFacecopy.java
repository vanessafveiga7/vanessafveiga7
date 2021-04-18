package week2;

import java.awt.Color;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {

	
	private static final long serialVersionUID = 1L;
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_WIDTH = 60;
	private static final int MOUTH_HEIGHT = 20;

	public void run(){
		double cx = getWidth()/2;
		double cy = getHeight()/2;
		addHead(cx - HEAD_WIDTH/2, cy - HEAD_HEIGHT/2);
		addEye(cx - HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
		addEye(cx + HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
		addMouth(cx - MOUTH_WIDTH/2, cy + HEAD_HEIGHT/4);
	}
	
	
	private void drawRectangle(double x, double y, double width, double height, Color c){
		GRect rect = new GRect(x,y,width, height);
		rect.setFilled(true);
		rect.setFillColor(c);
		add(rect);
	}
	
	
	private void drawCircle(double cx, double cy, double r, Color c){
		double x = cx - r;
		double y = cy - r;
		GOval circle = new GOval(2*r, 2*r);
		circle.setColor(c);
		circle.setFilled(true);
		add(circle, x, y);
	}

	
	private void addHead(double x, double y){
		drawRectangle(x, y, HEAD_WIDTH, HEAD_HEIGHT, Color.GRAY);
		
	}
	
	
	private void addEye(double cx, double cy){
		drawCircle(cx, cy, EYE_RADIUS, Color.YELLOW);
	}
	
	
	private void addMouth(double x, double y){
		drawRectangle(x,y, MOUTH_WIDTH, MOUTH_HEIGHT, Color.WHITE);
	} 
}
