package com.demo.sample;

public class Average {
    public double average(int k, int[] list){

        if(list.length <= 0 || k<0)
        return 0;

        if(k >=100 && list.length>=100) {
            return 0;
        }
        double average = 0;
        int n = Math.min(k, list.length);
        if( n > 0) {
            for (int i = 0 ; i < n; i++) {

                 average += list[i];
            }

            average = average/n;
        }
        return average;
    }
}
