/**
 * 
 */
package ch02;

/**
 * @author Administrator
 *
 */
public class test {

	public static void show(long []arr){
		System.out.print("arr=[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	//1第一种排序方式冒泡排序
	public static void BubbleSort1(long []arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
		
		
	}
	
	//2
	public static void  BubbleSort2(long[]arr){
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if (arr[j-1]>arr[j]) {
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
				}
			}
		}
		
	}
	
	//3
	public static void BubbleSort3(long []arr){
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
				}
			}
		}
	}
	
	//4
	public static void BubbleSort4(long[]arr){
		
		for (int i = 0; i < arr.length-1; i++) {
			//for (int j = arr.length-1; j >=1; j--) {
			for (int j = arr.length-1; j >0; j--) {
				if (arr[j-1]>arr[j]) {
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
				}
			}
		}
		
	}
	public static void BubbleSort(long[]arr){
		
		
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
	
	
	public static void SelectSort(long[]arr){
		for (int i = 0; i < arr.length; i++) {
			int k=i;
			for (int j = 0; j < arr.length; j++) {
				if (arr[k]<arr[j]) {
					arr[j]=arr[k]^arr[j];
					arr[k]=arr[k]^arr[j];
					arr[j]=arr[k]^arr[j];
				
				}
			}
		}
		
	}
	
	public static void InsertSort(long[]arr){
		
		for (int i = 1; i < arr.length; i++) {
			long tmp=arr[i];
			int j=i;
			while (j>0&&arr[j-1]>=tmp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=tmp;
		}
		
	}
	
	//希尔排序
	public static void ShellSort(long[]arr){
		
		int interval=0;
		while (interval<arr.length/3) {
			interval=3*interval+1;
		}
		while (interval>0) {
			for (int i = interval; i < arr.length; i++) {
				long tmp=arr[i];
				int j=i;
				while(j>interval-1&&arr[j-interval]>=tmp){
					
					arr[j]=arr[j-interval];
					j-=interval;
				}
				arr[j]=tmp;
			}
			interval=(interval-1)/3;
		}
	}
	
	/**
	 * 
	 * 得到要分组的关键下标，小于该下标的数值都小于key,反之大于下标的数值都大于key
	 * */
	public static int postion(long[]arr,int left,int right,long key){
		int leftPtr=left-1;
		int rightPtr=right;
		while(true){
			
			while(arr[++leftPtr]<key&&leftPtr<rightPtr);
			while(arr[--rightPtr]>key&&leftPtr<rightPtr);
			if (rightPtr<=leftPtr) {
				break;
			}else{
				
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
		if (arr.length<2) {
			return;
		}
		
		if (left>=right) {
			return;
		}
		long key=arr[right];
		int pos=postion(arr, left, right, key);
		QuickSort(arr, left, pos-1);
		QuickSort(arr, pos+1, right);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = { 0, 5, 4, 333, 91,-1,1,10,11,12, 9,8,7,6,3,2,1-99999, 67,  78, 87, 66, 41, -11119 };
        show(arr);
        //BubbleSort2(arr);
       // BubbleSort(arr);
       // SelectSort(arr);
       // InsertSort(arr);
       // ShellSort(arr);
       // ShellSort(arr);
       // show(arr);
        QuickSort(arr,0,arr.length-1);
        show(arr);

	}

}
