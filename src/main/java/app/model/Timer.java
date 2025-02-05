package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    private final long time;

    public Timer() {
        this.time = System.currentTimeMillis();
    }

    public long getTime() {
        return time;
    }
}