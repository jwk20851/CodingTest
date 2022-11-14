https://www.acmicpc.net/problem/1439

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            int[] arr = new int[2];

            char tmp = str[0];
            arr[int.Parse(str[0].ToString())]++;
            for (int i = 1; i < str.Length; i++)
            {
                if (str[i] != tmp)
                {
                    arr[int.Parse(str[i].ToString())]++;
                    tmp = str[i];
                }
            }

            Console.WriteLine((arr[0] <= arr[1]) ? arr[0] : arr[1]);
        }
    }
}