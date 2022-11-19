https://www.acmicpc.net/problem/2003

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = nm[0];
            int m = nm[1];
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int a = 0, b = 0, cnt = 0, sum = 0;

            while (a < n)
            {
                if (sum > m || b == n)
                    sum -= arr[a++];
                else
                    sum += arr[b++];

                if (sum == m) cnt++;
            }

            Console.Write(cnt);
        }
    }
}