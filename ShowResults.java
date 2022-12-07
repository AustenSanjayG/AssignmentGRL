package com.company;

import java.io.File;
import java.io.PrintWriter;

public class ShowResults {
    // method to create a csv file and the store all the data distance, time and speed data in it
    public void writeCSV(DataSet list[]){
        try{
            PrintWriter pw = new PrintWriter(new File("output.csv"));
            StringBuilder sb = new StringBuilder();
            sb.append("DISTANCE  |  ");
            sb.append("TIME  |  ");
            sb.append("SPEED");
            sb.append("\n");

            for (int i = 0; i < 10; i++) {
                sb.append(Float.toString(list[i].getDistance()));
                sb.append("  |  ");
                sb.append(Float.toString(list[i].getTime()));
                sb.append("  |  ");
                sb.append(Float.toString(list[i].getSpeed()));
                sb.append("\n");
            }

            pw.write(sb.toString());
            pw.close();
            System.out.println("Data entered in csv file");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
