package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Tank Drive")
public class Jack extends LinearOpMode {
    private DcMotor frontleft;
    private DcMotor frontright;

    @Override
    public void runOpMode() throws InterruptedException {
    frontleft= hardwareMap.get(DcMotor.class,"frontleft");
    frontleft.setPower(1.0);
    frontright=hardwareMap
    }
}
