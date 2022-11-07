https://www.acmicpc.net/problem/1780

using System;

namespace Baekjoon
{
    class Program
    {
        static int n;
        static int[] paper = new int[3];
        static int[,] map;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            map = new int[n, n];

            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < n; j++)
                {
                    map[i, j] = arr[j];
                }
            }

            func(0, 0, n);

            for (int i = 0; i < 3; i++)
                Console.WriteLine(paper[i]);
        }

        static void func(int x, int y, int num)
        {
            if (check(x, y, num))
                paper[map[x, y] + 1]++;
            else
            {
                int m = num / 3;
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        func(x + m * i, y + m * j, m);
                    }
                }
            }
        }

        static bool check(int x, int y, int num)
        {
            for (int i = x; i < x + num; i++)
            {
                for (int j = y; j < y + num; j++)
                {
                    if (map[x, y] != map[i, j])
                        return false;
                }
            }
            return true;
        }
    }
}