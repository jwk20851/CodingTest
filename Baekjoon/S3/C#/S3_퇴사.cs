https://www.acmicpc.net/problem/14501

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[n + 1];
            int[] t = new int[n + 1];
            int[] p = new int[n + 1];

            for (int i = 1; i <= n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                t[i] = arr[0];
                p[i] = arr[1];
            }

            for (int i = 1; i <= n; i++)
            {
                if (i - 1 + t[i] <= n)
                    dp[i - 1 + t[i]] = Math.Max(dp[i - 1 + t[i]], dp[i - 1] + p[i]);

                dp[i] = Math.Max(dp[i], dp[i - 1]);
            }

            Console.Write(dp[n]);
        }
    }
}