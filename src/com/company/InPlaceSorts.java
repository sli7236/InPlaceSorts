package com.company;

public class InPlaceSorts {
    public static void swap(int[] list1, int i, int j)
    {
        int temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    public static void bubbleSort(int[] list1)
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

    public static void selectionSort(int[] list1)
    {
        int pos = 0;
        int minIndex = 0;
        for (int i = 0; i < list1.length; i++)
        {
            pos = i;
            int currentMin = list1[i];
            for (int x = i+1; x < list1.length; x++)
            {
                if (list1[x] < currentMin)
                {
                    minIndex = x;
                    swap(list1, minIndex, pos);
                }

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

    public static void quickSort(int[] list1, int left, int right)
    {
        if (left < right)
        {
            int pivot = Partition(list1, left, right);

            quickSort(list1, left, pivot -1);
            quickSort(list1, pivot+1, right);
        }

    }

    public static int Partition(int[] list1, int left, int right)
    {
        int pivot = list1[right];
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (list1[j] <= pivot) {
                i++;
                int temp = list1[i];
                list1[i] = list1[j];
                list1[j] = temp;
            }
        }
        int temp = list1[i + 1];
        list1[i + 1] = list1[right];
        list1[right] = temp;
        return i + 1;
    }
}
