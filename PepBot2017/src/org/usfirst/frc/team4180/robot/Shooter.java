package org.usfirst.frc.team4180.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;

public class Shooter {
	//Solenoid Valve;
	VictorSP cannon;
	
	public Shooter(int port) {
		cannon = new VictorSP(port);
		//Valve = new Solenoid(port);
		
	}
	
	public void /*open*/shoot() {
		cannon.set(1);
		// Valve.set(true);
	
	}
	
	public void /*close*/stopShooting() {
		cannon.set(0);
		// Valve.set(false);
	
	}
}
