package org.pixlaunch.arrays.sumOfElements;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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


        System.out.println("Enter value of Array B eg. [[0, 0], [1, 2]]: ");
        String valueOfB = myObj.next();  // Read user input

        //Convert user String input to Array
        ArrayList<Integer> arrayA = Arrays.stream(valueOfA.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Size of arrayA: "+ arrayA.size());

        ArrayList<ArrayList<Integer>> valueOfBasArray = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Convert string to ArrayList<ArrayList<Integer>>
            valueOfBasArray = objectMapper.readValue(valueOfB, new TypeReference<>() {});
            System.out.println(valueOfBasArray);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Solution solution = new Solution();
        System.out.println(solution.rangeSum(arrayA, valueOfBasArray));

    }
}
