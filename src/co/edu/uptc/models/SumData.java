package co.edu.uptc.models;

import java.util.ArrayList;

public class SumData {

    private DoubleList doubleList;
    private ArrayList<Integer> myArrayList;

    public SumData(){
        doubleList = new DoubleList();
        myArrayList = new ArrayList<>();
    }

    public void addData(int numData){
        for (int i = 0; i < numData; i++) {
            doubleList.add((int)(Math.random() * (9 - 0 + 1))+0);
            myArrayList.add((int)(Math.random() * (9 - 0 + 1))+0);
        }
    } 

    public int sumDataDouble(){
        int total = 0;
        return total;
    }

    public int sumDataArray(){
        int total= 0;
        for (Integer array : myArrayList) {
            total += array;
        }
        return total;
    }
}
