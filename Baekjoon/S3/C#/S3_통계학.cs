https://www.acmicpc.net/problem/2108

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = new int[n];
            int[] check = new int[8001];

            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
                sum += arr[i];
            }

            Array.Sort(arr);

            int max = 0;
            for (int i = 0; i < n; i++)
            {
                check[arr[i] + 4000]++;
                max = Math.Max(max, check[arr[i] + 4000]);
            }

            int snd = 0;
            int cnt = 0;
            for (int i = 0; i < check.Length; i++)
            {
                if (check[i] == max)
                {
                    cnt++;
                    snd = i - 4000;
                }
                if (cnt == 2)
                    break;
            }

            Console.WriteLine((int)Math.Round(sum / (double)n));
            Console.WriteLine(arr[(n / 2)]);
            Console.WriteLine(snd);
            Console.WriteLine(arr[n - 1] - arr[0]);
        }
    }
}