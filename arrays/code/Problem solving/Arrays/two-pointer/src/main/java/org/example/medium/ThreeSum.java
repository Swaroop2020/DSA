package org.example.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {


    public List<List<Integer>> calculate(int[] array, int k){

        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(array);

        for(int i=0;i<array.length-2;i++){
            int left = i+1;
            int right = array.length-1;
            while(left<right){
                int sum = array[i] + array[left] + array[right];
                if(sum==k){
                    set.add(Arrays.asList(array[i], array[left],array[right]));
                    left++;
                    right--;
                }else if(sum>k){
                    right--;
                } else{
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> betterCalculate(int[] array, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int sum = array[i] + array[left] + array[right];

                if (sum == target) {
                    result.add(List.of(array[i], array[left], array[right]));

                    // Skip duplicate left values
                    while (left < right && array[left] == array[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && array[right] == array[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
