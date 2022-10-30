https://www.acmicpc.net/problem/11055

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

            dp[1] = arr[0];
            int max = arr[0];
            if (n > 1)
            {
                for (int i = 2; i <= n; i++)
                {
                    dp[i] = arr[i - 1];
                    for (int j = 1; j < i; j++)
                    {
                        if (arr[i - 1] > arr[j - 1])
                            dp[i] = Math.Max(dp[j] + arr[i - 1], dp[i]);
                    }
                    max = Math.Max(max, dp[i]);
                }
            }

            Console.Write(max);
        }
    }
}