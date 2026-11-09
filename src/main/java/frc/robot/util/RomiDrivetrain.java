// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.romi.RomiGyro;
import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj.romi.OnBoardIO.ChannelMode;

public class RomiDrivetrain {
  private static final double kCountsPerRevolution = 1440.0;
  private static final double kWheelDiameterInch = 2.75591; // 70 mm

  // The Romi has the left and right motors set to
  // PWM channels 0 and 1 respectively
  private final Spark m_leftMotor = new Spark(0);
  private final Spark m_rightMotor = new Spark(1);

  // The Romi has onboard encoders that are hardcoded
  // to use DIO pins 4/5 and 6/7 for the left and right
  private final Encoder m_leftEncoder = new Encoder(4, 5);
  private final Encoder m_rightEncoder = new Encoder(6, 7);

  // Set up the differential drive controller
  private final DifferentialDrive m_diffDrive =
      new DifferentialDrive(m_leftMotor::set, m_rightMotor::set);

  private final RomiGyro m_gyro = new RomiGyro();
  private final OnBoardIO m_onboard = new OnBoardIO(ChannelMode.INPUT, ChannelMode.OUTPUT);


  // NOTE: Singletons are NOT recommended; this is only done to reduce
  // boilerplate code in Robot.java for the intro workshops 
  private static final RomiDrivetrain m_instance = new RomiDrivetrain();
  public static RomiDrivetrain getInstance() { return m_instance; }

  /** Creates a new RomiDrivetrain. */
  private RomiDrivetrain() {
    // Use inches as unit for encoder distances
    m_leftEncoder.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);
    m_rightEncoder.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);
    resetEncoders();

    // Invert right side since motor is flipped
    m_rightMotor.setInverted(true);
  }

  public void arcadeDrive(double xaxisSpeed, double zaxisRotate) {
    m_diffDrive.arcadeDrive(xaxisSpeed, zaxisRotate);
  }

  public void resetEncoders() {
    m_leftEncoder.reset();
    m_rightEncoder.reset();
  }

  public double getLeftDistanceInch() {
    return m_leftEncoder.getDistance();
  }

  public double getRightDistanceInch() {
    return m_rightEncoder.getDistance();
  }

  public double getHeading() {
    return m_gyro.getAngle();
  }


  public void resetGyro() {
    m_gyro.reset();
  }

  public boolean getButtonAPressed() {
    return m_onboard.getButtonAPressed();
  }

  public boolean getButtonBPressed() {
    return m_onboard.getButtonBPressed();
  }

  // public boolean getButtonCPressed() {
  //   return m_buttons.getButtonCPressed();
  // }

  // public void setGreenLed(boolean value) {
  //   m_onboard.setGreenLed(value);
  // }

  // public void turnGreenLedOn() {
  //   setGreenLed(true);
  // }

  // public void turnGreenLedOff() {
  //   setGreenLed(false);
  // }

  public void setRedLed(boolean value) {
    m_onboard.setRedLed(value);
  }

  public void turnRedLedOn() {
    setRedLed(true);
  }

  public void turnRedLedOff() {
    setRedLed(false);
  }

  public void setYellowLed(boolean value) {
    m_onboard.setYellowLed(value);
  }

  public void turnYellowLedOn() {
    setYellowLed(true);
  }

  public void turnYellowLedOff() {
    setYellowLed(false);
  }
 
}
