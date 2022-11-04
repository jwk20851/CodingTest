https://www.acmicpc.net/problem/2477

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int maxX = 0, maxY = 0, idxX = 0, idxY = 0;
            int[] dis = new int[6];

            for (int i = 0; i < 6; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                dis[i] = arr[1];
                if (arr[0] == 1 || arr[0] == 2)
                {
                    maxX = Math.Max(maxX, arr[1]);
                    idxX = i;
                }
                else
                {
                    maxY = Math.Max(maxY, arr[1]);
                    idxY = i;
                }
            }

            int big = maxX * maxY;
            int small = dis[(idxX + 3) % 6] * dis[(idxY + 3) % 6];

            Console.Write((big - small) * n);
        }
    }
}