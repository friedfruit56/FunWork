package com.weiliang.funworkfx;

import com.weiliang.funworkfx.funWorkThread.DoNotLockThread;
import com.weiliang.funworkfx.funWorkThread.IWantToSleepThread;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class FunWorkController {
    @FXML
    private Label doNotLock;
    @FXML
    private Label iWantToSleep;
    @FXML
    private ToggleButton doNotLockTB;
    @FXML
    private ToggleButton iWantToSleepTB;

    private Robot robot = new Robot();

    public FunWorkController() throws AWTException {
    }

    private Thread doNotLockThread = null;
    private Thread iWantToSleepThread = null;

    @FXML
    protected void doNotLockOn() throws InterruptedException, AWTException {
        if(doNotLockTB.isSelected()){
            doNotLock.setText("运行中");
            doNotLockThread = new Thread(new DoNotLockThread());
            doNotLockThread.start();
        }else{
            doNotLock.setText("");
            doNotLockThread.interrupt();
        }
    }

    @FXML
    protected void iWantToSleepOn() {
        if(iWantToSleepTB.isSelected()){
            iWantToSleep.setText("运行中");
            iWantToSleepThread = new Thread(new IWantToSleepThread());
            iWantToSleepThread.start();
        }else{
            iWantToSleep.setText("");
            iWantToSleepThread.interrupt();
        }
    }

}