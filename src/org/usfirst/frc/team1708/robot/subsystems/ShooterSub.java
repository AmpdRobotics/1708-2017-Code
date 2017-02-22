package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;
import org.usfirst.frc.team1708.robot.commands.ShotWithJoystick;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class ShooterSub extends Subsystem {
	public ShooterSub() {
		// RobotMap.hallEffectSensorShooter.setMaxPeriod(.1);
		// RobotMap.hallEffectSensorShooter.setUpdateWhenEmpty(true);
		// RobotMap.hallEffectSensorShooter.setSamplesToAverage(10);

	}

	public void setShooterSpeed(double value) {
		RobotMap.shooterMotor.set(value);
	}

	public double getShooterSpeed() {
		return RobotMap.hallEffectSensorShooter.getRate();
	}

	public void resetCounter() {
		RobotMap.hallEffectSensorShooter.reset();
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		setDefaultCommand(new ShotWithJoystick());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

}
