package com.example.codecompanion;

import java.util.List;

public class Previous_Sets {
    private String name;
   // private List<String> codes;
    //private List<Integer> points;
    private long time;
    private long duration;

    private String codes;
    private int points;


    public Previous_Sets(String name, String codes, int points, long time, long duration) {
        this.name = name;
        this.codes = codes;
        this.points = points;
        this.time = time;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
