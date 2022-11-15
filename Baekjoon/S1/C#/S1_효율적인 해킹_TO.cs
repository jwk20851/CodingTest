https://www.acmicpc.net/problem/1325

using System;
using System.Collections.Generic;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static List<int>[] li;
        static int n = 0, m = 0;
        static bool[] visit;
        static int[] ans;
        static void Main(string[] args)
        {
            int[] nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = nm[0];
            m = nm[1];

            ans = new int[n + 1];
            li = new List<int>[n + 1];
            for (int i = 1; i <= n; i++)
                li[i] = new List<int>();

            for (int i = 1; i <= m; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                li[arr[0]].Add(arr[1]);
            }

            for (int i = 1; i <= n; i++)
                DFS(i);

            int max = 0;
            for (int i = 1; i <= n; i++)
            {
                if (max <= ans[i])
                    max = ans[i];
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++)
            {
                if (max == ans[i])
                    sb.Append(i + " ");
            }
            Console.Write(sb);
        }

        static void DFS(int idx)
        {
            visit = new bool[n + 1];
            visit[idx] = true;

            foreach (var v in li[idx])
            {
                if (!visit[v])
                {
                    ans[v]++;
                    DFS(v);
                }
            }
        }
    }
}