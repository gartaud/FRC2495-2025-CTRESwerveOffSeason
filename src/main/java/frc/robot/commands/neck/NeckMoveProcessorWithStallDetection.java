
package frc.robot.commands.neck;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Neck;

/**
 *
 */
public class NeckMoveProcessorWithStallDetection extends Command {

	private Neck neck;

	public NeckMoveProcessorWithStallDetection(Neck neck) {
		this.neck = neck;
		addRequirements(neck);
	}

	// Called just before this Command runs the first time
	@Override
	public void initialize() {
		System.out.println("NeckMoveProcessorWithStallDetection: initialize");
		neck.moveProcessor();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	public void execute() {
		// nothing
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	public boolean isFinished() {
		//return !neck.tripleCheckMove() || neck.tripleCheckIfStalled();
		return neck.tripleCheckIfStalled();
	}

	// Called once after isFinished returns true
	@Override
	public void end(boolean interupted) {
		System.out.println("NeckMoveProcessorWithStallDetection: end");
		neck.stay();  // we don't want to stop so we stay at midway...
	}
}
