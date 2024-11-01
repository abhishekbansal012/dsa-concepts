package org.pixlaunch.arrays.prefixSum;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> subarraySum(ArrayList<Integer> A) {

        return calculatePrefixSum(A);
    }

    private ArrayList<Integer> calculatePrefixSum(ArrayList<Integer> A) {

        int sum = 0;
        for(int i=0; i<A.size(); i++ ){
            sum=sum+A.get(i);
            A.set(i, sum);
        }
        return A;
    }
}
