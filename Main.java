package com.company;

public class Main {
    // main method
    public static void main(String[] args) {

        // creating UserInput object
        UserInput obj = new UserInput();

        // calling method to take input of distance and time
        obj.addDataSet();
        // calling method to calculate speed for the given distance and time
        obj.calculateSpeed(obj.list);

        // creating ShowResults object
        ShowResults res = new ShowResults();

        // calling method to create a csv file and store the distance, time and speed data in it
        res.writeCSV(obj.list);
    }

}
