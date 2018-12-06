package org.usfirst.frc.team2620.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.CameraServer;

public class Robot extends TimedRobot {



 public WPI_TalonSRX rightDrive = new WPI_TalonSRX(0);
  
 public WPI_TalonSRX leftDrive = new WPI_TalonSRX(1);

 public DifferentialDrive diffDrive = new DifferentialDrive(leftDrive, rightDrive);

 public Joystick right = new Joystick(1);

 

	public Robot(){
		CameraServer.getInstance().startAutomaticCapture();
		
	}
	
	public void robotInit(){
		
  }

	public void autonomousInit(){

  }

	public void autonomousPeriodic(){
	}
	

	public void teleopInit() {
	}

	public void  teleopPeriodic() 
	{	
		//double rStickX = right.getx();
		//double rStickY = left.gety();

		
		
		boolean rTrigger = right.getRawButton(1);
		boolean rFaceB = right.getRawButton(2);
		boolean rFaceL = right.getRawButton(3);
		boolean rFaceR = right.getRawButton(4);
		boolean rPLTLeft = right.getRawButton(5);
		boolean rPLTCenter = right.getRawButton(12);
		boolean rPLTRight = right.getRawButton(13);
		boolean rPLBLeft = right.getRawButton(16);
		boolean rPLBCenter = right.getRawButton(15);
		boolean rPLBRight = right.getRawButton(14);
		boolean rPRTLeft = right.getRawButton(7);
		boolean rPRTCenter = right.getRawButton(6);
		//boolean rPRTRight = right.getRawButton(5);
		boolean rPRBLeft = right.getRawButton(8);
		boolean rPRBCenter = right.getRawButton(9);
		boolean rPRBRight = right.getRawButton(10);
		int rPOV = right.getPOV();  // Top Directional Thumb on joystick
		
		diffDrive.arcadeDrive(right.getRawAxis(1), (right.getRawAxis(0)*-1)); 
	}

	
	

	public void testPeriodic() {
        
    }
}
