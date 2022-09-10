https://www.acmicpc.net/problem/2805

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];

            int[] wood = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            Array.Sort(wood);
            int left = 0;
            int right = wood[wood.Length - 1];

            while (left <= right)
            {
                int mid = (left + right) / 2;
                long sum = 0;

                for (int i = 0; i < n; i++)
                {
                    if (wood[i] > mid)
                        sum += wood[i] - mid;
                }

                if (sum >= m)
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            Console.Write(right);
        }
    }
}