package org.usfirst.frc.team1708.robot.commands;

import org.usfirst.frc.team1708.robot.Robot;
import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForwardDistance extends Command {

	double speed;
	double distance;

	public DriveForwardDistance(double speed, double distance) {
		requires(Robot.drivetrain);
		this.speed = speed;
		this.distance = distance;
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.drivetrain.resetEncoders();
		Robot.drivetrain.resetGyro();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.drivetrain.driveWithGyro(speed, 0);
	}
	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.drivetrain.getEncoderDistance() >= distance;
	}
	
	protected void end(){
		Robot.drivetrain.resetEncoders();
		Robot.drivetrain.drive(0, 0);
	}
	
	protected void interrupted() {
		Robot.drivetrain.resetEncoders();
		Robot.drivetrain.drive(0, 0);
	}
}