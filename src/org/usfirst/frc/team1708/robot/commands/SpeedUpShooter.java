package org.usfirst.frc.team1708.robot.commands;

import java.time.Clock;
import java.time.Instant;

import org.usfirst.frc.team1708.robot.Robot;
import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpeedUpShooter extends Command {
	long startTime;

	public SpeedUpShooter() {
		requires(Robot.shooter);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		startTime = System.currentTimeMillis();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.shooter.setShooterSpeed(RobotMap.HIGH_SHOT_SPEED);
		//System.out.println("shooter speed" + Robot.shooter.getShooterSpeed());
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return System.currentTimeMillis() >= startTime + 1000;
		// return Math.abs(RobotMap.HIGH_SHOT_SPEED -
		// Robot.shooter.getShotSpeed()) <= .01;

	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
