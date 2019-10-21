package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
		Robot r1 = new Robot(200, 400);
		Robot r2 = new Robot(300, 400);
		Robot r3 = new Robot(400, 400);
		
		Robot r4= new Robot(250, 500);
		Robot r5= new Robot(350, 500);
		
		r1.penDown();
		r2.penDown();
		r3.penDown();
		r4.penDown();
		r5.penDown();
		
		r1.hide();
		r2.hide();
		r3.hide();
		r4.hide();
		r5.hide();
		
		
		r1.setPenColor(Color.BLUE);
		r2.setPenColor(Color.BLACK);
		r3.setPenColor(Color.RED);
		r4.setPenColor(Color.YELLOW);
		r5.setPenColor(Color.GREEN);
		
				
		r1.setSpeed(10);
		r2.setSpeed(10);
		r3.setSpeed(10);
		r4.setSpeed(10);
		r5.setSpeed(10);
		
		Thread v1 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r1.move(1);	
				r1.turn(1);
			}	
			});
		Thread v2 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r2.move(1);	
				r2.turn(1);
			}	
			});
		Thread v3 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r3.move(1);	
				r3.turn(1);
			}	
			});
		Thread v4 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r4.move(1);	
				r4.turn(1);
			}	
			});
		Thread v5 = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r5.move(1);	
				r5.turn(1);
			}	
			});

		
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		v5.start();
		
		
		
	}
}

