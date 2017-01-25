
package org.usfirst.frc.team4180.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.CameraServer;


public class Robot extends IterativeRobot {
	private static final int DRIVING_JOYSTICK_PORT = 0;
	private LambdaJoystick drivingJoystick;
	private DriveTrain drive;
	private Shooter cannon;
	private UltrasonicRangeSensor rangeSensor, rangeSensor2, rangeSensor3;

    public void robotInit() {
    	drive = new DriveTrain(0, 1, 2, 3);
    	cannon = new Shooter(5);
    	drivingJoystick = new LambdaJoystick(DRIVING_JOYSTICK_PORT, joystickInfo -> drive.updateSpeed(joystickInfo));
    	drivingJoystick.addButton(1, () -> cannon.shoot(), () -> cannon.stopShooting());
    	rangeSensor = new UltrasonicRangeSensor(3);
    	rangeSensor2 = new UltrasonicRangeSensor(1);
    	rangeSensor3 = new UltrasonicRangeSensor(2);
    	
    	CameraServer cs = CameraServer.getInstance();
    	cs.startAutomaticCapture();
    }
    

    public void teleopPeriodic() {
    	drivingJoystick.listen();
    	String range = "" + rangeSensor.getRangeInches();
    	String range2 = "" + rangeSensor2.getRangeInches();
    	String range3 = "" + rangeSensor3.getRangeInches();
		SmartDashboard.putString("DB/String 5", ("Range: " + range.substring(0, 10)));
		SmartDashboard.putString("DB/String 6", ("Range: " + rangeSensor.getValue()));
		//SmartDashboard.putString("DB/String 7", ("Range3: " + range3.substring(0, 10)));

    }
   
 /*   public void teleopInit() {
    	cannon.shoot();
    }
    
*/
}
