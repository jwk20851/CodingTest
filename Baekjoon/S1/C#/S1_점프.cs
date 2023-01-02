https://www.acmicpc.net/problem/1890

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[,] map = new int[n, n];
            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < n; j++)
                {
                    map[i, j] = arr[j];
                }
            }

            long[,] dp = new long[n, n];
            dp[0, 0] = 1;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (i == n - 1 && j == n - 1)
                        break;

                    if (i + map[i, j] < n)
                        dp[i + map[i, j], j] += dp[i, j];

                    if (j + map[i, j] < n)
                        dp[i, map[i, j] + j] += dp[i, j];
                }
            }

            Console.Write(dp[n - 1, n - 1]);
        }
    }
}