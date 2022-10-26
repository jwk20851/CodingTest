https://www.acmicpc.net/problem/2559

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nk = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = nk[0];
            int k = nk[1];
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int max = Int32.MinValue;
            for (int i = 0; i <= n - k; i++)
            {
                int sum = 0;
                for (int j = i; j < i + k; j++)
                {
                    sum += arr[j];
                }
                max = Math.Max(sum, max);
            }

            Console.WriteLine(max);
        }
    }
}