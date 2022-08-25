https://www.acmicpc.net/problem/11725

using System;
using System.Collections.Generic;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static List<int>[] graph;
        static bool[] visit;
        static int[] answer;

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            graph = new List<int>[n + 1];
            visit = new bool[n + 1];
            answer = new int[n + 1];

            for (int i = 1; i <= n; i++)
                graph[i] = new List<int>();

            for (int i = 1; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                graph[arr[0]].Add(arr[1]);
                graph[arr[1]].Add(arr[0]);
            }

            DFS(1);

            StringBuilder sb = new StringBuilder();
            for (int i = 2; i <= n; i++)
                sb.Append(answer[i] + "\n");
            Console.Write(sb);
        }

        static void DFS(int idx)
        {
            visit[idx] = true;

            foreach (int i in graph[idx])
            {
                if (!visit[i])
                {
                    answer[i] = idx;
                    DFS(i);
                }
            }
        }
    }
}