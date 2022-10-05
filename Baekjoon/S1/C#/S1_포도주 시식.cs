https://www.acmicpc.net/problem/2156

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = new int[n + 1];
            int[] dp = new int[n + 1];

            for (int i = 1; i <= n; i++)
                arr[i] = int.Parse(Console.ReadLine());

            dp[1] = arr[1];
            int max = dp[1];

            if (n > 1)
            {
                dp[2] = arr[2] + dp[1];
                max = Math.Max(dp[1], dp[2]);
            }

            for (int i = 3; i <= n; i++)
            {
                dp[i] = Math.Max(Math.Max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]), dp[i - 1]);
                if (max < dp[i])
                    max = dp[i];
            }

            Console.Write(max);
        }
    }
}