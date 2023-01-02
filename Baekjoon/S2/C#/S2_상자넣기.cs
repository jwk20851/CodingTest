https://www.acmicpc.net/problem/1965

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
            int max = 0;

            Array.Fill(dp, 1);
            for (int i = 2; i <= n; i++)
            {
                for (int j = 1; j < i; j++)
                {
                    if (arr[i - 1] > arr[j - 1])
                        dp[i] = Math.Max(dp[i], dp[j] + 1);
                }
                max = Math.Max(max, dp[i]);
            }

            Console.Write(max);
        }
    }
}