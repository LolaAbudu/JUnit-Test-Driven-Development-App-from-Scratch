package org.pursuit.junittest_drivendevelopmentappfromscratch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayMethodTesting {

    private static ArrayMethodTesting singleInstance;

    private ArrayMethodTesting() {
    }

    public static ArrayMethodTesting getSingleInstance() {
        if (singleInstance != null) {
            return singleInstance;
        }
        return singleInstance = new ArrayMethodTesting();
    }

    public boolean isLessThan10(String[] input) {
        if (input == null || input.length < 10) {
            return true;
        }
        return false;
    }

//   public String[] smallEvensOnly(String[] input){
//
////       if(input == null){
////            newOutput = {};
////       }
//       Arrays.sort(input);
//       String[] newOutput = new String[input[1]input.length-1];
//
//       if(input.length % 2 == 0){
//           for (int i = 0; i < newOutput.length; i++) {
//               newOutput[i] = input[i];
//           }
//       }
//       else{
//           newOutput = input;
//       }
//       return newOutput;
//   }

//    public String[] smallEvensOnly(String[] input){
//
////       if(input == null){
////            newOutput = {};
////       }
//       // Arrays.sort(input);
//        String[] newOutput = new String[input.length-1];
//         int k=0;
//        String max = input[0];
//        if(input.length % 2 == 0){
//            for (int i = 1; i < input.length; i++) {
//                if(max.length() < input[i].length()){
//                  newOutput[k]= input[i];
//                  k++;
//                }else {
//                    max=input[i];
//                }
//            }
//            return  newOutput;
//        } else{
//            return input;
//        }
//    }

    public String[] smallEvensOnly(String[] input) {
        if (input != null && input.length % 2 == 0) {
            String[] result = new String[input.length - 1];
            String maxStrLength = input[input.length - 1];
            int k = 0;
            for (int i = 0; i < input.length; i++) {
                if (maxStrLength.length() > input[i].length()) {
                    result[k] = (input[i]);
                    k++;
                } else {
                    maxStrLength = input[i];
                }
            }
            return result;
        }
        return input;
    }

    public char[] sortAlphabetically(char[] input) {
        try {
            Arrays.sort(input);
        } catch (NullPointerException npe) {
            System.out.println("Please add values");
        }
        return input;
    }

    public double returnSum(double[] input) {
        double sum = 0.0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum;
    }

    public Set removeCaseSensitiveDuplicates(String[] input) {
        if (input == null) {
            return null;
        }
        final HashSet<String> newSet = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            newSet.add(input[i].toLowerCase().trim());
        }
        return newSet;
    }

    public Map mapDuplicates(String[] input) {
        if (input == null) {
            return null;
        }

        final HashMap<String, Integer> newMap = new HashMap<>();
        for (String myString : input) {
            int counter = 0;
            for (String myString2 : input) {
                if (myString.equals(myString2)) {
                    counter++;
                }
                newMap.put(myString, counter);
            }
        }
        return newMap;
    }

    public Map mapDuplicates2(String[] input) {
        if (input == null) {
            return null;
        }

        final HashMap<String, Integer> newMap = new HashMap<>();
        for (String myString : input) {
            if (newMap.containsKey(myString)) {
                int count = newMap.get(myString.trim());
                newMap.put(myString, count + 1);
            } else {
                newMap.put(myString, 1);
            }
        }
        return newMap;
    }
}
