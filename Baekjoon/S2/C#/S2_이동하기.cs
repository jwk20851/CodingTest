https://www.acmicpc.net/problem/11048

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0], m = arr[1];

            int[,] map = new int[n + 1, m + 1];
            for (int i = 1; i <= n; i++)
            {
                arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 1; j <= m; j++)
                {
                    map[i, j] = arr[j - 1];
                }
            }

            int[,] dp = new int[n + 1, m + 1];
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= m; j++)
                {
                    dp[i, j] = map[i, j] + Math.Max(dp[i - 1, j], Math.Max(dp[i, j - 1], dp[i - 1, j - 1]));
                }
            }

            Console.Write(dp[n, m]);
        }
    }
}