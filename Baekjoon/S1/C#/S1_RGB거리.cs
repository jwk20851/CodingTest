https://www.acmicpc.net/problem/1149

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[,] dp = new int[n, 3];
            int[,] rgb = new int[n, 3];

            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < 3; j++)
                    rgb[i, j] = arr[j];
            }

            dp[0, 0] = rgb[0, 0];
            dp[0, 1] = rgb[0, 1];
            dp[0, 2] = rgb[0, 2];
            for (int i = 1; i < n; i++)
            {
                dp[i, 0] = Math.Min(dp[i - 1, 1], dp[i - 1, 2]) + rgb[i, 0];
                dp[i, 1] = Math.Min(dp[i - 1, 0], dp[i - 1, 2]) + rgb[i, 1];
                dp[i, 2] = Math.Min(dp[i - 1, 0], dp[i - 1, 1]) + rgb[i, 2];
            }

            Console.Write(Math.Min(Math.Min(dp[n - 1, 0], dp[n - 1, 1]), dp[n - 1, 2]));
        }
    }
}