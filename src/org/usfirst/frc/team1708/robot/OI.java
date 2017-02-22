package org.usfirst.frc.team1708.robot;

import org.usfirst.frc.team1708.robot.commands.ElevatorDown;
import org.usfirst.frc.team1708.robot.commands.ElevatorOff;
import org.usfirst.frc.team1708.robot.commands.ElevatorUp;
import org.usfirst.frc.team1708.robot.commands.IntakeCommand;
import org.usfirst.frc.team1708.robot.commands.IntakeOffCommand;
import org.usfirst.frc.team1708.robot.commands.OuttakeCommand;
import org.usfirst.frc.team1708.robot.commands.ShiftHighDrive;
import org.usfirst.frc.team1708.robot.commands.ShiftHighGear;
import org.usfirst.frc.team1708.robot.commands.ShiftLowDrive;
import org.usfirst.frc.team1708.robot.commands.ShiftLowGear;
import org.usfirst.frc.team1708.robot.commands.ShootHigh;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
	public Joystick joystickDrive = new Joystick(0);
	public Joystick joystickMech = new Joystick(1);
	Button shiftGearHigh = new JoystickButton(joystickDrive, 4);
	Button shiftGearDown = new JoystickButton(joystickDrive, 3);
	Button intake = new JoystickButton(joystickMech, 5);
	Button outtake = new JoystickButton(joystickMech, 6);
	Button elevatorUp = new JoystickButton(joystickMech, 8);
	Button elevatorDown = new JoystickButton(joystickMech, 7);
	Button shootHigh = new JoystickButton(joystickMech, 1);

	public OI() {
		//// TRIGGERING COMMANDS WITH BUTTONS

		// Once you have a button, it's trivial to bind it to a button in one of
		// three ways:

		// Start the command when the button is pressed and let it run the
		// command
		// until it is finished as determined by it's isFinished method.
		// button.whenPressed(new ExampleCommand());

		// Run the command while the button is being held down and interrupt it
		// once
		// the button is released.
		// button.whileHeld(new ExampleCommand());

		// Start the command when the button is released and let it run the
		// command
		// until it is finished as determined by it's isFinished method.
		// button.whenReleased(new ExampleCommand());
		shiftGearHigh.whenPressed(new ShiftHighDrive());
		shiftGearDown.whenPressed(new ShiftLowDrive());

		elevatorUp.whileHeld(new ElevatorUp());
		elevatorUp.whenReleased(new ElevatorOff());

		elevatorDown.whileHeld(new ElevatorDown());
		elevatorDown.whenReleased(new ElevatorOff());

		shootHigh.whileHeld(new ShootHigh());

		intake.whileHeld(new IntakeCommand());
		intake.whenReleased(new IntakeOffCommand());

		outtake.whileHeld(new OuttakeCommand());
		outtake.whenReleased(new IntakeOffCommand());
	}
}
