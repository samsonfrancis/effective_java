package com.sam.effective_java.synchronize_access_to_shared_mutable_data;

import java.util.concurrent.TimeUnit;

/**
 * when multiple threads share mutable data each thread that reads or writes the data must perform synchronization.
 */
public class DemoThreadSynchronizeAccess {
    /**
     * If you don't use the volatile keyword the thread does not stop after a second
     * so the volatile make sures that the thread reads the most recently updated value.
     */
//    private static volatile boolean stopThread;
    private static boolean stopThread;

    /**
     * Another alternative to using volatile is to create method for reading and writing the values and synchronize them.
     *
     * As shown below
     */

    /**
     * Note the synchronized keyword for reading
     *
     * @return boolean thread stop status
     */
    public static synchronized boolean isStopThread() {
        return stopThread;
    }

    /**
     * Note the synchronized keyword for writing
     *
     * @param stopThread stop thread?
     */
    public static synchronized void setStopThread(boolean stopThread) {
        DemoThreadSynchronizeAccess.stopThread = stopThread;
    }


    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!isStopThread()) {
                    i++;
                }
            }
        });
        
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        setStopThread(true);
    }
}
