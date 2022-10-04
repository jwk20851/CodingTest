https://www.acmicpc.net/problem/1182

using System;

namespace Beakjoon
{
    class Program
    {
        static int n, s, cnt = 0;
        static int[] arr;
        static void Main(string[] args)
        {
            int[] ns = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = ns[0];
            s = ns[1];
            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            DFS(0, 0);

            Console.Write((s == 0) ? cnt - 1 : cnt);
        }

        static void DFS(int dep, int sum)
        {
            if (dep == n)
            {
                if (sum == s) cnt++;
                return;
            }

            DFS(dep + 1, sum + arr[dep]);
            DFS(dep + 1, sum);
        }
    }
}