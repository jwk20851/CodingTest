https://www.acmicpc.net/problem/1269

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            int[] arr1 = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] arr2 = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int sum = arr1.Length;

            HashSet<int> hs = new HashSet<int>();
            for (int i = 0; i < arr1.Length; i++)
                hs.Add(arr1[i]);

            for (int i = 0; i < arr2.Length; i++)
            {
                if (hs.Contains(arr2[i]))
                    sum--;
                else
                    sum++;
            }

            Console.Write(sum);
        }
    }
}