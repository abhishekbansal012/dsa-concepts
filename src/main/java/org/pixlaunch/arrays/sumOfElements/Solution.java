package org.pixlaunch.arrays.sumOfElements;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        long[] p_sum = new long[A.size()];
        ArrayList<Long> rangeSumArr = new ArrayList<>();
        p_sum[0] = A.get(0);
        for(int i=1;i<A.size();i++){
            p_sum[i] = p_sum[i-1]+A.get(i);
        }

        for(int i = 0;i<B.size();i++){
            int l = B.get(i).get(0);
            int r = B.get(i).get(1);
            if(l==0){
                rangeSumArr.set(i,p_sum[r]);
            }
            else rangeSumArr.set(i, (p_sum[r] - p_sum[l-1]));
        }
        return rangeSumArr;
    }
}

