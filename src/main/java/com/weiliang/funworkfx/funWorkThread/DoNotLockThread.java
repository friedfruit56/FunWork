package com.weiliang.funworkfx.funWorkThread;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DoNotLockThread implements Runnable{
    private long period = 1000*60*2;
    @Override
    public void run() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        while (true){
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            try {
                Thread.sleep(period);
            } catch (InterruptedException e) {
                System.out.println("Do Not Lock Thread Interrupt");
                break;
            }
        }
    }
}
