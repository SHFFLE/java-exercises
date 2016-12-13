package aoc2016;

import java.util.ArrayList;

public class Bot {
    ArrayList<Integer> values = new ArrayList<>();

    int a = 0;
    int b = 0;
    int id;

    public int findLow() {
        int lowest = 9999;
        for(int i=0;i<values.size();i++) {
            if(values.get(i) < lowest)
                lowest = values.get(i);
        }
        if(values.indexOf(lowest) != -1) {
            values.remove(values.indexOf(lowest));
        }
        return lowest;
    }
    public int findHigh() {
        int highest = 0;
        for(int i=0;i<values.size();i++) {
            if(values.get(i) > highest)
                highest = values.get(i);
        }
        if(values.indexOf(highest) != -1) {
            values.remove(values.indexOf(highest));
        }
        return highest;
    }

    public void add(int i) {
        values.add(i);
    }

    Bot(int id){
        this.id = id;
    }
}
