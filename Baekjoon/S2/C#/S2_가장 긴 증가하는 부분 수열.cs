https://www.acmicpc.net/problem/11053

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] dp = new int[1001];
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int answer = 0;
            for (int i = 0; i < n; i++)
            {
                dp[i] = 1;
                for (int j = 0; j < i; j++)
                {
                    if (arr[i] > arr[j])
                        dp[i] = Math.Max(dp[i], dp[j] + 1);
                }
                answer = Math.Max(answer, dp[i]);
            }

            Console.WriteLine(answer);
        }
    }
}