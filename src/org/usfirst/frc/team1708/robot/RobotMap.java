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

	public static SpeedController driveFrontLeftMotor = new CANTalon(11);
	public static SpeedController driveRearLeftMotor = new CANTalon(12);
	public static SpeedController driveFrontRightMotor = new CANTalon(13);
	public static SpeedController driveRearRightMotor = new CANTalon(14);
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
