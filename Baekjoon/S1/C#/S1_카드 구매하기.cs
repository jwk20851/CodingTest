https://www.acmicpc.net/problem/11052

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[n + 1];
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    dp[i] = Math.Max(dp[i], dp[i - j] + arr[j - 1]);
                }
            }

            Console.WriteLine(dp[n]);
        }
    }
}