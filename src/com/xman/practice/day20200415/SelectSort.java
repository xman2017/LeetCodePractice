package com.xman.practice.day20200415;

/**
 * @Author: xman
 * @CreateDate: 2020/4/15 17:30
 * @Description: 排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] ints = {1, 2, 54, 2, 3, 44, 22};
//        selectSort(ints);
//        insetSort(ints);
        quickSort(ints, 0, ints.length - 1);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }


    /**
     * 选择排序
     *
     * @param arrays
     */
    public static void selectSort(int[] arrays) {

        for (int i = 0; i < arrays.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrays.length; j++) {
                minIndex = arrays[minIndex] < arrays[j] ? minIndex : j;
            }
            int temp = arrays[i];
            arrays[i] = arrays[minIndex];
            arrays[minIndex] = temp;
        }
    }

    /**
     * 插入排序
     *
     * @param arrays
     */
    public static void insetSort(int[] arrays) {
        for (int i = 1; i < arrays.length; i++) {
            int j = i - 1;
            int insetVal = arrays[i];
            for (; j >= 0 && arrays[j] > insetVal; j--) {
                arrays[j + 1] = arrays[j];
            }
            arrays[j + 1] = insetVal;
        }
    }


    /**
     * 快速排序
     * @param arrays
     * @param startIndex
     * @param endIndex
     */
    public static void quickSort(int[] arrays, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        int pivot = generatePivot(arrays, startIndex, endIndex);
        quickSort(arrays, startIndex, pivot - 1);
        quickSort(arrays, pivot + 1, endIndex);
    }

    private static int generatePivot(int[] arrays, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;
        int pivot = arrays[left];
        while (left != right) {
            while (left < right && arrays[right] >= pivot) {
                right--;
            }
            while (left < right && arrays[left] <= pivot) {
                left++;
            }
            if (left < right) {
                int temp = arrays[left];
                arrays[left] = arrays[right];
                arrays[right] = temp;
            }
        }

        int temp = arrays[left];
        arrays[left] = arrays[startIndex];
        arrays[startIndex] = temp;

        return left;
    }

}
