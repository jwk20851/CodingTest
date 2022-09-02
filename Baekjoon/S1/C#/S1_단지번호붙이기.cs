https://www.acmicpc.net/problem/2667

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int n, number;
        static int[,] map;
        static bool[,] visit;

        static int[] dx = { -1, 1, 0, 0 };
        static int[] dy = { 0, 0, -1, 1 };

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            map = new int[n, n];
            visit = new bool[n, n];

            for (int i = 0; i < n; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < str.Length; j++)
                {
                    map[i, j] = str[j] - '0';
                }
            }

            List<int> li = new List<int>();
            int cnt = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (map[i, j] == 1 && !visit[i, j])
                    {
                        number = 0;
                        DFS(i, j);
                        li.Add(number);
                        cnt++;
                    }
                }
            }

            Console.WriteLine(cnt);
            li.Sort();
            for (int i = 0; i < li.Count; i++)
                Console.WriteLine(li[i]);
        }

        static void DFS(int x, int y)
        {
            visit[x, y] = true;
            map[x, y] = 1;
            number++;

            for (int i = 0; i < 4; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (Check(nx, ny))
                {
                    if (map[nx, ny] == 1 && !visit[nx, ny])
                    {
                        DFS(nx, ny);
                    }
                }
            }
        }

        static bool Check(int nx, int ny)
        {
            if (nx >= 0 && nx < n && ny >= 0 && ny < n)
                return true;
            else
                return false;
        }
    }
}