package org.usfirst.frc.team1708.robot.commands;

import org.usfirst.frc.team1708.robot.Robot;
import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnWithGyro extends Command {
	double value = 0;
	double tolerance = 0.05;
    public TurnWithGyro(double value) {
    	this.value = value;
    	requires(Robot.drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.resetGyro();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.drivetrain.getGyro() > value) {
    		Robot.drivetrain.drive(0, -.5);
    	}
    	else if(Robot.drivetrain.getGyro() < value) {
    		Robot.drivetrain.drive(0, .5);
    	}
    	else {
    		Robot.drivetrain.drive(0, 0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	double currentValue = Robot.drivetrain.getGyro();
        if(currentValue > 0) {
        	return currentValue <= value + tolerance && currentValue >= value - tolerance;
          }
        else {
        	return currentValue >= value + tolerance && currentValue <= value - tolerance;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.drive(0, 0);
    }
}
