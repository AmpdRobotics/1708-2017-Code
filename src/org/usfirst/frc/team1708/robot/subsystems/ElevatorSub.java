package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorSub extends Subsystem {
	public void ballUp() {
		RobotMap.elevatorMotor.set(-.75);
	}
    public void ballDown() {
    	RobotMap.elevatorMotor.set(.75);
    }
    public void elevatorOff() {
    	RobotMap.elevatorMotor.set(0);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

