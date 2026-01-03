package org.example.hard;

public class RainWaterTrap {

    public int calculate(int[] array){

        // Edge case
        if (array == null || array.length < 3) return 0;

        int i=1, j= array.length-2;
        int waterStored = 0;
        int lmax = array[0];
        int rmax = array[array.length-1];
        while(i<=j){
            lmax = Math.max(lmax, array[i]);
            rmax = Math.max(rmax, array[j]);
            if(lmax<rmax){
                waterStored+=lmax-array[i];
                i++;
            }else{
                waterStored+=rmax-array[j];
                j--;
            }
        }
        return waterStored;
    }
}
