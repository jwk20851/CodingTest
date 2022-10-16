https://www.acmicpc.net/problem/15654

using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static int[] nm, arr, ans;
        static bool[] visit;
        static int n, m;
        static StringBuilder sb = new StringBuilder();

        static void Main(string[] args)
        {
            nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = nm[0];
            m = nm[1];

            visit = new bool[n + 1];
            ans = new int[m + 1];

            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            Array.Sort(arr);

            BT(0);

            Console.Write(sb);
        }

        static void BT(int dep)
        {
            if (dep == m)
            {
                for (int i = 0; i < m; i++)
                    sb.Append(ans[i] + " ");
                sb.Append("\n");
                return;
            }

            for (int i = 0; i < n; i++)
            {
                if (!visit[i])
                {
                    visit[i] = true;
                    ans[dep] = arr[i];
                    BT(dep + 1);
                    visit[i] = false;
                }
            }
        }
    }
}