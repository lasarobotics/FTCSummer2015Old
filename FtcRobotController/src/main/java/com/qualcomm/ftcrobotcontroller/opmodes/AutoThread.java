package com.qualcomm.ftcrobotcontroller.opmodes;

import com.lasarobotics.ftc.monkeyc.MonkeyC;
import com.lasarobotics.ftc.monkeyc.MonkeyDo;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Autonomous parallel thread test
 */
public class AutoThread extends Thread {
    DcMotor leftFront;
    DcMotor rightFront;
    DcMotor leftBack;
    DcMotor rightBack;
    HardwareMap hardwareMap;
    OpMode mode;

    boolean started = false;

    //Empty Constructor
    public AutoThread(HardwareMap h, OpMode mode) {
        hardwareMap = h;
        this.mode = mode;
    }

    public void update(HardwareMap h)
    {
        this.hardwareMap = h;
    }

    //Here is where the autonomous-mode linear sequence of events occurs
    @Override
    public void run() {
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");

        //see.write("");
    }
}
