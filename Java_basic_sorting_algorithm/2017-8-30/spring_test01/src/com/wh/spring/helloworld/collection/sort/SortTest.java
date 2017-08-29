/**
 * 
 */
package com.wh.spring.helloworld.collection.sort;

/**
 * @author Administrator
 *
 */
public class SortTest {

	/**
	 * 
	 * 第一种排序算法：冒泡排序
	 * */
	public static void BubbleSort1(long[]arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if (arr[j]<arr[j-1]) {
					arr[j]=arr[j]^arr[j-1];
					arr[j-1]=arr[j]^arr[j-1];
					arr[j]=arr[j]^arr[j-1];
				}
			}
		}
		
	}
	
	/**
	 * 
	 * 第二种冒泡排序算法：
	 * */
	public static void BubbleSort2(long[]arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				//System.out.println();
				if (arr[j]>arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
	}
	
	
	/**
	 * 
	 * 冒泡排序算法第三种：
	 * */
	public static void BubbleSort3(long[]arr){
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j-1]>arr[j]) {
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
				}
			}
		}
		
	}
	
	/**
	 * 
	 * 排序算法第四种算法：
	 * */
	public static void BubbleSort4(long[]arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >i; j--) {
				if (arr[j-1]>arr[j]) {
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
					
				}
			}
		}
		
		
	}
	
	
	/**
	 * 
	 * 第五种排序算法：冒泡排序
	 * */
	public static void BubbleSort5(long[]arr){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >0; j--) {
				if (arr[j-1]>arr[j]) {
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
					
				}
			}
		}
		
	}
	

	/**
	 * 
	 * 第六种排序算法：冒泡排序
	 * */
	public static void BubbleSort6(long[]arr){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >=1; j--) {
				if (arr[j-1]>arr[j]) {
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
					
				}
			}
		}
		
	}
	
	
	/**
	 * 
	 * 插入排序
	 * */
	public static void InsertSort(long[]arr){
		
		for (int i = 0; i < arr.length; i++) {
			int j=i;
			long tmp=arr[i];
			while (j>0&&arr[j-1]>=tmp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=tmp;
		}
	}
	
	/*
	 * 希尔排序 
	 * */
	
	public static void ShellSort(long[]arr){
		
		if (arr.length<2) {
			return;
		}
		int interval=0;
		while (interval<arr.length/3) {
			interval=3*interval+1;
		}
		while (interval>0) {
			for (int i = interval; i < arr.length; i++) {
				long tmp=arr[i];
				int j=i;
				while (j>interval-1&&arr[j-interval]>=tmp) {
					arr[j]=arr[j-interval];
					j-=interval;
				}
				arr[j]=tmp;
			}
			interval=(interval-1)/3;
		}
	}
	
	
	/**
	 * 插入排序
	 * */
	public static void SelectSort(long[]arr){
		long tmp;
		//for (int i = 0; i < arr.length; i++) {//两种写法一样
			for (int i = 1; i < arr.length; i++) {
			int k=i;
			for (int j = 0; j < arr.length; j++) {
				if(arr[k]<arr[j]){
					arr[k]=arr[k]^arr[j];
					arr[j]=arr[k]^arr[j];
					arr[k]=arr[k]^arr[j];
				}
				
			}
		}
		
	}
	
	
	/**
	 * 
	 * 快速排序：获得 插入点位置下标
	 * 
	 * */
	
	public static int postion(long[]arr,int left,int right,long key){
		int leftPtr=left-1;
		int rightPtr=right;
		while (true) {
			while (leftPtr<rightPtr && arr[++leftPtr]<key) ;
			while (leftPtr<rightPtr && arr[--rightPtr]>key) ;
			if (rightPtr<=leftPtr) //{
				break;
			//}else{//注意，这个else不能丢
			else{

				arr[leftPtr]=arr[leftPtr]^arr[rightPtr];
				arr[rightPtr]=arr[leftPtr]^arr[rightPtr];
				arr[leftPtr]=arr[leftPtr]^arr[rightPtr];
			}
		}
		
		arr[leftPtr]=arr[leftPtr]^arr[right];
		arr[right]=arr[leftPtr]^arr[right];
		arr[leftPtr]=arr[leftPtr]^arr[right];
		
		return leftPtr;
	}
	
	public static void QuickSort(long []arr,int left,int right){
		
//		if (arr.length<2) {
//			return;
//		}
		if (left>=right) 
			return;

			
			
			long key=arr[right];
			int pos=postion(arr, left, right, key);
			QuickSort(arr, left, pos-1);
			QuickSort(arr, pos+1, right);
	
		
		
		
	}
	
	public static void show(long[]arr){
		System.out.print("arr=[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[]arr={-11113,-9998,-2,-3,0,1,4,2,3,5,7,6,10,9,8,12,11,220,334,23};
		show(arr);
		//BubbleSort6(arr);
		//SelectSort(arr);
		//InsertSort(arr);
		//ShellSort(arr);
		//QuickSort(arr, 0, arr.length-1);
		show(arr);

	}

}
