package com.company;

public class InPlaceSorts {
    public String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static void swap(int[] list1, int i, int j)
    {
        int temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    public static void swapDouble(double[] list1, int i, int j)
    {
        double temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    public static void bubbleSwap(int[] list1)
    {
        for (int i = 0; i < list1.length; i++)
        {
            for (int j = 0; j < list1.length -1; j++)
            {
                if (list1[j] > list1[j+1])
                {
                    swap(list1, j, j+1);
                }
            }
        }
    }

    public static void selectionSort(double[] list1)
    {
        int pos = 0;
        double currentMin = 0;
        for (int i = 0; i < list1.length; i++)
        {
            pos = i;
            currentMin = list1[i];
            for (int x = i+1; x < list1.length; x++)
            {
                if (list1[x] < currentMin)
                {
                    currentMin = x;
                }
                swapDouble(list1, (int)currentMin, pos);
            }
        }
    }

    public static void insertionSort(int[] list1)
    {
        for (int i = 0; i < list1.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (list1[j-1] > list1[j])
                {
                    swap(list1, j, j-1);
                }
                else
                {
                    j = 0;
                }
            }
        }
    }
}
