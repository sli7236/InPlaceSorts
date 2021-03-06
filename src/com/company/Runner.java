package com.company;
import com.company.InPlaceSorts;

public class Runner {

    public static void main(String[] args) {
        int[] randIntArr = randomIntArr(100);
        String stringArr = "";
        for (int i = 0; i < randIntArr.length; i++)
        {
            stringArr = stringArr + randIntArr[i] + " ";
        }
        System.out.println("Random Integer Array: " + stringArr);

        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(randIntArr);
        time = System.nanoTime() - time;
        System.out.println();
        System.out.print("Bubble Sort: ");
        for (int i = 0; i < randIntArr.length; i++)
        {
            System.out.print(randIntArr[i] + " ");
        }
        System.out.println();
        System.out.println("Bubble Sort Time Taken: " + time + " nanoseconds");

        time = System.nanoTime();
        InPlaceSorts.selectionSort(randIntArr);
        time = System.nanoTime() - time;
        System.out.println();
        System.out.print("Selection Sort: ");
        for (int i = 0; i < randIntArr.length; i++)
        {
            System.out.print(randIntArr[i] + " ");
        }
        System.out.println();
        System.out.println("Selection Sort Time Taken: " + time + " nanoseconds");

        time = System.nanoTime();
        InPlaceSorts.insertionSort(randIntArr);
        time = System.nanoTime() - time;
        System.out.println();
        System.out.print("Insertion Sort: ");
        for (int i = 0; i < randIntArr.length; i++)
        {
            System.out.print(randIntArr[i] + " ");
        }
        System.out.println();
        System.out.println("Insertion Sort Time Taken: " + time + " nanoseconds");

        time = System.nanoTime();
        InPlaceSorts.quickSort(randIntArr, 0, randIntArr.length - 1);
        time = System.nanoTime() - time;
        System.out.println();
        System.out.print("Quick Sort: ");
        for (int i = 0; i < randIntArr.length; i++)
        {
            System.out.print(randIntArr[i] + " ");
        }
        System.out.println();
        System.out.println("Quick Sort Time Taken: " + time + " nanoseconds");
    }

    public static int[] randomIntArr(int num)
    {
        int [] arr = new int [num];
        for (int i = 0; i < num; i++)
        {
            int rand = (int)((Math.random() * 1000) );
            arr[i] = rand;
        }
        return arr;
    }


}
