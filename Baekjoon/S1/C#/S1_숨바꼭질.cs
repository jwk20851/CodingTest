https://www.acmicpc.net/problem/1697

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static bool[] visit = new bool[100001];
        static int k = 0;
        static int answer = 0;

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            k = arr[1];

            BFS(n);

            Console.Write(answer);
        }

        static void BFS(int n)
        {
            Queue<(int, int)> q = new Queue<(int, int)>();
            q.Enqueue((n, 0));
            visit[n] = true;

            while (q.Count > 0)
            {
                var v = q.Dequeue();
                int i = v.Item1;
                int cnt = v.Item2;

                if (i == k)
                {
                    answer = cnt;
                    break;
                }

                if (check(i - 1))
                {
                    q.Enqueue((i - 1, cnt + 1));
                    visit[i - 1] = true;
                }
                if (check(i + 1))
                {
                    q.Enqueue((i + 1, cnt + 1));
                    visit[i + 1] = true;
                }
                if (check(i * 2))
                {
                    q.Enqueue((i * 2, cnt + 1));
                    visit[i] = true;
                }
            }
        }

        static bool check(int idx)
        {
            if (idx < 0 || idx > 100000 || visit[idx])
                return false;
            return true;
        }
    }
}