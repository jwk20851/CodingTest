https://www.acmicpc.net/problem/12865

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int k = arr[1];

            int[] w = new int[n + 1];
            int[] v = new int[n + 1];
            for (int i = 1; i <= n; i++)
            {
                int[] obj = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                w[i] = obj[0];
                v[i] = obj[1];
            }

            int[,] dp = new int[n + 1, k + 1];
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= k; j++)
                {
                    dp[i, j] = dp[i - 1, j];

                    if (j - w[i] >= 0)
                    {
                        dp[i, j] = Math.Max(dp[i, j], dp[i - 1, j - w[i]] + v[i]);
                    }
                }
            }

            Console.WriteLine(dp[n, k]);
        }
    }
}