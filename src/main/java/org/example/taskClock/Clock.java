package org.example.taskClock;

public class Clock implements Readable{
    private int hour;
    private int minutes;
    private int seconds;

    @Override
    public void readTime(){
        System.out.println(getHour() + ":" + getMinutes() + ":" + getSeconds());
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick(){
        int tick = getSeconds() + 1;
        System.out.println(getHour() + ":" + getMinutes() + ":" + tick);
    }
}
