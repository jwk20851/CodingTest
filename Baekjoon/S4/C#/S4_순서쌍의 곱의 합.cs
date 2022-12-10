https://www.acmicpc.net/problem/13900

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            long[] sum = new long[n + 1];
            for (int i = 1; i <= n; i++)
                sum[i] = sum[i - 1] + arr[i - 1];

            long ans = 0;
            for (int i = 0; i < n - 1; i++)
                ans += arr[i] * (sum[n] - sum[i + 1]);

            Console.Write(ans);
        }
    }
}