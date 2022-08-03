https://www.acmicpc.net/problem/2941

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            string[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
            for (int i = 0; i < arr.Length; i++)
            {
                str = str.Replace(arr[i], "a");
            }
            Console.WriteLine(str.Length);
        }
    }
}