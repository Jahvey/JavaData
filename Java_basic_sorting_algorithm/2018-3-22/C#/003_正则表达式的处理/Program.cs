using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace _003_正则表达式的处理
{
    class Program
    {
        /// <summary>
        /// 重复使用多个字符的话，需要使用小括号对正则代码进行分组
        /// (abcd){n}表示将 abcd重复n次
        /// </summary>
        static void groups()
        {


            Console.ReadKey();
        }



        /// <summary>
        /// 择1匹配  使用的符号为|,含义是或者的意思，将|符号两端的匹配条件进行或运算
        /// </summary>
        static void SelectOneMatch()
        {
            string str = "abc<<<....>>{}{}--==123456中国惊奇先生";
            string pattern = @"\d|[a-z]";//使用了|表示两者都可以表示匹配成功一个字符
            MatchCollection matchs=Regex.Matches(str, pattern);
            foreach (Match match in matchs)
            {
                Console.Write(match+" ");
                
            }
            Console.WriteLine();

            string names = "zhangsan;lisi,wangwu.zhaoliu";
            string pattern1 = @"[;,.]";
            string pattern2 = @"[;]|[.]|[,]";
            string[] arr = Regex.Split(names, pattern2);
            foreach (var item in arr)   
            {
                Console.WriteLine(item);
            }



            Console.ReadKey();
        }


        /// <summary>
        /// 重复匹配字符
        /// </summary>
        static void mutiMatchs()
        {
            string qq = "12345678";
            string qq1 = "aa123456789";
            string qq2 = "123456edgf12345";
            string pattern = @"^\d{5,12}$";//限制边界，这样中间只能是数字
            Console.WriteLine(Regex.IsMatch(qq,pattern));
            Console.WriteLine(Regex.IsMatch(qq1, pattern));
            Console.WriteLine(Regex.IsMatch(qq2, pattern));
            Console.ReadKey();




        }



        /// <summary>
        /// [^...]即中括号中的字符表示的是取除了...中字符之外的其他字符，完成匹配
        /// 
        /// </summary>
        static void RerversCharacters()
        {
            string pattern = @"[^aeou]";//表示一个字符，除了aeou之外的任意一个字符
            string s = "I am the adonai";
            string s1=Regex.Replace(s, pattern,"*");
            Console.WriteLine(s1);
            Console.ReadKey();

        }



        /// <summary>
        /// 校验只允许输入数字
        /// </summary>
        static void IsDigital()
        {
            while (true)
            {
            string s = Console.ReadLine();
            string pattern = @"^\d*$";//表示一个数字的正则匹配串
            bool isMatch = Regex.IsMatch(s, pattern);
            Console.WriteLine(isMatch);


            }


        }


        static void Test()
        {
            //@""表示不会将""内部的字符串的内容中的\n之类的转义字符进行操作，而是作为一个元字符串，直接显示出来。
            string s = @"I am adonai \t\n ";
            
            s=Regex.Replace(s,"^","begin:");
            Console.WriteLine(s);
            s = Regex.Replace(s, "$", "end.");
            Console.WriteLine(s);

            Console.ReadKey();

        }

        static void Main(string[] args)
        {
            //Test();
           // IsDigital();
            //RerversCharacters();
            //mutiMatchs();
            //SelectOneMatch();
            groups();
        }
    }
}
