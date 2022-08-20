https://www.acmicpc.net/problem/1012

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int T, M, N, K;

        static int[,] map = new int[51, 51];
        static bool[,] visit = new bool[51, 51];
        static int cnt = 0;

        static Queue<(int, int)> q = new Queue<(int, int)>();

        static int[] addx = new int[] { -1, 1, 0, 0 };
        static int[] addy = new int[] { 0, 0, -1, 1 };

        static void Main(string[] args)
        {
            T = int.Parse(Console.ReadLine());

            for (int i = 0; i < T; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                M = arr[0];
                N = arr[1];
                K = arr[2];

                Reset();

                for (int j = 0; j < K; j++)
                {
                    int[] check = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                    map[check[1], check[0]] = 1;
                }

                for (int j = 0; j < N; j++)
                {
                    for (int k = 0; k < M; k++)
                    {
                        if (map[j, k] == 1 && visit[j, k] == false)
                        {
                            BFS(j, k);
                            cnt++;
                        }
                    }
                }

                Console.WriteLine(cnt);
            }
        }

        static void Reset()
        {
            cnt = 0;
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    map[i, j] = 0;
                    visit[i, j] = false;
                }
            }
        }

        static void BFS(int x, int y)
        {
            q.Enqueue((x, y));
            visit[x, y] = true;

            while (q.Count > 0)
            {
                var coor = q.Dequeue();
                int coorx = coor.Item1;
                int coory = coor.Item2;

                for (int i = 0; i < 4; i++)
                {
                    coorx = coor.Item1 + addx[i];
                    coory = coor.Item2 + addy[i];

                    if (coorx < 0 || coory < 0 || coorx > N || coory > M)
                        continue;

                    if (visit[coorx, coory] == true || map[coorx, coory] == 0)
                        continue;

                    visit[coorx, coory] = true;
                    q.Enqueue((coorx, coory));
                }
            }
        }
    }
}