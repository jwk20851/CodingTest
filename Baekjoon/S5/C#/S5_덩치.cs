https://www.acmicpc.net/problem/7568

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] h = new int[n];
            int[] w = new int[n];

            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                h[i] = arr[0];
                w[i] = arr[1];
            }

            for (int i = 0; i < n; i++)
            {
                int cnt = 1;
                for (int j = 0; j < n; j++)
                {
                    if (h[i] < h[j] && w[i] < w[j])
                        cnt++;
                }
                Console.WriteLine(cnt);
            }
        }
    }
}