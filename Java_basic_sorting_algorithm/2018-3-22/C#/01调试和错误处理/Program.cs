using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01调试和错误处理
{
    /// <summary>
    /// 添加断点调试
    /// </summary>
    class Program
    {

        public static  void Test() {
            int num1 = 14;
            int num2 = 45;
            Console.Write(num1+num2);
            Console.ReadKey();
        
        }

        static void Main(string[] args)
        {
            Test();

        }
    }
}
