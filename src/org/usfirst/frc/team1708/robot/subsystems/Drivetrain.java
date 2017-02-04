package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;
import org.usfirst.frc.team1708.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	RobotDrive robotDrive = new RobotDrive(RobotMap.driveFrontLeftMotor, RobotMap.driveRearLeftMotor,
			RobotMap.driveFrontRightMotor, RobotMap.driveRearRightMotor);
// hi jason
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void joystickDrive(Joystick move) {
		robotDrive.arcadeDrive(move, Joystick.AxisType.kY.value, move, Joystick.AxisType.kZ.value, true);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new JoystickDrive());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
