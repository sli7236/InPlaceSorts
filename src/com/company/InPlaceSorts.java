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
        System.out.println();
        System.out.print("Bubble Sort: ");
        for (int i = 0; i < list1.length; i++)
        {
            System.out.print(list1[i] + " ");
        }
        System.out.println();
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
                }
                swap(list1, minIndex, pos);
            }
        }
        System.out.println();
        System.out.print("Selection Sort: ");
        for (int i = 0; i < list1.length; i++)
        {
            System.out.print(list1[i] + " ");
        }
        System.out.println();
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
        System.out.println();
        System.out.print("Insertion Sort: ");
        for (int i = 0; i < list1.length; i++)
        {
            System.out.print(list1[i] + " ");
        }
        System.out.println();
    }
}
