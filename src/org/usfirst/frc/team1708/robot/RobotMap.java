package org.usfirst.frc.team1708.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	public static final int GRAY = 13; //CAN, currently broken
	public static final int PURPLE = 14; //CAN
	public static final int WHITE = 11; //CAN
	public static final int BLUE = 12; //CAN
	
	public static final int YELLOW = 5; //PWM 
	public static final int ORANGE = 7; //PWM
	public static final int RED = 6; //PWM
	//public static final int BLACK = RSL
	public static final int GREEN = 8; //PWM
	public static final int BROWN = 9; //PWM
	public static SpeedController driveFrontLeftMotor = new VictorSP(GREEN);
	public static SpeedController driveRearLeftMotor = new VictorSP(RED);
	public static SpeedController driveFrontRightMotor = new VictorSP(ORANGE);
	public static SpeedController driveRearRightMotor = new VictorSP(YELLOW);
	
	public static SpeedController elevatorMotor = new CANTalon(WHITE);
	
	public static SpeedController shooterMotor = new CANTalon(PURPLE);
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
