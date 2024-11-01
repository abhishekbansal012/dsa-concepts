package org.pixlaunch.arrays.prefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Read values from user
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of Array A comma separated: ");
        String valueOfA = myObj.next();  // Read user input

        //Convert user String input to Array
        ArrayList<Integer> arrayA = Arrays.stream(valueOfA.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Size of arrayA: "+ arrayA.size());


        Solution solution = new Solution();
        System.out.println(solution.subarraySum(arrayA));

    }
}
