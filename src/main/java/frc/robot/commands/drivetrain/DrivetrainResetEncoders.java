
package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.InstantCommand;

import frc.robot.subsystems.CommandSwerveDrivetrain;

/**
 * Resets all encoders.
 */
public class DrivetrainResetEncoders extends InstantCommand {

	private CommandSwerveDrivetrain drivetrain;

	public DrivetrainResetEncoders(CommandSwerveDrivetrain drivetrain) {
		this.drivetrain = drivetrain;
		addRequirements(drivetrain);
	}

	// This instant command can run disabled
	@Override
	public boolean runsWhenDisabled() {
		return true;
	}

	// Called once when this command runs
	@Override
	public void initialize() {
		System.out.println("DrivetrainResetEncoders: initialize");
		drivetrain.resetEncoders();
	}

}
