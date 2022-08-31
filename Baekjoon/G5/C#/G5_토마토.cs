https://www.acmicpc.net/problem/7576

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int[,] tomato;
        static int m, n;

        static Queue<(int, int)> q = new Queue<(int, int)>();
        static int[] dx = new int[] { -1, 1, 0, 0 };
        static int[] dy = new int[] { 0, 0, -1, 1 };

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            m = arr[0];
            n = arr[1];
            tomato = new int[n, m];

            for (int i = 0; i < n; i++)
            {
                int[] line = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < m; j++)
                {
                    tomato[i, j] = line[j];
                    if (tomato[i, j] == 1)
                    {
                        q.Enqueue((i, j));
                    }
                }
            }

            BFS();

            int answer = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (tomato[i, j] == 0)
                    {
                        Console.WriteLine(-1);
                        return;
                    }
                    if (answer < tomato[i, j])
                        answer = tomato[i, j];
                }
            }

            Console.WriteLine(answer - 1);
        }

        static void BFS()
        {
            while (q.Count > 0)
            {
                var v = q.Dequeue();
                int x = v.Item1;
                int y = v.Item2;

                for (int i = 0; i < 4; i++)
                {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (Check(nx, ny))
                    {
                        if (tomato[nx, ny] == 0)
                        {
                            q.Enqueue((nx, ny));
                            tomato[nx, ny] = tomato[x, y] + 1;
                        }
                    }
                }
            }
        }

        static bool Check(int nx, int ny)
        {
            if (nx >= 0 && ny >= 0 && nx < n && ny < m)
                return true;
            else
                return false;
        }
    }
}