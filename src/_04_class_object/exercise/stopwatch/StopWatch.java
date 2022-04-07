package _04_class_object.exercise.stopwatch;

import java.util.Calendar;

public class StopWatch {
    public double endTime;
    public double startTime;

    public double getEndTime() {

        return this.endTime;
    }

    public double getStartTime() {

        return this.startTime;
    }

    public void start() {
        this.startTime = Calendar.getInstance().getTimeInMillis();
    }

    public void end() {
        this.endTime = Calendar.getInstance().getTimeInMillis();
    }

    public double getElapsedTime() {
        return (this.endTime - this.startTime);
    }

    public StopWatch() {

    }


}
