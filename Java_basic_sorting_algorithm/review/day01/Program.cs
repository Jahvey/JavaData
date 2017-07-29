using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 排序复习1
{
    class Program
    {
        public static void swap(ref long a,ref long b){
            long tmp=0;
            tmp = a;
            a= b;
            b = tmp;
        
        }
        /// <summary>
        /// 冒泡排序
        /// </summary>
        /// <param name="arr"></param>
        public static void BubbleSort(long []arr) {
            if (arr.Length<2)
            {
                return;
                
            }
           // long tmp=0;
            for (int i = 0; i < arr.Length-1; i++)
            {
                for (int j = arr.Length-1; j >=1; j--)
                {
                    if (arr[j]<arr[j-1])
                    {
                        swap(ref arr[j],ref arr[j-1]);  
                    }         
                }      
            }
        }

        public static void BubbleSort2(long []arr) {
            if (arr.Length<2)
            {
                return;
                
            }
            long tmp;
            for (int i = 0; i < arr.Length - 1; i++)
            {
                for (int j = 0; j < arr.Length - 1 - i; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j + 1] = tmp;

                    }


                }

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

        /// <summary>
        /// 选择排序，利用 k存储数组中最小的那个元素的下标，然后替换到最前面区，
        /// 相比冒泡排序，选择排序交换次数较小
        /// </summary>
        /// <param name="arr"></param>
        public static void SelectSort(long []arr) {
            if (arr.Length<2)
            {
                return;
                
            }
            int k;
            for (int i = 0; i < arr.Length; i++)
            {
                k = i;

                for (int j = i; j < arr.Length; j++)
                {
                    if (arr[j]<arr[k])
                    {
                        swap(ref arr[j],ref arr[k]);        
                    }
                }
                swap(ref arr[k],ref arr[i]);       
            }
        }
        /// <summary>
        /// 
        /// </summary>
        /// <param name="arr"></param>
        public static void SelectSort1(long []arr) {
            if (arr.Length<2)
            {
                return;
                
            }
           // long tmp;
            for (int i = 0; i < arr.Length; i++)
            {
                int k = i;
                for (int j = i; j < arr.Length; j++)
                {
                    if(arr[k]>arr[j])swap(ref arr[k],ref arr[j]);
                }
              //  Console.WriteLine("arr[k]="+arr[k]+",arr[i]="+arr[i]);
               // swap(ref arr[k],ref arr[i]);
                
            }
        
        
        }

        /// <summary>
        /// 希尔排序，一般的插入排序，在对数据大小分配不均的情况下使用较好 
        /// </summary>
        /// <param name="arr"></param>
        public static void ShellSort(long []arr) {
            if (arr.Length < 2) return;
            //首先找到h,计算公式h=3*h+1
            int h=0;
            while (h<arr.Length/3)
            {
                h = 3 * h + 1;
                
            }
            while (h > 0) {
                long tmp;
                for (int i = h; i < arr.Length; i++)
                {
                    tmp=arr[i];
                    int j = i;
                    while (j > h - 1 && arr[j - h] >= tmp) {
                        arr[j]=arr[j-h];
                        j -= h;
                    
                    }
                    //同理，找到最小的那个数据的下标j,与当前的数据进行交换 ，这样确保小的数据在前面
                    arr[j] = tmp;
                    
                }
                //逐步缩小步长，避免出现那种由于数据大小分配不均导致的大幅度的移动
            h=(h-1)/3;
            }
        }


    /// <summary>
    /// 插入排序，步长为1的希尔排序，效率一般，可以使用希尔排序改进
    /// </summary>
    /// <param name="arr"></param>
        public static void InsertSort(long []arr) {
            if (arr.Length < 1) return;
            long tmp;
            for (int i = 1; i < arr.Length; i++)
            {
                tmp=arr[i];
                int j = i;
                while (j>0&&arr[j-1]>=tmp)
                {
                    arr[j] = arr[j-1];
                    j--;
                    //利用while循环找到要替换的下标j的位置，然后吧当前较小的数据放到j的位置上
                }
                arr[j] = tmp;
            }
        
        }

        /// <summary>
        /// 获得插入数据的位置，即获得插入点key,再key右边的数据都比key大,在key左边的数据都比key小
        /// </summary>
        /// <param name="arr"></param>
        /// <param name="left"></param>
        /// <param name="right"></param>
        /// <param name="key"></param>
        /// <returns></returns>
        public static int position(long[] arr, int left, int right, long key) { 
            if(arr.Length<2)return -1;
            int leftPtr = left - 1;
            int rightPtr = right;
            while (true) {
                while (leftPtr < rightPtr && arr[++leftPtr] < key) ;
                while(leftPtr<rightPtr&&arr[--rightPtr]>key);
                if (rightPtr <= leftPtr) break;
                else {
                    swap(ref arr[rightPtr], ref arr[leftPtr]);
                }
              
            }

            swap(ref arr[leftPtr],ref arr[right]);
            return leftPtr;
        
        }


        /// <summary>
        /// 利用递归调用的方法，获得position传来的partition的值，递归排序
        /// </summary>
        /// <param name="arr"></param>
        /// <param name="left"></param>
        /// <param name="right"></param>
        public static void QuickSort(long[]arr,int left,int right) {

            if (left >= right) return;
            long key=arr[right];
            int partition = position(arr,left,right,key);
            QuickSort(arr,left,partition-1);
            QuickSort(arr,partition+1,right);
        }


        /// <summary>
        /// 冒泡排序的第二种写法
        /// </summary>
        /// <param name="arr"></param>
        public static void BubbleSort1(long[] arr) {
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j  = 0; j < arr.Length-i-1; j++)
                {
                    if (arr[j] > arr[j + 1]) swap(ref arr[j],ref arr[j+1]);
                    
                }
                
            }
        
        
        }


        /// <summary>
        /// 冒泡排序的第三种写法
        /// </summary>
        /// <param name="arr"></param>
        public static void BubbleSort3(long []arr) {
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = i+1; j < arr.Length; j++)
                {
                   // if (arr[i] < arr[j]) swap(ref arr[i],ref arr[j]);//从大到小

                    if (arr[i] >arr[j]) swap(ref arr[i], ref arr[j]);//从大到小
                    
                }

            }
        
        
        }

        /// <summary>
        /// 冒泡排序第四种写法
        /// </summary>
        /// <param name="arr"></param>
        public static void BubbleSort4(long []arr) {
            for (int i = 0; i < arr.Length-1; i++)
            {
                for (int j = arr.Length-1; j >0 ; j--)
                {
                    if (arr[j - 1] > arr[j]) swap(ref arr[j-1],ref arr[j]);
                    
                }
                
            }
        
        }
        /// <summary>
        /// 冒泡排序的第5种写法
        /// </summary>
        /// <param name="arr"></param>
        public static void BubbleSort5(long []arr) {
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 1; j < arr.Length-i; j++)
                {
                    if (arr[j - 1] > arr[j]) swap(ref arr[j - 1], ref arr[j]);
                    
                }
                
            }
        
        }

        static void Main(string[] args)
        {

            long[] arr = { 0, 5, 4, 333, 91, 9,8,7,6,3,2,1-99999, 67,  78, 87, 66, 41, -11119 };
            show(arr);
           //BubbleSort5(arr);
            SelectSort1(arr);
            //InsertSort(arr);
           // ShellSort(arr);
           // QuickSort(arr,0,arr.Length-1);
            show(arr);
            Console.ReadKey();
        }
    }
}
