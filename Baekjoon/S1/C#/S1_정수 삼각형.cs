https://www.acmicpc.net/problem/1932

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[,] numArr = new int[n + 1, n + 1];
            int[,] dp = new int[n + 1, n + 1];

            for (int i = 1; i <= n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 1; j <= i; j++)
                {
                    numArr[i, j] = arr[j - 1];
                }
            }

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    dp[i, j] = Math.Max(dp[i - 1, j - 1], dp[i - 1, j]) + numArr[i, j];
                }
            }

            int max = Int32.MinValue;
            for (int i = 1; i <= n; i++)
                if (max < dp[n, i]) max = dp[n, i];

            Console.Write(max);
        }
    }
}