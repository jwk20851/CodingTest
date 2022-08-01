https://www.acmicpc.net/problem/1978

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] arrStr = Console.ReadLine().Split(' ');
            int[] arr = Array.ConvertAll(arrStr, int.Parse);

            int ctr = 0;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] < 2) continue;
                for (int j = 2; j <= Math.Sqrt(arr[i]); j++)
                {
                    if (arr[i] % j == 0)
                    {
                        arr[i] = 0;
                        break;
                    }
                }
                if (arr[i] != 0)
                    ctr++;
            }

            Console.WriteLine(ctr);
        }
    }
}