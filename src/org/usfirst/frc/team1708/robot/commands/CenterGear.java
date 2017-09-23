package org.usfirst.frc.team1708.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterGear extends CommandGroup {

    public CenterGear() {
    	addSequential(new DriveForwardTime(-.7, 2400));
    	System.out.println("drive forward");
    	addSequential(new DriveForwardTime(0, 500));
    	System.out.println("stop");
    	addSequential(new GearCollectorDown());
    	System.out.println("down");
    	addSequential(new DriveForwardTime(0, 1500));
    	System.out.println("stop");
    	addParallel(new GearCollectorIntake());
    	addParallel(new DriveForwardTime(.6, 1500));
    	System.out.println("out and back");
    	
    //	addSequential(new TurnWithGyro(.5));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
    	        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
