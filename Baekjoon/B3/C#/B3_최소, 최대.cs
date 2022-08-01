https://www.acmicpc.net/problem/10818

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = new int[n];
            string[] str = Console.ReadLine().Split(' ');

            for (int i = 0; i < n; i++)
            {
                arr[i] = int.Parse(str[i]);
            }
            Array.Sort(arr);

            Console.WriteLine($"{arr[0]} {arr[n - 1]}");
        }
    }
}