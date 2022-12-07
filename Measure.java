package com.company;

public class Measure {
    // method to calculate the speed for given distance and time
    public void calculateSpeed(DataSet list[]){

        for(int i=0; i<10; i++){
            list[i].setSpeed(list[i].getDistance() / list[i].getTime());
        }
    }
}
