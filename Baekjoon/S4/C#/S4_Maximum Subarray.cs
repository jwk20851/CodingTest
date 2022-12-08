https://www.acmicpc.net/problem/10211

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            int T = int.Parse(Console.ReadLine());
            while (T-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                int[] sum = new int[n + 1];

                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int max = Int32.MinValue;
                for (int i = 1; i <= n; i++)
                {
                    sum[i] = sum[i - 1] + arr[i - 1];
                    max = Math.Max(max, sum[i]);
                }

                for (int i = 1; i <= n; i++)
                {
                    for (int j = 0; j < i; j++)
                        max = Math.Max(max, sum[i] - sum[j]);
                }
                sb.Append(max + "\n");
            }

            Console.Write(sb);
        }
    }
}