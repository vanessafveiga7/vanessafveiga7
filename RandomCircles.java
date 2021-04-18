package week2;

import acm.program.GraphicsProgram;

	import acm.graphics.*;
	import acm.util.*;
	 
	public class RandomCircles extends GraphicsProgram {
	 
	    
		private static final long serialVersionUID = 1L;
		private RandomGenerator rgen = RandomGenerator.getInstance();
	    private static final int numberOfCircles = 10;
	    private static final int minRadius = 5;
	    private static final int maxRadius = 50;
	 
	    public void run() {
	        for(int i=0; i<(int) numberOfCircles; i++ ) {
	            drawCircle();
	        }
	    }
	 
	    private void drawCircle() {
	        double radius = rgen.nextDouble(minRadius, maxRadius);
	        double x = rgen.nextDouble(0, getWidth() - radius*2);
	        double y = rgen.nextDouble(0, getHeight() - radius*2);
	        GOval circle = new GOval(x, y, radius, radius);
	        circle.setFilled(true);
	        circle.setColor(rgen.nextColor());
	        add(circle);
	    }
	}

