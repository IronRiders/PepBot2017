package org.usfirst.frc.team4180.robot;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain {
	// Jaguar JL1;
	Jaguar leftVic1;
	Jaguar leftJag2, rightJag1, rightJag2;

	public DriveTrain(int leftPort1, int leftPort2, int rightPort1, int rightPort2) {
		leftVic1 = new Jaguar(leftPort1);
		leftJag2 = new Jaguar(leftPort2);
		rightJag1 = new Jaguar(rightPort1);
		rightJag2 = new Jaguar(rightPort2);
	}

	private void SetLeftSpeed(double speed) {
		leftVic1.set(speed);
		leftJag2.set(speed);
	}

	private void SetRightSpeed(double speed) {
		rightJag1.set(speed);
		rightJag2.set(speed);
	}

	public void updateSpeed(double[] JoystickInfo) {
		double x = JoystickInfo[0];
		double y = JoystickInfo[1];
		SetRightSpeed(-y - x);
		SetLeftSpeed(y - x);
	}
}
