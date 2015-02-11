package com.roman;

/**
 * Created by romanwendelboe on 9/10/14.
 */
public class Sleep {
    private boolean goToSleep;
    private int wakeUp;
    private String sleepIn;

    public Sleep() {
       goToSleep = false;
       wakeUp = 0;
       sleepIn = "Not Yet";
    }

    public Sleep(boolean goToSleep, int wakeUp, String sleepIn) {
        this.goToSleep = goToSleep;
        this.wakeUp = wakeUp;
        this.sleepIn = sleepIn;
    }

    public Boolean getGoToSleep() {
        return goToSleep;
    }

    public void setGoToSleep(Boolean goToSleep) {
        this.goToSleep = goToSleep;
    }

    public int getWakeUp() {
        return wakeUp;
    }

    public void setWakeUp(int wakeUp) {
        this.wakeUp = wakeUp;
    }

    public String getSleepIn() {
        return getSleepIn();
    }

    public void setSleepIn(String sleepIn) {
        this.sleepIn = sleepIn;
    }
    public void inClass(boolean goToSleep){
        this.goToSleep = true;
    }
    public void onMondays(String sleepIn){
        this.sleepIn = "Nobody wants to be here anyway. So lets get an early start on the weekend. ";
    }
}
