https://www.acmicpc.net/problem/1026

using System;
using System.Collections.Generic;
using System.Linq;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arrA = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] arrB = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            Array.Sort(arrA);
            Array.Reverse(arrA);
            List<int> list = new List<int>(arrB);
            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += arrA[i] * list.Min();
                list.Remove(list.Min());
            }
            Console.WriteLine(sum);
        }
    }
}