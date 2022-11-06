https://www.acmicpc.net/problem/2512

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int m = int.Parse(Console.ReadLine());
            long sum = 0;

            for (int i = 0; i < n; i++)
                sum += arr[i];

            Array.Sort(arr);

            long ans = 0;
            if (sum <= m)
                Console.Write(arr[n - 1]);
            else
            {
                long left = 0;
                long right = arr[n - 1];

                while (left <= right)
                {
                    long mid = (left + right) / 2;
                    sum = 0;

                    for (int i = 0; i < n; i++)
                        sum += (arr[i] >= mid) ? mid : arr[i];

                    if (sum > m)
                        right = mid - 1;
                    else
                    {
                        left = mid + 1;
                        ans = mid;
                    }
                }

                Console.Write(ans);
            }
        }
    }
}