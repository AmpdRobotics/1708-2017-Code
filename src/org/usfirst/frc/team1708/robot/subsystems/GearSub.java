package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearSub extends Subsystem {
	
	public void gearDrop() {
		System.out.println(RobotMap.gearSolenoid.get());
		RobotMap.gearSolenoid.set(true);
		System.out.println(RobotMap.gearSolenoid.get());
	}
	public void gearLoad() {
		RobotMap.gearSolenoid.set(false);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

