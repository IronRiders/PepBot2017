package org.usfirst.frc.team4180.robot;

import java.math.BigDecimal;

import edu.wpi.first.wpilibj.AnalogInput;

public class UltrasonicRangeSensor extends AnalogInput {
	private AnalogInput analogInput;
	public static final Double VOLTAGE_PER_INCH = 0.0095;

	public UltrasonicRangeSensor(int port) {
		super(port);
	}

	public double getRangeInches() {		
		return getVoltage();	 
	}
}