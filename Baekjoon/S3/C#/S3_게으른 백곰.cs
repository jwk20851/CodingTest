https://www.acmicpc.net/problem/10025

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

            int[] ice = new int[1000001];
            int max = 0;
            while (n-- > 0)
            {
                arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                ice[arr[1]] = arr[0];

                if (max <= arr[1])
                    max = arr[1];
            }

            int sum = 0, ans = 0;
            int d = 2 * k + 1;
            for (int i = 0; i <= max; i++)
            {
                sum += ice[i];

                if (i >= d)
                    sum -= ice[i - d];

                if (ans <= sum)
                    ans = sum;
            }

            Console.Write(ans);
        }
    }
}