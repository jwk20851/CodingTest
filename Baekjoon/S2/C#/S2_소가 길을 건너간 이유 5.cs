https://www.acmicpc.net/problem/14465

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
            int b = arr[2];

            int[] light = new int[n + 1];
            while (b-- > 0)
            {
                int num = int.Parse(Console.ReadLine());
                light[num] += 1;
            }

            int sum = 0;
            for (int i = 1; i <= k; i++)
                sum += light[i];

            int min = sum;
            for (int i = k + 1; i <= n; i++)
            {
                sum += light[i] - light[i - k];
                min = Math.Min(sum, min);
            }

            Console.WriteLine(min);
        }
    }
}