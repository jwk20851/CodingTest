https://www.acmicpc.net/problem/2293

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int k = arr[1];

            int[] coin = new int[n];
            int[] dp = new int[k + 1];

            for (int i = 0; i < n; i++)
                coin[i] = int.Parse(Console.ReadLine());

            dp[0] = 1;
            for (int i = 0; i < n; i++)
            {
                for (int j = coin[i]; j <= k; j++)
                {
                    dp[j] += dp[j - coin[i]];
                }
            }

            Console.WriteLine(dp[k]);
        }
    }
}