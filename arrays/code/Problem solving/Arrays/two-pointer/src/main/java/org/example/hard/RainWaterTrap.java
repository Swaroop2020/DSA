package org.example.hard;

public class RainWaterTrap {

    public int calculate(int[] array){

        // Edge case
        if (array == null || array.length < 3) return 0;

        int lmax = array[0];
        int rmax = array[array.length-1];
        int l=1, r=array.length-2;
        int waterStored = 0;
        while(l<r){

            lmax = Math.max(array[l],lmax);
            rmax = Math.max(array[r],rmax);
            if(lmax<rmax){
                waterStored+=lmax - array[l];
                l++;
            }else{
                waterStored+=rmax- array[r];
                r--;
            }

        }
        return waterStored;
    }
}
