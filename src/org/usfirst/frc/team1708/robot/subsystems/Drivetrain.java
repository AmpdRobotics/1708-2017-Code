package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;
import org.usfirst.frc.team1708.robot.commands.JoystickDrive;
import org.usfirst.frc.team1708.robot.commands.ShiftHighDrive;
import org.usfirst.frc.team1708.robot.commands.ShiftLowDrive;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drivetrain extends Subsystem {
	RobotDrive robotDrive;

	public Drivetrain() {
		
		
		robotDrive = new RobotDrive(RobotMap.driveFrontLeftMotor, RobotMap.driveRearLeftMotor,
				RobotMap.driveFrontRightMotor, RobotMap.driveRearRightMotor);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		

	}

	public void gearShiftLow() {
		RobotMap.gearShifter.set(DoubleSolenoid.Value.kForward);
	}

	public boolean inLowGear() {
		return RobotMap.gearShifter.get() == DoubleSolenoid.Value.kForward;
	}

	public boolean inHighGear() {
		return RobotMap.gearShifter.get() == DoubleSolenoid.Value.kReverse;
	}

	public void gearShiftHigh() {
		RobotMap.gearShifter.set(DoubleSolenoid.Value.kReverse);
	}
	public void drive(double move, double turn) {
		robotDrive.arcadeDrive(move, turn);
	}
//	public void encoderLeft() {
	//	RobotMap.leftDriveEncoder.get();
	//}
//	public void encoderRight(double rightValue) {
//		RobotMap.rightDriveEncoder.get();
//	}
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void joystickDrive(Joystick move) {
		//robotDrive.arcadeDrive(move.getY(), move.getZ(), true); //competition bot
		robotDrive.arcadeDrive(move.getY(), - move.getZ(), true); //practice chassis
	}

	public void initDefaultCommand() {
		setDefaultCommand(new ShiftHighDrive());
		
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
