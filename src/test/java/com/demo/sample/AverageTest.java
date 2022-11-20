package com.demo.sample;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AverageTest {

    @Test
    public void Test1() {
        Average calculate = new Average();

        int list [] = {1,3,5,7,9,10};
        int k = 3;
        double ans = calculate.average(k,list);

        assertEquals(3, ans);
    }

    @Test
    public void Test2() {

        Average calculate = new Average();
        int list [] = {1,3,5,7,9,10};
        int k = -1;
        double ans = calculate.average(k,list);

        assertEquals(0, ans);
    }


    @Test
    public void Test3() {

        Average calculate = new Average();
        int list [] = {};
        int k = -1;
        double ans = calculate.average(k,list);

        assertEquals(0,ans);
    }

    @Test
    public void Test4() {
        Average calculate = new Average();
        int list [] = {1,3,5,7,9,10};
        int k = 0;

        double ans = calculate.average(k,list);
        assertEquals(0, ans);
    }

    @Test
    public void Test5() {

        Average calculate = new Average();
        int []list = {1,3,5,7,9,10};

        double ans = calculate.average(99, list);
        ans = (double)Math.round(ans*100)/100;
        assertEquals(5.83, ans);

    }

    @Test

    public void Test6() {

        Average calculate = new Average();
        int []list = {};

        double ans = calculate.average(99, list);
        assertEquals(0, ans);


    }

    @Test
    public void Test7() {

        Average calculate = new Average();

        int[] list = new int[110];
        for(int i=0;i < list.length;i++) {
            list[i] = i;
        }
        int k=100;

        double ans = calculate.average(k, list);
        assertEquals(0,ans);


    }

    @Test
    public void Test8() {
        Average calculate = new Average();

        int[] list = {1,3,5,7,9,10};
        int k=100;

        double ans = calculate.average(k, list);
        ans = (double)Math.round(ans*100)/100;
        assertEquals(5.83,ans);

    }

    @Test
    public void Test9() {

        Average calculate = new Average();

        int[] list = {1,3,5,5,7,9,10};

        int k = 4;
        double ans = calculate.average(k, list);
        assertEquals(3.5, ans);
    }


}
