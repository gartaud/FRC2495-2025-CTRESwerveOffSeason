
package frc.robot.commands.drivetrain;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.interfaces.ICamera;

/**
 *
 */
public class DrivetrainDriveUsingAprilTagCamera extends Command {

	private CommandSwerveDrivetrain drivetrain;
	private ICamera camera;
	private Joystick joystick;

	public static final double JOYSTICK_AXIS_THRESHOLD = 0.15;

	public DrivetrainDriveUsingAprilTagCamera(CommandSwerveDrivetrain drivetrain, ICamera camera, Joystick joystick) {
		this.drivetrain = drivetrain;
		this.camera = camera;
		this.joystick = joystick;
		
		addRequirements(drivetrain);
		addRequirements(camera);
	}

	// Called just before this Command runs the first time
	@Override
	public void initialize() {
		System.out.println("DrivetrainDriveUsingAprilTagCamera: initialize");
	}


	// Called repeatedly when this Command is scheduled to run
	@Override
	public void execute() {

		double angle = camera.getAngleToTurnToTarget();

		drivetrain.drive(
			-MathUtil.applyDeadband(joystick.getY(), JOYSTICK_AXIS_THRESHOLD),
			-MathUtil.applyDeadband(joystick.getX(), JOYSTICK_AXIS_THRESHOLD),
			-angle/90.00,
			true, true);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	public boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	public void end(boolean interrupted) {
		System.out.println("DrivetrainDriveUsingAprilTagCamera: end");
		drivetrain.stop();
	}
}
