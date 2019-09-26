package com.epoint;

import java.util.List;

import org.junit.Test;

/**最小绝对差
 * 
 * @author Administrator
 *给你个整数数组 arr，其中每个元素都 不相同。

请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。	

输入：arr = [4,2,1,3]
输出：[[1,2],[2,3],[3,4]]

输入：arr = [1,3,6,10,15]
输出：[[1,3]]
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
 */
public class T5197_minimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
	//先快速排序
	quickSort(arr, 0, arr.length - 1);
	for (int i : arr) {
	    System.out.println(i);
	}

	return null;

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

    @Test
    public void mxTest11时36分() {

    }
}
