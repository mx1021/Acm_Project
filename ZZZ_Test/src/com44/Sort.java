package com44;

import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

public class Sort
{
    boolean gogogo = true;

    @Test
    public void mxTest10时26分() {
        if (gogogo) {
            int[] selectS = {6, 5, 4, 3, 2, 1 };
            //selectSort(selectS);
            //buttonSort(selectS);
            quickSort(selectS, 0, selectS.length - 1);
            for (int i : selectS) {
                System.out.print(i);
            }
        }
        if (!gogogo) {
            //测试速度
            int[] arr = getIntArr();
            long begin = new Date().getTime();
            selectSort(arr);
            //buttonSort(arr);
            //quickSort(arr, 0, arr.length - 1);
            long end = new Date().getTime();
            System.out.println((end - begin));
        }
    }

    public int[] getIntArr() {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        return arr;

    }

    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) { //选出之后待排序中值最小的位置
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                arr[min] = arr[i] + arr[min];
                arr[i] = arr[min] - arr[i];
                arr[min] = arr[min] - arr[i];
            }
        }
    }

    public void buttonSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];

                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public void quickSort(int arr[], int low, int high) {
        if (arr == null || arr.length <= 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int left = low;
        int right = high;
        int temp = arr[left]; //挖坑1：保存基准的值

        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right]; //坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
            while (left < right && arr[left] <= temp) {
                left++;
            }
            arr[right] = arr[left]; //坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
        }
        arr[left] = temp; //基准值填补到坑3中，准备分治递归快排
        //System.out.println("Sorting: " + Arrays.toString(arr));
        quickSort(arr, low, left - 1);
        quickSort(arr, left + 1, high);
    }

}
