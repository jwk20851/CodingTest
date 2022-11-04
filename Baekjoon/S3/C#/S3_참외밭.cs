https://www.acmicpc.net/problem/2477

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int maxX = 0, maxY = 0;
            int[] length = new int[6];

            for (int i = 0; i < 6; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                if (arr[0] == 1 || arr[0] == 2)
                    maxX = Math.Max(maxX, arr[1]);
                else
                    maxY = Math.Max(maxY, arr[1]);
                length[i] = arr[1];
            }
            int big = maxX * maxY;

            int small = 1;
            int cnt = 0;
            for (int i = 0; i < 6; i++)
            {
                if (length[i] == maxX || length[i] == maxY)
                    continue;
                else
                {
                    if (cnt == 0) cnt++;
                    else if (cnt < 3)
                    {
                        small *= length[i];
                        cnt++;
                    }
                }
            }

            Console.Write((big - small) * n);
        }
    }
}