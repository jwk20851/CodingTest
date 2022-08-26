https://www.acmicpc.net/problem/13023

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static List<int>[] friend;
        static bool[] visit;
        static int cnt = 0;
        static bool check = false;

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];
            friend = new List<int>[n];

            for (int i = 0; i < n; i++)
                friend[i] = new List<int>();

            for (int i = 0; i < m; i++)
            {
                int[] line = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                friend[line[0]].Add(line[1]);
                friend[line[1]].Add(line[0]);
            }

            for (int i = 0; i < n; i++)
            {
                if (cnt < 4)
                {
                    visit = new bool[n];
                    DFS(i, 0);
                }
                else
                    break;
            }

            Console.Write((check) ? 1 : 0);
        }

        static void DFS(int idx, int cnt)
        {
            if (cnt >= 4)
            {
                check = true;
                return;
            }

            visit[idx] = true;

            foreach (int i in friend[idx])
            {
                if (!visit[i])
                {
                    DFS(i, cnt + 1);
                    visit[i] = false;
                }
            }
        }
    }
}