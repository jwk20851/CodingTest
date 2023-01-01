https://www.acmicpc.net/problem/11722

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int[] dp = new int[n + 1];
            int ans = 0;
            for (int i = 1; i <= n; i++)
            {
                dp[i] = 1;
                for (int j = 1; j < i; j++)
                {
                    if (arr[i - 1] < arr[j - 1])
                        dp[i] = Math.Max(dp[j] + 1, dp[i]);
                }
                ans = Math.Max(dp[i], ans);
            }

            Console.Write(ans);
        }
    }
}