https://www.acmicpc.net/problem/3085

using System;

namespace Baekjoon
{
    class Program
    {
        static char[,] map;
        static int n = 0;
        static int max = 0;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            map = new char[n, n];

            for (int i = 0; i < n; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < n; j++)
                {
                    map[i, j] = str[j];
                }
            }

            Check();

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - 1; j++)
                {
                    swapX(i, j);
                    Check();
                    swapX(i, j);
                }
            }

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - 1; j++)
                {
                    swapY(j, i);
                    Check();
                    swapY(j, i);
                }
            }

            Console.WriteLine(max);
        }

        static void Check()
        {
            for (int i = 0; i < n; i++)
            {
                int cnt = 1;
                for (int j = 0; j < n - 1; j++)
                {
                    if (map[i, j] == map[i, j + 1])
                        cnt++;
                    else
                        cnt = 1;
                    max = Math.Max(max, cnt);
                }
            }

            for (int i = 0; i < n; i++)
            {
                int cnt = 1;
                for (int j = 0; j < n - 1; j++)
                {
                    if (map[j, i] == map[j + 1, i])
                        cnt++;
                    else
                        cnt = 1;
                    max = Math.Max(max, cnt);
                }
            }
        }

        static void swapX(int a, int b)
        {
            char tmp = map[a, b];
            map[a, b] = map[a, b + 1];
            map[a, b + 1] = tmp;
        }

        static void swapY(int a, int b)
        {
            char tmp = map[a, b];
            map[a, b] = map[a + 1, b];
            map[a + 1, b] = tmp;
        }
    }
}