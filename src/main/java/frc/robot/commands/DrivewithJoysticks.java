// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivetrain;

public class DrivewithJoysticks extends Command {
  drivetrain m_drive;
  double throttle;
  double twist;
  /** Creates a new DrivewithJoysticks. */
  public DrivewithJoysticks(drivetrain drive, double param_throttle, double param_twist) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drive = drive;
    throttle = param_throttle;
    twist = param_twist;
    addRequirements(m_drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drive.arcadedrive();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
