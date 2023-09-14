package ru.vpak.simpleint;

import java.util.ArrayList;
import java.util.List;

public class SimpleInt {
    final int topLimit;

    public SimpleInt(int topLimit) {
        this.topLimit = topLimit;
    }

    public int calc() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 2; i < this.topLimit; i++) {
            boolean b = true;
            for (Integer s : arr) {
                if(i % s == 0){
                    b = false;
                    break;
                }
            }
            if (b) arr.add(i);
        }
        if (arr.size() > 0)
            return arr.get(arr.size() - 1);
        return 1;
    }

    @Override
    public String toString() {
        return "SimpleInt{" +
                "topLimit=" + topLimit +
                '}';
    }
}
