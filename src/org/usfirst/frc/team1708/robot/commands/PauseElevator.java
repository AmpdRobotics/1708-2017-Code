package org.usfirst.frc.team1708.robot.commands;

import org.usfirst.frc.team1708.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PauseElevator extends Command {
	long startTime;

	public PauseElevator() {
		requires(Robot.elevator);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		startTime = System.currentTimeMillis();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.elevator.ballUp();

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return System.currentTimeMillis() >= startTime + 650;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
