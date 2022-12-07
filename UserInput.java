package com.company;

import java.util.Scanner;

public class UserInput extends Measure {
    // array of DataSet datatype to store the input distance and time
    public DataSet list[] = new DataSet[10];

    public void addDataSet(){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            int idx = i+1;
            System.out.println("Enter Distance " + idx + " : ");
            float distance = sc.nextFloat();

            System.out.println("Enter Time " + idx + " : ");
            float time = sc.nextFloat();
            list[i] = new DataSet(distance, time);
        }

    }
}
