package org.pixlaunch.arrays.reversearray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> solve(ArrayList<Integer> A, int B, int C) {
        int temp;
        int startIndex = B;
        int endIndex = C;
        while(endIndex>startIndex) {
            temp = A.get(startIndex);
            A.set(startIndex, A.get(endIndex));
            A.set(endIndex, temp);
            startIndex++;
            endIndex--;
        }
        return  A;
    }
}
