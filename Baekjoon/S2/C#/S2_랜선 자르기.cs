https://www.acmicpc.net/problem/1654

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] lan = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] arr = new int[lan[0]];
            for (int i = 0; i < lan[0]; i++)
                arr[i] = int.Parse(Console.ReadLine());

            Array.Sort(arr);

            long left = 0;
            long right = arr[lan[0] - 1];
            long answer = 0;

            while (left <= right)
            {
                long mid = (left + right + 1) / 2;
                long cnt = 0;

                for (int i = 0; i < arr.Length; i++)
                    cnt += arr[i] / mid;

                if (cnt >= lan[1])
                {
                    answer = mid;
                    left = mid + 1;
                }
                else
                    right = mid - 1;
            }

            Console.WriteLine(answer);
        }
    }
}