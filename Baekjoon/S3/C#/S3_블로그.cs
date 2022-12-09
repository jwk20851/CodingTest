https://www.acmicpc.net/problem/21921

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int x = arr[1];
            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int sum = 0;
            for (int i = 0; i < x; i++)
                sum += arr[i];

            int max = sum;
            int cnt = 1;
            for (int i = x; i < n; i++)
            {
                sum += arr[i] - arr[i - x];

                if (max < sum)
                {
                    max = sum;
                    cnt = 1;
                }
                else if (max == sum)
                {
                    cnt++;
                }
            }


            if (max != 0)
            {
                Console.WriteLine(max);
                Console.WriteLine(cnt);
            }
            else
            {
                Console.WriteLine("SAD");
            }
        }
    }
}