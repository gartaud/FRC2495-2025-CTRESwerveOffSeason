
// package frc.robot.commands.old_neck;

// import edu.wpi.first.wpilibj2.command.Command;

// import frc.robot.subsystems.OldNeck;

// /**
//  *
//  */
// public class OldNeckMoveFeedNoteWithStallDetection extends Command {

// 	private OldNeck old_neck;

// 	public OldNeckMoveFeedNoteWithStallDetection(OldNeck old_neck) {
// 		this.old_neck = old_neck;
// 		addRequirements(old_neck);
// 	}

// 	// Called just before this Command runs the first time
// 	@Override
// 	public void initialize() {
// 		System.out.println("moveToFeedNote: initialize");
// 		old_neck.moveToFeedNote();
// 	}

// 	// Called repeatedly when this Command is scheduled to run
// 	@Override
// 	public void execute() {
// 		// nothing
// 	}

// 	// Make this return true when this Command no longer needs to run execute()
// 	@Override
// 	public boolean isFinished() {
// 		return !old_neck.tripleCheckMove() || old_neck.tripleCheckIfStalled();
// 	}

// 	// Called once after isFinished returns true
// 	@Override
// 	public void end(boolean interupted) {
// 		System.out.println("OldNeckMoveFeedNoteWithStallDetection: end");
// 		old_neck.stay();  // we don't want to stop so we stay up...
// 	}
// }
