https://www.acmicpc.net/problem/2565

using System;
using System.Collections.Generic;
using System.Linq;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<List<int>> li = new List<List<int>>();

            for (int i = 0; i < n; i++)
            {
                int[] item = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                li.Add(new List<int> { item[0], item[1] });
            }

            var b = li.OrderBy(x => x[0]);

            int[,] arr = new int[n, 2];
            int cnt = 0;
            foreach (var item in b)
            {
                arr[cnt, 0] = item[0];
                arr[cnt, 1] = item[1];
                cnt++;
            }

            int[] dp = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++)
            {
                dp[i] = 1;
                for (int j = 0; j < i; j++)
                {
                    if (arr[j, 1] < arr[i, 1])
                    {
                        dp[i] = Math.Max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.Max(max, dp[i]);
            }

            Console.WriteLine(n - max);
        }
    }
}