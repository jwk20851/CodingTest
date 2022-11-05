https://www.acmicpc.net/problem/2630

using System;

namespace Baekjoon
{
    class Program
    {
        static int[,] map;
        static int[] cnt;
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            map = new int[n, n];
            cnt = new int[2];

            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < n; j++)
                {
                    map[i, j] = arr[j];
                }
            }

            func(0, 0, n);

            Console.Write(cnt[0] + "\n" + cnt[1]);
        }

        static void func(int x, int y, int n)
        {
            for (int i = x; i < n + x; i++)
            {
                for (int j = y; j < n + y; j++)
                {
                    if (map[i, j] != map[x, y])
                    {
                        func(x, y, n / 2);
                        func(x + n / 2, y, n / 2);
                        func(x, y + n / 2, n / 2);
                        func(x + n / 2, y + n / 2, n / 2);
                        return;
                    }
                }
            }
            cnt[map[x, y]]++;
        }
    }
}