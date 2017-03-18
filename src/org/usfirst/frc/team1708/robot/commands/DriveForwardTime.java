package org.usfirst.frc.team1708.robot.commands;

import java.time.Clock;

import org.usfirst.frc.team1708.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForwardTime extends Command {
	double speed;
	long timeInMS;
	long startTime;

	public DriveForwardTime(double speed, long timeInMS) {
		requires(Robot.drivetrain);
		this.speed = speed;
		this.timeInMS = timeInMS;

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		startTime = System.currentTimeMillis();
		Robot.drivetrain.resetGyro();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.drivetrain.driveWithGyro(speed, 0);

		
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return timeInMS + startTime <= System.currentTimeMillis();
	}

	// Called once after isFinished returns true
	protected void end() {
		System.out.println("encoder distance auto" + Robot.drivetrain.getEncoderDistance());
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
