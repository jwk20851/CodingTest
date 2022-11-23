https://www.acmicpc.net/problem/20922

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int k = arr[1];
            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int[] check = new int[100001];
            int a = 0, b = 0, ans = 0;
            while (a <= b && b < n)
            {
                if (check[arr[b]] < k)
                    check[arr[b++]]++;
                else if (check[arr[b]] == k)
                    check[arr[a++]]--;

                ans = Math.Max(ans, b - a);
            }

            Console.Write(ans);
        }
    }
}