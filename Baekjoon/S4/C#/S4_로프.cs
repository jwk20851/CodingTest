https://www.acmicpc.net/problem/2217

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = int.Parse(Console.ReadLine());

            Array.Sort(arr);

            int w = 0;
            for (int i = 1; i <= n; i++)
                w = Math.Max(w, arr[n - i] * i);

            Console.Write(w);
        }
    }
}