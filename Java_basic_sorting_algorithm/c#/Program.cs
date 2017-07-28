using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 插入排序
{
    class Program
    {
        /// <summary>
        /// 选择排序
        /// </summary>
        /// <param name="arr"></param>
        public static void SelectSort(long []arr) {
            if (arr.Length < 2) return;
            long temp;
            int k;
            for (int i = 0; i < arr.Length-1; i++)
            {
                k = i;
                for (int j = i; j < arr.Length; j++)
                {
                    if (arr[j]<arr[k]) k = j;     
                }
                temp=arr[k];
                arr[k] = arr[i];
                arr[i] = temp;     
            }
        }

        /// <summary>
        /// 冒泡排序
        /// </summary>
        /// <param name="arr"></param>
        public static void BubbleSort(long []arr) {
            if (arr.Length < 2) return;
            long temp;
            for (int i = 0; i < arr.Length-1; i++)
            {
                for (int j = arr.Length-1; j >=1; j--)
                {
                    if (arr[j]<arr[j-1])
                    {
                        temp=arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;                  
                    }
                }    
            }
        
        }

        /// <summary>
        /// 希尔排序
        /// </summary>
        /// <param name="arr"></param>
        public static void ShellSort(long []arr) {
            int h = 0;
            //计算插入的间隔h=h*3+1
            while (h<arr.Length/3) h = h * 3 + 1;

            while (h>0)
            {
                for (int i = h; i < arr.Length; i++)
                {
                    long tmp=arr[i];
                    int j = i;
                    while (j>h-1&&arr[j-h]>=tmp)
                    {
                        arr[j]=arr[j-h];
                        j -= h;  
                    }
                    //经过while循环之后的j,指向的元素为数组中最小的元素插入
                    arr[j] = tmp;
                }
                h=(h-1)/3;  
            }
        }
        /// <summary>
        /// 插入排序
        /// </summary>
        /// <param name="arr"></param>
        public static void InsertSort(long []arr) {
            if (arr.Length<2)   return;
            long temp=0;
            for (int i = 1; i < arr.Length; i++)
            {
                temp=arr[i];
                int j = i;
                while (j>0&&arr[j-1]>=temp)
                {
                    arr[j]=arr[j-1];
                    j--;     
                }
                arr[j] = temp;    
            }
        }

        /// <summary>
        ///设置分区key,不以数组最右端为分界点 
        /// </summary>
        /// <param name="arr"></param>
        /// <param name="left"></param>
        /// <param name="right"></param>
        /// <param name="key"></param>
        public static void partition1(long[]arr,int left,int right,long key) {
            int leftPtr = left-1;
            int rightPtr = right + 1;
            long tmp;
            while (true)
            {
                while (leftPtr < rightPtr && arr[++leftPtr] < key) ;
                while (leftPtr < rightPtr && arr[--rightPtr] > key) ;

                if (leftPtr >= rightPtr)
                {
                    return;
                }
                else { 
                    tmp=arr[rightPtr];
                    arr[rightPtr]=arr[leftPtr];
                    arr[leftPtr] = tmp;
                }

               
                
            }
        
        }
        

        /// <summary>
        /// 获取分区函数，返回数组的分界点
        /// </summary>
        /// <param name="arr"></param>
        /// <param name="left"></param>
        /// <param name="right"></param>
        /// <param name="key"></param>
        /// <returns></returns>
        public static int partition(long[]arr,int left,int right,long key) {
            int leftPtr = left - 1;
            int rightPtr=right;
            long tmp = 0;
            while (true)
            {
                while (leftPtr < rightPtr && arr[++leftPtr] < key) ;
                while (leftPtr < rightPtr && arr[--rightPtr] > key) ;

                if (rightPtr<=leftPtr)
                {
                   // return -1;
                    break;
                }
                else
                {
                    tmp=arr[leftPtr];
                    arr[leftPtr]=arr[rightPtr];
                    arr[rightPtr] = tmp;
                }                             
            }
            tmp=arr[leftPtr];
            arr[leftPtr]=arr[right];
            arr[right] = tmp;
            return leftPtr;      
        }


        /// <summary>
        /// 递归调用partition方法，获得数组的分界点key
        /// </summary>
        /// <param name="arr"></param>
        /// <param name="left"></param>
        /// <param name="right"></param>
        public static void QuickSort(long []arr,int left,int right) {
            if (left>=right)
            {
                return;

            }
            else
            {
                long key =arr[right];
                 int partitions= partition(arr,left,right,key);
                //递归调用左右子数组，进行快速排序
                 QuickSort(arr,left,partitions-1);
                 QuickSort(arr,partitions+1,right);
            }
        
        }

        public static void show(long []arr) {
            Console.Write("arr=[");
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(arr[i]+" ");
                
            }
            Console.Write("]");
            Console.WriteLine();
           
        }

        static void Main(string[] args)
        {
            long[] arr = { 0, 5, 4, 333, 91, -99999, 67, 2, 78, 87, 66, 41, -11119 };
            show(arr);
           // InsertSort(arr);
            //BubbleSort(arr);
           // SelectSort(arr);
           // ShellSort(arr);
            QuickSort(arr,0,arr.Length-1);
            show(arr);
            Console.ReadKey();
        }
    }
}
