// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.util.KeyboardController;
import frc.robot.util.RomiDrivetrain;


public class Robot extends TimedRobot {
 
  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {

  }

  






























































  /*
If you are reading this, Congrats you have found the actucal functions for the robot.
This section was moved to the bottom of the file to make it less confusing for new programmers
However, if you wish to see the real code then be my guest. Look through it!
Check the functions and see what they do. If you want to change the robot's behavior, this is the place to do it.
If you want to learn more about how a XRP actually works, check out the RomiDrivetrain.java file in the util folder. 
It has all the code for the drivetrain and other sensors.
*/

// ================ DRIVE FUNCTIONS ========================


  private void drive(double speed, double turn) {
    RomiDrivetrain.getInstance().arcadeDrive(speed, turn);
  }

  private void driveForward() {
    drive(0.75, 0);
  }

  private void driveReverse() {
    drive(-0.75, 0);
  }

  private void stop() {
    drive(0, 0);
  }

  // ================ ROBOT SENSOR FUNCTIONS ======================
  private void resetEncoders() {
    RomiDrivetrain.getInstance().resetEncoders();
  }

  private double getLeftDistanceInch() {
    return RomiDrivetrain.getInstance().getLeftDistanceInch();
  }

  private double getRightDistanceInch() {
    return RomiDrivetrain.getInstance().getRightDistanceInch();
  }

  private double getHeading() {
    return RomiDrivetrain.getInstance().getHeading();
  }

  private void resetGyro() {
    RomiDrivetrain.getInstance().resetGyro();
  }

  private boolean getRomiAPressed() {
    return RomiDrivetrain.getInstance().getButtonAPressed();
  }

  private boolean getRomiBPressed() {
    return RomiDrivetrain.getInstance().getButtonBPressed();
  }

  private boolean getRomiCPressed() {
    return RomiDrivetrain.getInstance().getButtonCPressed();
  }

  // private void setGreenLed(boolean value) {
  //   RomiDrivetrain.getInstance().setGreenLed(value);
  // }

  // private void turnGreenLedOn() {
  //   setGreenLed(true);
  // }

  // private void turnGreenLedOff() {
  //   setGreenLed(false);
  // }

  // private void setRedLed(boolean value) {
  //   RomiDrivetrain.getInstance().setRedLed(value);
  // }

  // private void turnRedLedOn() {
  //   setRedLed(true);
  // }

  // private void turnRedLedOff() {
  //   setRedLed(false);
  // }

  // private void setYellowLed(boolean value) {
  //   RomiDrivetrain.getInstance().setYellowLed(value);
  // }

  // private void turnYellowLedOn() {
  //   setYellowLed(true);
  // }

  // private void turnYellowLedOff() {
  //   setYellowLed(false);
  // }


  // ================ CONTROLLER FUNCTIONS ========================
  private boolean getZButtonPressed() {
    return KeyboardController.getInstance().getRawButtonPressed(1);
  }
  
  private boolean getZButton() {
    return KeyboardController.getInstance().getRawButton(1);
  }

  private boolean getZButtonReleased() {
    return KeyboardController.getInstance().getRawButtonReleased(1);
  }

  private boolean getXButtonPressed() {
    return KeyboardController.getInstance().getRawButtonPressed(2);
  }
  
  private boolean getXButton() {
    return KeyboardController.getInstance().getRawButton(2);
  }

  private boolean getXButtonReleased() {
    return KeyboardController.getInstance().getRawButtonReleased(2);
  }

  private boolean getCButtonPressed() {
    return KeyboardController.getInstance().getRawButtonPressed(3);
  }
  
  private boolean getCButton() {
    return KeyboardController.getInstance().getRawButton(3);
  }

  private boolean getCButtonReleased() {
    return KeyboardController.getInstance().getRawButtonReleased(3);
  }

  private boolean getVButtonPressed() {
    return KeyboardController.getInstance().getRawButtonPressed(4);
  }
  
  private boolean getVButton() {
    return KeyboardController.getInstance().getRawButton(4);
  }

  private boolean getVButtonReleased() {
    return KeyboardController.getInstance().getRawButtonReleased(4);
  }

  private int getPOV() {
    return KeyboardController.getInstance().getPOV();
  }

  private double getADAxis() {
    return KeyboardController.getInstance().getRawAxis(0);
  }

  private double getWSAxis() {
    return KeyboardController.getInstance().getRawAxis(1);
  }

  private double getERAxis() {
    return KeyboardController.getInstance().getRawAxis(2);
  }
}
