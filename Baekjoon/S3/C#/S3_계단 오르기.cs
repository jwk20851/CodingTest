https://www.acmicpc.net/problem/2579

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[301];
            int[] arr = new int[301];

            for (int i = 1; i <= n; i++)
                arr[i] = int.Parse(Console.ReadLine());

            dp[1] = arr[1];
            dp[2] = dp[1] + arr[2];

            if (n >= 3)
            {
                for (int i = 3; i <= n; i++)
                {
                    int sum1 = dp[i - 2] + arr[i];
                    int sum2 = dp[i - 3] + arr[i - 1] + arr[i];
                    dp[i] = Math.Max(sum1, sum2);
                }
            }

            Console.WriteLine(dp[n]);
        }
    }
}