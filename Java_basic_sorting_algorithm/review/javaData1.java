/**
 * 
 */
package ch02;

/**
 * @author Administrator
 *sorting algorithm
 */
public class javaData1 {

//	public static void swap(Long a,Long b){
//		long tmp;
//		tmp=a;
//		a=b;
//		b=tmp;
//	}
	public static void show(long []arr){
		System.out.print("arr=[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	/**
	 * 
	 * 冒泡排序的第一种写法
	 * */
	public static void BubbleSort(long []arr){
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				
				if (arr[j-1]>arr[j]) {
					//swap(arr[j-1], arr[j]);
					//Swap swap=new Swap(arr[j-1], arr[j]);
					//Swap.swap(arr[j-1], arr[j]);
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
					
					//swap.swap(arr[j-1], arr[j]);
					
				}
			}
		}
		
	}
	
	/**
	 * 
	 * 冒泡排序的第二种写法
	 * */
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
	 /**
	  * 
	  * 冒泡排序的第三种写法
	  * */
	 
	public static void BubbleSort2(long[]arr){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >0; j--) {
				if (arr[j-1]>arr[j]) {
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
				}
			}
		}
		
	}
	
	/**
	 * 冒泡排序的第四种写法
	 * */
	public static void BubbleSort3(long []arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >=1; j--) {
				if (arr[j-1]>arr[j]) {
					arr[j-1]=arr[j-1]^arr[j];
					arr[j]=arr[j-1]^arr[j];
					arr[j-1]=arr[j-1]^arr[j];
				}
			}
		}
		
	}
	
	/**
	 * 
	 * 冒泡排序的第五种写法
	 * 
	 * 这种写法的思想是： 第一个元素和后面的所有元素比较，
	 * 内层循环一轮结束，就可以将最大的数放到最后；接下来
	 * 是执行第二次内层的循环，将已经排序之后的数组（已经排列
	 * 好最大的数字）的第二大的数字放到倒数第二位；
	 * 接下来是依次将大数放到后面。
	 * */
	public static void BubbleSort4(long[]arr){
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		
	}
	
	/**
	 * 
	 * 冒泡排序的第六种写法
	 * 这种写法的思想是：从数组的最后一个元素进行和之前所有的元素
	 * 进行比较，只一次内层的循环，将最小的数字放到第一位；接下来
	 * 是执行第二次的内层循环，将第二小的的放到第二位，依次将数组
	 * 从小到大排列。 
	 * */
	
	public static void BubbleSort5(long[]arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j >i; j--) {
				if (arr[i]>arr[j]) {
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		
	}
	/**
	 * 
	 * 选择排序
	 * */
	public static void SelectSort(long[]arr){
		if (arr.length<2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			int k=i;
			long tmp;
			//long tmp=arr[i]
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[k]){
					arr[j]=arr[j]^arr[k];
					arr[k]=arr[j]^arr[k];
					arr[j]=arr[j]^arr[k];
//					tmp=arr[k];
//					arr[k]=arr[j];
//					arr[j]=tmp;
				}
				
			}
//			arr[i]=arr[i]^arr[k];
//			arr[k]=arr[i]^arr[k];
//			arr[i]=arr[i]^arr[k];
			
			
		}
	}
	 /// 插入排序，步长为1的希尔排序，效率一般，可以使用希尔排序改进
	public static void InsertSort(long []arr){
		
		if (arr.length<2) {
			return;
		}
		long tmp;
		for (int i = 1; i < arr.length; i++) {
			int j=i;
			tmp=arr[i];
			while (j>0&&arr[j-1]>=tmp) {
				
					arr[j]=arr[j-1];
					j--;
					 //利用while循环找到要替换的下标j的位置，
					//然后吧当前较小的数据放到j的位置上
			}
			
			arr[j]=tmp;
		}
		
	}
	
	
	
	
	public static void ShellSort(long[]arr){
		
		if (arr.length<2) {
			return;
		}
		int h=0;
		long tmp;
		while(h<arr.length/3){
			h=3*h+1;
		}
		while (h>0) {
			
			for (int i = h; i < arr.length; i++) {
				tmp=arr[i];
				int j=i;
				while (j>h-1&&arr[j-h]>=tmp) {
					arr[j]=arr[j-h];
					j-=h;
				}
				arr[j]=tmp;
			}
			
			h=(h-1)/3;
		}
	}
	
	public static int position(long[]arr,int left,int right,long key){
		int leftPtr=left-1;
		int rightPtr=right;
		
		while(true){
			while(arr[++leftPtr]<key&&leftPtr<rightPtr);
			while(arr[--rightPtr]>key&&leftPtr<rightPtr);
			
			if (leftPtr>=rightPtr) {
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
		return  leftPtr;
		
	}
	
	//快速排序
	public static void QuickSort(long []arr,int left,int right){
		
		if (left>=right) {
			return;
		}
		if (arr.length<2) {
			return;
		}
		
		long key=arr[right];
		int pos=position(arr, left, right, key);
		QuickSort(arr, left, pos-1);
		QuickSort(arr, pos+1, right);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 long[] arr = { 0, 5, 4, 333, 91, 9,8,7,6,3,2,1-99999, 67,  78, 87, 66, 41, -11119 };
         show(arr);
        // BubbleSort5(arr);
        // BubbleSort(arr);
        // SelectSort(arr);
         //InsertSort(arr);
        // ShellSort(arr);
        // show(arr);
         QuickSort(arr,0,arr.length-1);
         show(arr);

	}

}


class Swap{
	 long a;
	 long b;
	public Swap(long a, long b) {
		super();
		this.a = a;
		this.b = b;
	}
	 public static  void  swap(long a,long b){
		 
//		 long tmp=a;
//		 a=b;
//		 b=tmp;
		 
		 a=a^b;
		 b=a^b;
		 a=a^b;
	 }
	 
	
	
	
}



