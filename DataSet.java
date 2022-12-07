package com.company;

public class DataSet {
    private float distance;
    private float time;
    private float speed;

    public DataSet(float distance, float time){
        this.distance = distance;
        this.time = time;
        this.speed = 0;
    }

    public float getDistance() {
        return this.distance;
    }

    public float getTime() {
        return this.time;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
