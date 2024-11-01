package org.pixlaunch.arrays.rotatearray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solve(ArrayList<Integer> A, int B) {
        int rotateTimes;

        if(A.size() < B) {
            rotateTimes = B % A.size();
        }else {
            rotateTimes = B;
        }

        reverseArrayIndexRanged(A,0, A.size()-1); //Reverse Entire Array
        reverseArrayIndexRanged(A,0, rotateTimes-1); //Reverse First half
        reverseArrayIndexRanged(A, rotateTimes, A.size()-1); //Reverse Second Half
        return  A;
    }

    private void reverseArrayIndexRanged(ArrayList<Integer> A, int startIndex, int endIndex) {
        int temp;
        while(endIndex>startIndex) {
            temp = A.get(startIndex);
            A.set(startIndex, A.get(endIndex));
            A.set(endIndex, temp);
            startIndex++;
            endIndex--;
        }
    }
}