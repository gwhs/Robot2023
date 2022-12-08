// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.AutoAlignCommands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.LimelightPortal;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class PrintLimelightDistance extends InstantCommand {
  /** Creates a new GoToDistanceTimeOfFlight. 
   * Prints the distance time of flight detects, 
   * never prints exact number
  */
  LimelightPortal llGet = new LimelightPortal();

  public PrintLimelightDistance() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    double llDistance = llGet.getDistance();
    double llX = llGet.getX();
    SmartDashboard.putNumber("limelight-distance", llDistance);
    SmartDashboard.putNumber("limelight-angle", llX);
  }
}