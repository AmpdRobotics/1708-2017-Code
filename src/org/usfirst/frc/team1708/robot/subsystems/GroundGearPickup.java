package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GroundGearPickup extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void gearIntake() {
		RobotMap.gearIntakeMotor.set(.5);
	}

	public void gearIntakeOff() {
		RobotMap.gearIntakeMotor.set(0);
	}

	public void gearCollectorUp() {
		RobotMap.gearSolenoid.set(true);
	}

	public void gearCollectorDown() {
		RobotMap.gearSolenoid.set(false);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
