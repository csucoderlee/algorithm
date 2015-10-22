package ch01;

import java.util.Arrays;

/**
 * @purpose 二分查找
 * @author lixiang
 *
 */
public class BinarySearch {
	public static void main(String[] args){
		int[] a = {0,1,2,4,5,6};
		int key = 3;
		System.out.println(rank(key,a));
		System.out.println(key);
	}
	static int rank(int key, int[] a){
		Arrays.sort(a); //数组必须是有序的，保证二分的过程中前一段的所有数小于后一段的所有数
		int low = 0;
		int high = a.length-1;
		while(high>low){
			int mid = low + (high - low) / 2;
			if(key < a[mid]){
				high = mid - 1;
			}
			else if(key > a[mid]){
				low = mid + 1;
			}
			else
				return mid;
		}
		return -1;
	}
}
