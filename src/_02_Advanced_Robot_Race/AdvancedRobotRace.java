package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.junit.runner.notification.RunListener.ThreadSafe;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	//1. make a main method
		public static void main(String[] args) {
			
			//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		Thread [] threads= new Thread[5];
			//3. use a for loop to initialize the robots.
		for(int i = 0; i < 5; i++) {
			robots[i] = new Robot();
		}
				//4. make each robot start at the bottom of the screen, side by side, facing up
		for(int i = 0; i < robots.length; i++) {
			robots[i].setX((i+1)*140);
			robots[i].setY(560);
			robots[i].setSpeed(100);	
		}
			//5. use another for loop to iterate through the array and make each robot move 
		    //   a random amount less than 50.
		Random r = new Random();
		boolean b = true;
		int winner=0;
		
		for (int i = 0; i < robots.length; i++) {
			
			int k=i;
			int winerr=winner;
			threads[i]=new Thread(()->{
				robots[k].move(r.nextInt(50));
				
			});
			if (robots[i].getY()<=0) {
				winner= i;
			}
			
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		
			//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

			//7. declare that robot the winner and throw it a party!
	    	JOptionPane.showMessageDialog(null, "robot " + winner + " has won the race");
			//8. try different races with different amounts of robots.
	    	
		    //9. make the robots race around a circular track.
	    	for(int i = 0; i < 5; i++) {
	    		robots[i].setX(600);
	    		robots[i].setY(300);
	    		robots[i].setSpeed(100);	
	    	}
	    	
	    	boolean s = true;
	    	int rr;
	    	while(s == true) {
	        		for(int i = 0; i < 5; i++) {
	        			
	        			rr = r.nextInt(10);
	        			robots[i].turn((rr/2)*-1);
	        			robots[i].move(rr);
	        			if(robots[i].getY() > 300 && robots[i].getX() > 590) {
	        				s = false;
	        				winner = i;
	        				i = 5;
	        			}
	        		}
	    	}
	    	
	    	JOptionPane.showMessageDialog(null, "robot " + winner + " has won the race");
	    	
		}
}
