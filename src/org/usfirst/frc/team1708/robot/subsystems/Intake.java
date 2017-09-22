package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void intakeBall() {
//		RobotMap.robotIntake.set(1);
	}	
	public void outtakeBall() {
//		RobotMap.robotIntake.set(-1);
	}
	public void intakeDisable() {
//		RobotMap.robotIntake.set(0);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

