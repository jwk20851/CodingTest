https://www.acmicpc.net/problem/16493

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];

            int[] day = new int[m + 1];
            int[] page = new int[m + 1];
            for (int i = 1; i <= m; i++)
            {
                int[] obj = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                day[i] = obj[0];
                page[i] = obj[1];
            }

            int[,] dp = new int[m + 1, n + 1];
            for (int i = 1; i <= m; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    dp[i, j] = dp[i - 1, j];

                    if (j - day[i] >= 0)
                    {
                        dp[i, j] = Math.Max(dp[i, j], dp[i - 1, j - day[i]] + page[i]);
                    }
                }
            }

            Console.WriteLine(dp[m, n]);
        }
    }
}