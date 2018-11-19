package com.company;
import com.company.InPlaceSorts;

public class Runner {

    public static void main(String[] args) {
        int[] randIntArr = randomIntArr(10);
        String stringArr = "";
        for (int i = 0; i < randIntArr.length; i++)
        {
            stringArr = stringArr + randIntArr[i] + ", ";
        }
        System.out.println(stringArr);

        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(randIntArr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken: " + time);

        time = System.nanoTime();
        InPlaceSorts.selectionSort(randIntArr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken: " + time);

        time = System.nanoTime();
        InPlaceSorts.insertionSort(randIntArr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken: " + time);
    }

    public static int[] randomIntArr(int num)
    {
        int [] arr = new int [num];
        for (int i = 0; i < num; i++)
        {
            int rand = (int)((Math.random() * 26) + 97);
            arr[i] = rand;
        }
        return arr;
    }


}
