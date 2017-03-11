package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.RobotMap;
import org.usfirst.frc.team1708.robot.commands.JoystickDrive;
import org.usfirst.frc.team1708.robot.commands.ShiftHighDrive;
import org.usfirst.frc.team1708.robot.commands.ShiftLowDrive;
import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
/**
 *
 */
public class Drivetrain extends Subsystem {
	 double Kp = .03;
	RobotDrive robotDrive;

	public Drivetrain() {

		robotDrive = new RobotDrive(RobotMap.driveFrontLeftMotor, RobotMap.driveRearLeftMotor,
				RobotMap.driveFrontRightMotor, RobotMap.driveRearRightMotor);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		RobotMap.leftDriveEncoder = new Encoder(8, 9, false, Encoder.EncodingType.k4X);
		
		RobotMap.rightDriveEncoder = new Encoder(6, 7, true, Encoder.EncodingType.k4X);
		
		RobotMap.leftDriveEncoder.setDistancePerPulse(1);
		RobotMap.rightDriveEncoder.setDistancePerPulse(1);
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

	public void joystickDrive(Joystick move) {
		//robotDrive.arcadeDrive(move.getY(), move.getZ(), true); //competition bot
		robotDrive.arcadeDrive(move.getY(), - move.getZ(), true); //practice chassis
	}
	
	public void resetEncoders() {
		RobotMap.leftDriveEncoder.reset();
		RobotMap.rightDriveEncoder.reset();
	}
	
	public double getEncoderDistance() {
	return	RobotMap.rightDriveEncoder.getDistance();
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new ShiftHighDrive());
	
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
