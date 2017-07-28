
package ch01;

/**
 * @author Administrator
 *
 */


/**
 * 
 * self invoke
 * */
public class Recursion1 {

	
	public static void test(){
		
		
		System.out.println("Hello,World");
		test();
		
	}
	
	
	private static void test2(int n) {
		// TODO Auto-generated method stub
		if (n==0) {
			return;
		}
		System.out.println(n);
		test2(n-1);
	}


	public static void test3(long []arr){
		long temp;
		for (int i = 0; i <arr.length-1; i++) {
			for (int j = arr.length-1; j >i; j--) {
				if (arr[j]<arr[j-1]) {
					
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
		}
		
	}
	public static void BubbleSort(long[]arr){
		if (arr.length<2) return;
		long temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >i; j--) {
				if (arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
	}
	
	public static void show(long[]arr){
		
		System.out.print("arr=[");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		
	}
	
	public static void SelectSort(long[]arr){
		if (arr.length<2) return;
		long temp=0;
		int k;
		for (int i = 0; i < arr.length-1; i++) {
			k=i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j]<arr[k]) {
					k=j;
				}
				
			}
			
			//k is min value
			temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		
	}
	
	public static void InsertSort(long []arr){
		if (arr.length<2) return;
		long temp=0;
		for (int i = 1; i < arr.length; i++) {
			temp=arr[i];
			int j=i;
			while(j>0&&arr[j-1]>=temp){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		
	}
	
	/**
	 * 
	 * 设置分区key,不以数组最右端为分界点 
	 * */
	public static void partition1(long []arr,int left,int right,long key){
		
		if (arr.length<2) {
			return ;
		}
		int leftPtr=left-1;
		int rightPtr=right+1;
		long tmp=0;
		while (true) {
			while (leftPtr<rightPtr&&arr[++leftPtr]<key) ;
			while (leftPtr<rightPtr&&arr[--rightPtr]<key) ;
			if (leftPtr>rightPtr) {
				return ;
			}else{
				
				tmp=arr[leftPtr];
				arr[leftPtr]=arr[rightPtr];
				arr[rightPtr]=tmp;
				
			}
		}
		//return leftPtr;
	}
	
	/**
	 * 
	 * 设置分区key,以数组最右端为分界点 
	 * */
	public static int partition(long []arr,int left,int right,long key){
		
		if (arr.length<2) {
			return -1;
		}
		int leftPtr=left-1;
		int rightPtr=right;
		long tmp=0;
		while (true) {
			while (leftPtr<rightPtr&&arr[++leftPtr]<key) ;
			while (leftPtr<rightPtr&&arr[--rightPtr]>key) ;
			if (leftPtr>=rightPtr) {
				break;
			}else{
				
				tmp=arr[leftPtr];
				arr[leftPtr]=arr[rightPtr];
				arr[rightPtr]=tmp;
				
			}
		}
		
		tmp=arr[leftPtr];
		arr[leftPtr]=arr[right];
		arr[right]=tmp;
		
		return leftPtr;
	}
	
	
	//快速排序
	public static void QuickSort(long []arr,int left,int right){
		
		if (left>=right) {
			return;
		}else{
			//获得切入点数据
			
			long key=arr[right];
			//获得 切入点的同时对数组进行划分
			int partition=partition(arr, left, right,key );
			//分别对左右两边的子数组进行递归排序
			QuickSort(arr, left, partition-1);
			QuickSort(arr, partition+1, right);
			
		}
		
		//show(arr);
		//show(arr);
		
		
		
	}
	
	//希尔排序
	public static void ShellSort(long []arr){
		//计算间隔
		int h = 1;
		while(h<arr.length/3)h=h*3+1;
		
		//减少间隔
		while(h>0){
			long tmp;
			for (int i = h; i < arr.length; i++) {
				tmp=arr[i];
				int j=i;
				while (j>h-1&&arr[j-h]>=tmp) {
					arr[j]=arr[j-h];
					j-=h;
				}
				//逐步移位，直到j指针指向的元素为最小为止
				arr[j]=tmp;
			}
			h=(h-1)/3;
		}
		
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long[]arr={0,5,4,333,91,-99999,67,2,78,87,66,41,-11119};
		show(arr);
		//BubbleSort(arr);
		//SelectSort(arr);
		//InsertSort(arr);
		//ShellSort(arr);
		QuickSort(arr,0,arr.length-1);
		show(arr);
		
		
		
	}

}
