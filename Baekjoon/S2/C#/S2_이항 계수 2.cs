https://www.acmicpc.net/problem/11051

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

            //nCk = n!/(n-k)!k!
            //nCk + nCk+1 = n+1Ck+1
            int[,] dp = new int[n + 1, k + 1];
            for (int i = 1; i <= n; i++)
            {
                for (int j = 0; j <= k; j++)
                {
                    if (i == j || j == 0)
                        dp[i, j] = 1;
                    else
                        dp[i, j] = dp[i - 1, j - 1] % 10007 + dp[i - 1, j] % 10007;
                }
            }

            Console.WriteLine(dp[n, k] % 10007);
        }
    }
}