package org.usfirst.frc.team1708.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.SpeedController;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	public static final int GRAY = 13;
	public static final int PURPLE = 14;
	public static final int WHITE = 11;
	public static final int BLUE = 12;
//	public static final int YELLOW = 
//	public static final int ORANGE = 
//	public static final int RED = 
//	public static final int BLACK = 
//	public static final int GREEN = 
//	public static final int BROWN = 
	public static SpeedController driveFrontLeftMotor = new CANTalon(PURPLE);
	public static SpeedController driveRearLeftMotor = new CANTalon(BLUE);
	public static SpeedController driveFrontRightMotor = new CANTalon(GRAY);
	public static SpeedController driveRearRightMotor = new CANTalon(WHITE);
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
