package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot rob = new Robot();
		rob.setX(30);
		rob.setY(500);
		rob.penDown();
		rob.hide();
		rob.setSpeed(20);
		
		for (int i = 0; i < 10; i++) {
			drawHouse(rob, "small", 0, 100, 255);
		}
		
		
		
	}
	public void drawHouse(Robot rob, String height, int r, int g, int b) {
		
		int heightValue = 60;
		
		if(height.equalsIgnoreCase("small")) {
			heightValue = 60;
		} else if(height.equalsIgnoreCase("medium")) {
			heightValue = 120;
		} else if(height.equalsIgnoreCase("large")) {
			heightValue = 250;
		}
		
		rob.setPenColor(r,g,b);
		rob.setAngle(0);
		rob.move(heightValue);
		if(height.equalsIgnoreCase("large")) {
			drawFlatRoof(rob);
		} else {
			drawPointyRoof(rob);
		}
		rob.setAngle(180);
		rob.move(heightValue);
		rob.setAngle(90);
		rob.setPenColor(0,255,0);
		rob.move(20);
		
	}
	
	public void drawPointyRoof(Robot rob) {
		rob.setAngle(30);
		rob.move(20);
		rob.setAngle(150);
		rob.move(20);
	}
	
	public void drawFlatRoof(Robot rob) {
		rob.setAngle(90);
		rob.move(20);
	}
}
