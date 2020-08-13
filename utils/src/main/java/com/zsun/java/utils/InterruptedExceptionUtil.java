package com.zsun.java.utils;

import sun.misc.Signal;
import sun.misc.SignalHandler;

/**
 * @author : zsun
 * @date : 2020/08/07 13:58
 */
public class InterruptedExceptionUtil implements SignalHandler {
    private SignalHandler oldHandler;

    @Override
    public void handle(Signal signal) {
        System.out.println("Signal handler called for signal " + signal);
        try {
            signalAction(signal);
            // Chain back to previous handler, if one exists
            if (oldHandler != SIG_DFL && oldHandler != SIG_IGN) {
                oldHandler.handle(signal);
            }
        } catch (Exception e) {
            System.out.println("handle|Signal handler"
                + "failed, reason " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void signalAction(Signal signal) {
        System.out.println("Handling " + signal.getName());
        System.out.println("Just sleep for 5 seconds.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: "
                + e.getMessage());
        }
    }

    private static SignalHandler install(String signalName) {
        Signal diagSignal = new Signal(signalName);
        InterruptedExceptionUtil instance = new InterruptedExceptionUtil();
        instance.oldHandler = Signal.handle(diagSignal, instance);
        return instance;
    }

    public static void main(String[] args) {
        //kill命令
        InterruptedExceptionUtil.install("TERM");
        //ctrl+c命令
        InterruptedExceptionUtil.install("INT");

        System.out.println("Signal handling example.");
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }
    }
}
