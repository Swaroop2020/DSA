package org.example.hard;

public class RainWaterTrapped {


    public int calculate2(int[] array){
        int n = array.length;
        if(array==null || n<3){
            return 0;
        }
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = array[0];
        rmax[n-1] = array[n-1];
        for(int i=1;i<array.length;i++){
            lmax[i] = Math.max(lmax[i-1], array[i]);
        }

        for(int i = n-2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1],array[i]);
        }

        int result = 0;
        for(int i=0;i<n;i++){
            result+=Math.min(lmax[i],rmax[i])-array[i];
        }
        return result;
    }

    public int calculate(int[] array){

        if(array==null || array.length<3){
            return 0;
        }
        int lmax = array[0];
        int rmax = array[array.length-1];
        int l=1, r=array.length-2;
        int waterStored = 0;
        while(l<=r){
            lmax  = Math.max(lmax, array[l]);
            rmax = Math.max(rmax, array[r]);

            if(lmax<rmax){
                waterStored+=lmax-array[l];
                l++;
            }else{
                waterStored+=rmax-array[r];
                r--;
            }
        }
        return waterStored;

    }
}
