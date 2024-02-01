package com.weiliang.funworkfx.funWorkThread;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class IWantToSleepThread implements Runnable{
    private long period = 1000*60*2;
    @Override
    public void run() {
        Robot robot = null;
        Random random = new Random();
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        while (true){
            try {
                Thread.sleep(2000);
                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_ALT);
                Thread.sleep(1000);
                robot.mouseWheel(3* random.nextInt(1,3));
                Thread.sleep(period);
            } catch (InterruptedException e) {
                System.out.println("Do Not Lock Thread Interrupt");
                break;
            }
        }
    }
}











































