package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name ="motor tester ")
public class Motortester extends LinearOpMode {
    public DcMotor revmotor;
    @Override
    public void runOpMode() throws InterruptedException {
        revmotor = hardwareMap.get(DcMotor.class,"Motor");

        waitForStart();

        double motorpower=-gamepad1.left_stick_y;
        revmotor.setPower(motorpower);



    }
}
