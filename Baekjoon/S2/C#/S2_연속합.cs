https://www.acmicpc.net/problem/1912

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

            int maxNum = arr[0];
            for (int i = 1; i <= n; i++)
            {
                dp[i] = Math.Max(dp[i - 1] + arr[i - 1], arr[i - 1]);
                if (maxNum < dp[i])
                    maxNum = dp[i];
            }

            Console.Write(maxNum);
        }
    }
}